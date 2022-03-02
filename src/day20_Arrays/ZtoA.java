package day20_Arrays;

import java.util.Arrays;

public class ZtoA {
    public static void main(String[] args) {
        char[] letters = new char[26];  //[Z~A]


        for (int i = 0, j = 'Z'; i < letters.length ; i++, j-- ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;

        }
        System.out.println(Arrays.toString(letters));
    }
}
