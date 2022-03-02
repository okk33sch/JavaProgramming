package day24_CustomMethod_Return.Tasks;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {35, 4, 64, 7, 8, 34, 346};
        int[] arr2 = {12, 2345, 123, 6457, 24, 6};

        int[] result = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));

    }
    //5.create a method that can merge two arrays and return the new array
    public static int[] mergeArrays(int[] arr1, int[] arr2){

        int[] mergedArray = new int[arr1.length+arr2.length];
        int index = 0;

        for (int each : arr1) {
            mergedArray[index] = each;
            index++;
        }
        for (int each : arr2) {
            mergedArray[index] = each;
            index++;
        }
        return mergedArray;
    }
}
