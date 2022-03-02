package day22_MultiDimensionalArray.Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseTask1 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};

        int[][] reversed = new int[array.length][array[0].length];
        for (int i = array.length-1, j = 0; i >= 0; i--, j++) { // i finds the index number of 1D arrays from last to 0
            for (int k = array[i].length-1, l = 0; k >=  0; k--, l++) { // k finds the index number of elements from last to 0
                reversed[j][l] = array[i][k];
            }
        }
        System.out.println(Arrays.deepToString(reversed));
    }
}
/*
1. Write a program that can reverse two-dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */
