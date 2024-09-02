import java.util.*;

class ArrayAnalysis {
    int NumberOfPositive;
    int NoOfNegativeNo;
    int NoOfOddNo;
    int NoOfEvenNo;
    int NoOfZeros;

    ArrayAnalysis(int positive, int negative, int odd, int even, int Zero) {
        this.NumberOfPositive = positive;
        this.NoOfNegativeNo = negative;
        this.NoOfOddNo = odd;
        this.NoOfEvenNo = even;
        this.NoOfZeros = Zero;
    }
}

public class PrintBasedOnCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Columns You Want in Your Array: ");
        int m = sc.nextInt();
        System.out.print("Enter the Number of Rows You Want in Your Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the Elements:");
        int arr[][] = InputArrays(m, n);
        ArrayAnalysis analysis = ConditionEvaluate(arr);
        PrintArray(analysis);
        sc.close();

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

    static ArrayAnalysis ConditionEvaluate(int arr[][]) {
        int NumberOfPositive = 0;
        int NoOfNegativeNo = 0;
        int NoOfOddNo = 0;
        int NoOfEvenNo = 0;
        int NoOfZeros = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0) {
                    NumberOfPositive++;
                }
                if (arr[i][j] < 0) {
                    NoOfNegativeNo++;
                }
                if (arr[i][j] % 2 != 0) {
                    NoOfOddNo++;
                }
                if (arr[i][j] % 2 == 0) {
                    NoOfEvenNo++;
                }
                if (arr[i][j] == 0) {
                    NoOfZeros++;
                }
            }
        }
        return new ArrayAnalysis(NumberOfPositive, NoOfNegativeNo, NoOfOddNo, NoOfEvenNo, NoOfZeros);
    }

    static void PrintArray(ArrayAnalysis analysis) {
        System.out.println("The Number of Positive Numbers are: " + analysis.NumberOfPositive);
        System.out.println("The Number of Negative Numbers are: " + analysis.NoOfNegativeNo);
        System.out.println("The Number of Odd Numbers are: " + analysis.NoOfOddNo);
        System.out.println("The Number of Even Numbers are: " + analysis.NoOfEvenNo);
        System.out.println("The Number of Zeros are: " + analysis.NoOfZeros);
    }
}
