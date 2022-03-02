package day24_CustomMethod_Return.Tasks;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int[] arr = {35, 4, 64, 7, 8, 34, 346};

        int[] result = reverseArray(arr);

        System.out.println(Arrays.toString(result));

    }
    // 4. create a method that return the reversed array
    public static int[] reverseArray(int[] arr){

        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1, j=0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

        return reverse;
    }

}
