package alumni_mentor_s_tasks;

import java.util.Locale;

public class Abracadabra {
    public static void main(String[] args) {
        String word = "Let me tell you about SDET";
        frequencyOfeachChar(word);
    }

    public static void frequencyOfeachChar(String word) {

        String nonRepeat ="";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            word = word.toLowerCase();
            String character = "" + word.charAt(i);
            while (!(nonRepeat.contains(character))) {
                nonRepeat += character;
            }
        }

        for (int i = 0; i < nonRepeat.length(); i++) {
            char eachCh = nonRepeat.charAt(i);
            int frequency = 0;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(j) == eachCh){
                    frequency++;
                }
            }
            result+="" + word + "= " + "has " + frequency + " times " + eachCh + "\n";
        }
        System.out.println(result);
    }
}
//TODO Occurrences of letters in a string "abrakadabra" : Create  void method which will accept a string " abrakadabra".
// Please find the how many times each letter occurs/display in the string and print in the following format:


