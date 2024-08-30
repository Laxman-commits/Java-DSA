import java.util.Scanner;
class PrefixSumBruteForceApproach {
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

        int sum = Summition(arr , r1,c1,r2,c2);
        System.out.println("The total Summition :"+sum);

    }
    public static int  Summition(int arr[][], int r1 , int r2, int c1, int c2){
        int sum = 0;
        for(int i = r1 ; i<=c1; i++){
            for(int j =r2 ; j<=c2 ;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
