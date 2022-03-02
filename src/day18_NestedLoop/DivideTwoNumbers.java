package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first");
        int a = scan.nextInt();
        System.out.println("Enter second");
        int b = scan.nextInt();

        //int a = 50; // a = 30 - 7 = 23 - 7 = 16 - 7 = 9 - 7 = 2
        //int b = 9;

        int count = 0; // count = 1 + 1 = 2 + 1 = 3

        while (a >= b ){
            a -= b;
            count++;
        }
        System.out.println(count + " with a reminder of " + a);
    }
}
/*
Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */
