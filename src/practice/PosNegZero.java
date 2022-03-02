package practice;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int countPos=0;
        int countNeg=0;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int n1=s.nextInt();

            if (n1>0) {
                countPos++;
            }else if(n1<0) {
                countNeg++;
            }
        }
        System.out.println("countPos = " + countPos);
        System.out.println("countNeg = " + countNeg);
    }
}

/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
