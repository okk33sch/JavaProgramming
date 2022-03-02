package practice;

import java.util.Scanner;

public class NumberEntry {

    public static void main(String[] args) {

        int smallest = 0;
        int largest = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int totalNumbers = scan.nextInt();
        for (int i = 1; i <= totalNumbers; i++) {
            System.out.print("Number " + i + ": ");
            int inputNumbers = scan.nextInt();
            if (i == 1) {
                smallest = inputNumbers;
                largest = inputNumbers;
            }
            if (inputNumbers < smallest) {
                smallest = inputNumbers;
            }
            if (inputNumbers > largest) {
                largest = inputNumbers;

            }
        }
    }
}
