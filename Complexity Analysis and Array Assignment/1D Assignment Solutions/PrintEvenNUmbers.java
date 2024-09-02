public class PrintEvenNUmbers {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,43};
        System.out.println("Even numbers of array are :");
        for(int num:arr){
            if(num%2==0){
                System.out.println(num);
            }
        }
    }
}
