import java.util.Scanner;

public class MiddleElementPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m;
        do {
            System.out.print("Enter the Number of Columns You Want in Your Array (Odd number only): ");
            m = sc.nextInt();
        } while (m % 2 == 0);

        int n;
        do {
            System.out.print("Enter the Number of Rows You Want in Your Array (Odd number only): ");
            n = sc.nextInt();
        } while (n % 2 == 0);

        System.out.println("Enter the Elements:");
        int arr[][] = InputArrays(m, n);

        System.out.println("Middle Row and Column Elements:");
        MiddleElementPrin(arr, m, n);
    }

    static void MiddleElementPrin(int arr[][], int m, int n) {
        int middleRow = m / 2;
        int middleCol = n / 2;

        System.out.println("Middle Row:");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[middleRow][j] + " ");
        }
        System.out.println();

        System.out.println("Middle Column:");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i][middleCol] + " z");
        }
        System.out.println();
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
