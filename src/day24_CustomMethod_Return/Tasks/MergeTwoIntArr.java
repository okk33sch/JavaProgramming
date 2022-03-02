package day24_CustomMethod_Return.Tasks;

import java.util.Arrays;

public class MergeTwoIntArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};

        System.out.println(Arrays.toString(mergeArr(arr1, arr2)));
    }
    public static int[] mergeArr(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0;

        for (int i = 0; i <= arr1.length - 1; i++) {
            arr3[i] = arr1[i];
            j++;
        }
        for (int k = 0; k < arr2.length; k++) {
            arr3[j] = arr2[k];
            j++;
        }
        return arr3;
    }
}
/*
7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}


 */
