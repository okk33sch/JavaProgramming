package practice;

import java.util.Scanner;

public class AnyClassTrial {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your String :");
        String word=scan.next();
        String newWord = "";
        for(int i=0; i < word.length(); i++) {
            int count = 0;
            if(newWord.contains("" + word.charAt(i))) {
                continue;

            }
            for(int j= 0; j < word.length(); j++) {
                if(word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(word.charAt(i) +"");
            }
            newWord += word.charAt(i);
        }
    }
}








        /*
        String str = "aabccdeef";
        String unique = "";
        String result = "";


        for (int i = 0; i < str.length(); i++) {

            if(!(unique.contains(str.charAt(i)+""))){
                //continue;
                unique += str.charAt(i) + "";
            }

        }

        System.out.println(unique);
        for (int i = 0; i < unique.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == unique.charAt(i)){
                    count++;

                }
            }
            if(count == 1 ){
                result += str.charAt(i) + "";

            }

        }

        System.out.println(result);
    }
}

         */


/*
 Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique

 */