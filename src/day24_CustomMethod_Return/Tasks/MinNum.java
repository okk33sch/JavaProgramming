package day24_CustomMethod_Return.Tasks;

public class MinNum {
    public static void main(String[] args) {
        int[] arr = {35, 4, 64, 7, 8, 34, 346};

        int result = minNumber(arr);
        System.out.println("Minimum number: " + result);


    }
    //3. create a method that can return the minimum number from an array of integers
    public static int minNumber(int[] arr){

        int min = arr[0];
        for (int each : arr) {
            if (each < min){
                min = each;
            }
        }
        return min;
    }
}