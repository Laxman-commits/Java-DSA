import java.util.Scanner;

public class largestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Columns You Want in Your Array: ");
        int m = sc.nextInt();
        System.out.print("Enter the Number of Rows You Want in Your Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements:");
        int arr[][] = InputArrays(m, n);
        int Largest = LargestElem(arr, m, n);
        System.out.println("Largest Element Of Array is: " + Largest);
    }

    static int LargestElem(int arr[][], int m, int n) {
        int LargestElement = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (LargestElement < arr[i][j]) {
                    LargestElement = arr[i][j];
                }
            }
        }
        return LargestElement;
    }

    static int[][] InputArrays(int m, int n) {
        int arr[][] = new int[m][n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}
