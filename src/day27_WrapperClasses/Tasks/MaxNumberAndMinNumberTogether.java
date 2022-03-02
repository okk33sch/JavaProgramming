package day27_WrapperClasses.Tasks;

import java.util.ArrayList;

public class MaxNumberAndMinNumberTogether {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(30);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer each : list) {
            if(each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5

6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */