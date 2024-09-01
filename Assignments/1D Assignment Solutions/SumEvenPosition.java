public class SumEvenPosition {
    public static void main(String[] args) {
        int arr[] = { 3, 20, 4, 69 };
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                Sum+=arr[i];
            }
        }
        System.out.println("Summition: " + Sum);
    }
}