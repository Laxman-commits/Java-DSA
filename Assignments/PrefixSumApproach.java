import java.util.*;

class PrefixSumApproach {

    public static void prefixSumMatrix(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                arr[i][j] += arr[i][j-1];
            }
        }

        for(int j=0; j<n; j++){
            for(int i=1; i<m; i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    public static int sumRegion(int[][] arr, int r1, int c1, int r2, int c2){
        int sum = arr[r2][c2];
        int up = (r1 > 0) ? arr[r1-1][c2] : 0;
        int left = (c1 > 0) ? arr[r2][c1-1] : 0;
        int repeated_region = (r1 > 0 && c1 > 0) ? arr[r1-1][c1-1] : 0;

        return sum - up - left + repeated_region;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        Scanner sc = new Scanner(System.in);

        int r1, c1, r2, c2;

        System.out.print("Enter the value of r1 coordinate: ");
        r1 = sc.nextInt();

        System.out.print("Enter the value of c1 coordinate: ");
        c1 = sc.nextInt();

        System.out.print("Enter the value of r2 coordinate: ");
        r2 = sc.nextInt();

        System.out.print("Enter the value of c2 coordinate: ");
        c2 = sc.nextInt();

        prefixSumMatrix(arr);
        int result = sumRegion(arr, r1, c1, r2, c2);
        System.out.println("Sum of elements of the given rectangle is: " + result);
    }
}
