package day24_CustomMethod_Return.Tasks;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word = "python";
        System.out.println(frequencyWord(sentence,word));
    }


    public static int frequencyWord(String str, String word) {

        String[] arrStr = str.split(" ");
        int count = 0;
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equalsIgnoreCase(word))
                count++;

        }
        return count;
    }
}
/*
1.  create a method named frequencyOfWord that passes two parameters:
    string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3

 */