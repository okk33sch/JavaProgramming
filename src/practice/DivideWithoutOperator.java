package practice;

import java.util.Scanner;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter first number: ");
        double num2 = scan.nextDouble();

        int value =0;
        while(num1 >= num2){
            num1 -= num2;
            value++;

        }
        System.out.println("the division is: "+value);


    }
}
