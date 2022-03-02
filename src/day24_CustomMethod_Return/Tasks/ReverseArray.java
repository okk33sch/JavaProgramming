package day24_CustomMethod_Return.Tasks;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40};
        System.out.println(Arrays.toString(reverseArr(arr)));
    }
    public static int [] reverseArr(int [] arr){
        int arrRev[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arrRev[i]=arr[arrRev.length-1-i];
        }
        return arrRev;
    }
}
/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */
