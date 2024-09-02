import java.util.Scanner;

public class ElementsAboveSecDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Columns You Want in Your Array: ");
        int m = sc.nextInt();
        System.out.print("Enter the Number of Rows You Want in Your Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements:");
        int arr[][] = InputArrays(m, n);
        ElemAboveDiagonal(arr,m,n);
    }
    static void ElemAboveDiagonal(int arr[][],int m ,int n){
        System.out.println("The E0lements above diagonals are :");
    for(int i=0;i<=m-2;i++){
        for(int j=0;j<=n-2-i;j++){
            System.out.print(arr[i][j]);
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

