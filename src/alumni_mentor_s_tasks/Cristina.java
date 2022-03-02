package alumni_mentor_s_tasks;

public class Cristina {
    public static void main(String[] args) {
        String word = "Let me tell you about SDET";
        frequencyOfeachChar(word);
    }

    public static void frequencyOfeachChar(String word) {

        String nonRepeat ="";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            String chatacter = "" + word.charAt(i);
            while (!(nonRepeat.contains(chatacter))) {
                nonRepeat += chatacter;
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
            //01000010 01100101 01100001 01110101 01110100 01101001 01100110 01110101 01101100
        }
        System.out.println(result);
    }
}