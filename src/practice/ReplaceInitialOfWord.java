package practice;

import java.util.Scanner;

public class ReplaceInitialOfWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = scan.next();
        char first = input.charAt(0);
        String result = "";
        if (first == 'x' || first == 'X'){
            result = input.replace(first, 'a');
        }else{
            result = input;
        }
        System.out.println(result);
        scan.close();
    }
}

