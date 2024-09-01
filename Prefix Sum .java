import java.util.Scanner;
class PrefixSum {
    public static void main(String[] args) {
        int arr[][]={
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        Scanner sc= new Scanner(System.in);

        System.out.println("PLEASE ENTER THE FIRST COORDINATES:" );
        int r1 =sc.nextInt();
        int c1 =sc.nextInt();

        System.out.println("PLEASE ENTER THE Second COORDINATES:" );
        int r2 =sc.nextInt();
        int c2 =sc.nextInt();

        PrefixSumRow(arr);
        PrefixSumCol(arr);


        Print(arr);

        int sum = Summition(arr , r1,c1,r2,c2);
        System.out.println("The total Summition  :"+sum);

    }
    public static void PrefixSumRow(int arr[][]){

        for(int i=0;i<arr.length;i++){
            for( int j=1; j<arr.length; j++){
                arr[i][j]+=arr[i][j-1];
            }
        }

    }
    public static void PrefixSumCol(int arr[][]){

        for(int i=1;i<arr.length;i++){
            for( int j=0; j<arr.length; j++){
                arr[i][j]+=arr[i-1][j];
            }
        }

    }
    public static void Print(int arr[][]){

        for(int i=0;i<arr.length;i++){
            for( int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int  Summition(int arr[][], int r1 , int r2, int c1, int c2){
        int sum=0 ,up=0,down=0,common=0;
        sum=arr[r2][c2];
        up=arr[r1-1][c2];
        down=arr[r2][c1-1];
        common=arr[r1-1][c1-1];
        int result = sum-up-down+common;
        return result;
    }
}
