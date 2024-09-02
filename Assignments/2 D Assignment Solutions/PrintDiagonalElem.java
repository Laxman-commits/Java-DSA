import java.util.Scanner;

public class PrintDiagonalElem {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Columns You Want in Your Array: ");
        int m = sc.nextInt();
        System.out.print("Enter the Number of Rows You Want in Your Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements:");
        int arr[][] = InputArrays(m, n);
        PrintDiagonal(arr ,m,n);
    }
    static void PrintDiagonal(int arr[][] ,int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print( arr[i][j]+" ");
                }
                if(arr[i][j]==arr[i][m-i-1] && i !=j ){
                    System.out.println(arr[i][m-i-1]);
                }
            }
        }
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
