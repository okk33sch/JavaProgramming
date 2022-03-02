package day24_CustomMethod_Return.Tasks;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50, 60};
        int index = 1;
        System.out.println(Arrays.toString(removeElement(array,index)));
    }
    public static int [] removeElement(int []array , int indexNumber){

        int[] newArray = new int[array.length];

        int i = 0;int j = 1;
        for (int number : array) {
            if(number!=array[indexNumber]){
                newArray[i++]=number;
            }else{newArray[newArray.length-(j++)] = number;}
        }
        int [] removedElm = Arrays.copyOf(newArray,array.length-1);

        return removedElm;
    }
}
/*
10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */
