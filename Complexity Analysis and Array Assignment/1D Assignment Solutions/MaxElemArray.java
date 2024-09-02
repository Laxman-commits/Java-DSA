public class MaxElemArray {
    public static void main(String[] args) {
        int arr[] = { 34, 21, 54, 65, 43 };
        int Max=arr[0];
        for (int num : arr) {
            if (Max< num) {
                Max= num;
            }
        }
        System.out.println("Maximum  number of array is :"+Max);
    }
}
