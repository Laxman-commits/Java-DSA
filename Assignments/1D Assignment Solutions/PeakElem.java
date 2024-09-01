public class PeakElem {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 6, 5 };
        int PeakElem = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                PeakElem = arr[i];
            }
        }

        System.out.println("Peak Elem : " + PeakElem);
    }
}
