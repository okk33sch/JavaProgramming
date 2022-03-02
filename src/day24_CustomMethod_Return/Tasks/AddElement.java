package day24_CustomMethod_Return.Tasks;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int num = 4;
        System.out.println(Arrays.toString(addElement(arr,num)));
    }
    public static int [] addElement(int[] array, int number) {

        int[] arrNew = new int[array.length + 1];
        arrNew[arrNew.length - 1] = number;
        for (int i = arrNew.length - 2; i >= 0; i--) {
            arrNew[i] = array[i];
        }
        return arrNew;
    }
}
/*
 6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

 */
