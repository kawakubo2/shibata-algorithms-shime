このリポジトリを Java 21（LTS）でビルド／実行するための簡単ガイド

前提
- Windows 環境
- JDK 21 がインストールされていること（まだの場合は下記参照）

1) JDK 21 のインストール
- 推奨配布: Eclipse Temurin / Adoptium または Microsoft Build of OpenJDK
- ダウンロードとインストール手順（例）
  - https://adoptium.net/ja/ から Windows 用 JDK 21 をダウンロードしてインストール
  - インストール後、環境変数 `JAVA_HOME` をインストール先に設定（例: C:\Program Files\Eclipse Adoptium\jdk-21）
  - PowerShell を再起動して `java -version` と `javac -version` が 21 を指すことを確認

2) このリポジトリのビルド方法（推奨、簡易）
- ルートにある `scripts/compile_with_jdk21.ps1` を使うと、リポジトリ内の全 .java を再帰的にコンパイルして `bin/` に出力します。

使い方（PowerShell）

# 一時的にスクリプト実行ポリシーを緩めて実行
Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass; .\scripts\compile_with_jdk21.ps1

- うまくいけば `bin/` にクラスファイルが生成されます。
- 個別実行やデバッグは `java -cp bin <fully.qualified.MainClass>` のように実行できます。

3) 追加提案（必要に応じて）
- 将来的には Maven や Gradle を導入して依存管理と JDK 設定（toolchain）を行うことをおすすめします。
- もし希望があれば、私が `pom.xml` か `build.gradle` をこのプロジェクトに追加して、Java 21 対応のビルドを自動化します。

注意点
- このリポジトリは現状ビルド用の pom.xml / build.gradle が見つかりませんでした。従って "自動アップグレードツール"（GitHub Copilot の専用アップグレード機能など）を使ったフル自動の移行は利用できませんでした。代替として上記の手順を作成しました。

何を次に進めますか？
- (A) このままローカルで JDK21 を入れて上のスクリプトでコンパイルする
- (B) 私が `pom.xml`（Maven）または `build.gradle`（Gradle）を追加してビルドを自動化する（どちらか選択してください）
- (C) JDK のインストールを私に代わって自動化してほしい（ご利用の環境や権限に制約があれば事前に教えてください）
