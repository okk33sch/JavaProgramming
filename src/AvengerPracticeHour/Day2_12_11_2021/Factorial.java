package AvengerPracticeHour.Day2_12_11_2021;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = 1;
        for (int i = n; i > 1; i--) {
                result *= i;
        }
        System.out.println(result);
    }
}
