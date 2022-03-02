package practice;

import java.util.Scanner;

public class PalindromOrNot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 digits number...");
        int abcde = scan.nextInt();

        int e =abcde%10;
        int a= abcde/10000;
        int abcd = abcde/10;
        int d=abcd%10;
        int abc =abcd/10;
        int c = abc%10;
        int ab= abc/10;
        int b = ab%10;
        if(a==e && b==d) {
            System.out.println("The number that you gave me is palindrom");
        }else {
            System.out.println("The number that you gave me not palindrom");
        }

    }
}

