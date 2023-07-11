package chapter03;

public class 演習3_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 7, 8, 10, 15, 20};;
        int target = 4;
        int index = binarySearch(numbers, target);
        if (index > -1) {
            System.out.printf("%dは%d番目にあります。%n", target, index + 1);
        } else {
            System.out.printf("%dは存在しません。%n", target);
        }
    }
    public static void printHeader(int[] numbers) {
        System.out.print("   |");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("  %2d ", i);
        }
        System.out.println();
        System.out.print("---+");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("-----", i);
        }
        System.out.println();
        
    }
    public static void printBody(int[] numbers, int left, int mid, int right) {
        System.out.printf("   |");
        for (int i = 0; i < numbers.length; i++) {
            if (i == left && i == mid && i == right) System.out.printf("<-+->");
            else if (i == left && i == mid) System.out.printf("<-+  ");
            else if (i == mid && i == right) System.out.printf("  +->");
            else if (i == left) System.out.printf("<-   ");
            else if (i == mid)  System.out.printf("   + ");
            else if (i == right) System.out.printf("   ->");
            else System.out.print("     ");
        }
        System.out.println();
        System.out.printf("%3d|", mid);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("  %2d ", numbers[i]);
        }
        System.out.println();
    }
    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        ////////////////(debug start)//////////////////
        printHeader(numbers);
        ////////////////(debug end)////////////////////
        while (left <= right) {
            int mid = (left + right) / 2;
            ////////////////(debug start)//////////////////
            printBody(numbers, left, mid, right);
            ////////////////(debug end)////////////////////
            if (target > numbers[mid]) {
                left = mid + 1;
            } else if (target < numbers[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    /*
    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > numbers[mid]) {
                left = mid + 1;
            } else if (target < numbers[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    */
    public static double log2(int x) {
        return Math.log(x) / Math.log(2);
    }
}