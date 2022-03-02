package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbaacc";
                    //01234567
        String result = ""; // abc
                            // i <= 7 ==== > < 8

        for (int i = 0; i <= str.length() -1 ; i++) { // i: represents all the index numbers of str (starts from 0)
            String ch = "" + str.charAt(i); // represents each Character of str

            //System.out.println(ch);

            if(!result.contains(ch)){ // if the character is not contained in the result
            result += ch; // the character will be added to the result
           }
        }
        System.out.println(result);
    }
}
