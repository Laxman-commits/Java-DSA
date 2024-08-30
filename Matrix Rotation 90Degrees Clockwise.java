class RotationOfMatrix {

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int m = arr.length;
        int n = arr[0].length;

        // Transpose the matrix
        Transpose(arr, m, n);

        // Rotate the matrix by reversing each row
        Rotation(arr, m, n);

        // Print the rotated matrix
        Print(arr);
    }

    // Transpose the matrix 
    public static void Transpose(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Reverse each row after transposition
    public static void Rotation(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - j - 1];
                arr[i][n - j - 1] = temp;
            }
        }
    }

    // Print the matrix
    public static void Print(int arr[][]) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
