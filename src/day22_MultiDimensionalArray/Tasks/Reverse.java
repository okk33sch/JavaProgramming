package day22_MultiDimensionalArray.Tasks;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50};

        int[] reverse= new int[numbers.length];//{50,40,30,20,10}

        //reverse[0]=numbers[numbers.length-1];

        for (int i = numbers.length - 1, j=0; i >= 0; i--,j++) {
            reverse[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}