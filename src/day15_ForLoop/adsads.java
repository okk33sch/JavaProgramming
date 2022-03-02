package day15_ForLoop;

import java.util.Scanner;

public class adsads {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();

        if(word.startsWith("x")){
            System.out.println(word.replaceFirst("x", "a"));
        }

    }
}
