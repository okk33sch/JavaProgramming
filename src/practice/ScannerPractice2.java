package practice;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter yor first sentence");
        String firstSentence = input.nextLine();

        System.out.println("Enter yor second sentence");
        String secondSentence = input.nextLine();

        System.out.println("firstSentence = " + firstSentence);
        System.out.println("secondSentence = " + secondSentence);


    }

}
