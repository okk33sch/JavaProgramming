package practice;

import java.util.Scanner;

public class Last3LettersOfSentence {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word= scan.nextLine();
        for(int i=1; i<=4;i++) {
            String lastThree = word.substring(word.length() - 3);
            System.out.println(lastThree);
        }
    }
}
