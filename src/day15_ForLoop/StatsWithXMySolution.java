package day15_ForLoop;

import java.util.Scanner;

public class StatsWithXMySolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();

        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x", "a");
            System.out.println(word);
        }else if(word.contains("X")){
            word = word.replaceFirst("X", "a");
            System.out.println(word);
        }

        /*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
    }
}
