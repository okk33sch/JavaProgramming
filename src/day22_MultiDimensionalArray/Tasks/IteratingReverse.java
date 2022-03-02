package day22_MultiDimensionalArray.Tasks;

import java.util.Arrays;

public class IteratingReverse {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3}, {4,5,6,7,8}, {9,10,11,12}};

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
