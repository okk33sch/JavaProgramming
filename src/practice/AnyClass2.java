package practice;

import java.util.Scanner;

public class AnyClass2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String:");// aabccn
        String word = scan.next();
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(word.charAt(i) + "");
            }
            newWord += word.charAt(i);
        }
    }
}
