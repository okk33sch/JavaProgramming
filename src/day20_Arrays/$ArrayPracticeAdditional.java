package day20_Arrays;

import java.util.Arrays;

public class $ArrayPracticeAdditional {
    public static void main(String[] args) {
        char[] letters = new char[26];

        /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */


        for (char i =0, j='Z'; i <=letters.length-1 && j>='A' ; i++,j--) {
            letters[i]=j;

        }
        System.out.println(Arrays.toString(letters));
        System.out.println("-----------------------------------------------");

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters));

        /*char ch = 'A';
        for (int i = 0; i <letters.length; i++) {
            letters[i] = ch; //++;
            ch++;

        }
        System.out.println(Arrays.toString(letters));

        char[] letters2 = new char[26]; // [Z~A]

        char ch1 = 'Z';
        for (char i = 0; i > letters2.length; i++) {
            letters2[i] = ch1++;

        }
        System.out.println(Arrays.toString(letters2));*/

    }
}
