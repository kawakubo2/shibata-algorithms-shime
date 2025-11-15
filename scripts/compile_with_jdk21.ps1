# コンパイルスクリプト: すべての .java を再帰的に探して bin/ に出力します
# 使い方: PowerShell で
#   Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass; .\scripts\compile_with_jdk21.ps1
# 前提: JAVA_HOME が JDK 21 を指していること

param(
    [string]$JavacPath = "$env:JAVA_HOME\bin\javac",
    [int]$Release = 21
)

if (-not (Test-Path $JavacPath)) {
    Write-Host "ERROR: javac が見つかりません。JAVA_HOME を JDK 21 のパスに設定してください。例:`$env:JAVA_HOME = 'C:\\Program Files\\Eclipse Adoptium\\jdk-21'`" -ForegroundColor Red
    exit 1
}

Write-Host "Using javac: $JavacPath"
Write-Host "Collecting .java files..."
$files = Get-ChildItem -Path . -Recurse -Filter *.java | Where-Object { -not ($_.FullName -like "*bin*") } | Select-Object -ExpandProperty FullName

if ($files.Count -eq 0) {
    Write-Host "No .java files found." -ForegroundColor Yellow
    exit 0
}

$binDir = Join-Path -Path (Get-Location) -ChildPath "bin"
if (-not (Test-Path $binDir)) { New-Item -ItemType Directory -Path $binDir | Out-Null }

# コンパイルを実行
$javacCmd = "`"$JavacPath`" -d `"$binDir`" --release $Release " + ($files -join ' ')
Write-Host "Running: $javacCmd"

# 実行（呼び出しでエラーコードをそのまま返す）
& $JavacPath -d $binDir --release $Release @files

if ($LASTEXITCODE -eq 0) {
    Write-Host "Compilation succeeded. Classes are in: $binDir" -ForegroundColor Green
} else {
    Write-Host "Compilation failed with exit code $LASTEXITCODE" -ForegroundColor Red
}
