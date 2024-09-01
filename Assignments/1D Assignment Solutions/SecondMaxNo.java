public class SecondMaxNo {
    public static void main(String[] args) {
        int arr[] = { 34, 21, 54, 65, 43 ,64};
        int Max=arr[0];
        int SecondMax= arr[0];
        for (int num : arr) {
            if (Max< num) {
                Max= num;
            }
        }
        for (int num : arr) {
            if (SecondMax < num && num<Max) {
                SecondMax=num;
            }
        }

        System.out.println("Second Maximum  number of array is :"+SecondMax);
        System.out.println("Maximum  number of array is :"+Max);

    }
}
