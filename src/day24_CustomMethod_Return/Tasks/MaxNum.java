package day24_CustomMethod_Return.Tasks;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {35, 4, 64, 7, 8, 34, 346};

        int result = maxNumber(arr);
        System.out.println("Maximum number: " + result);

    }
    //2. create a method that can return the maximum number from an array of integers
    public static int maxNumber(int[] arr){

        int max = arr[0];
        for (int each : arr) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }
}