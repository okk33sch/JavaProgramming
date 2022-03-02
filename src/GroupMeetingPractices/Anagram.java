package GroupMeetingPractices;

import java.util.ArrayList;

public class Anagram {

    public static void main(String[] args) {

        String str = "Cat";
    }

    static boolean isAnagram(String str, String str1){

        // Convert the two string in an array list
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        if(str.length() != str1.length()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            list1.add(str.charAt(i));
            list2.add(str1.charAt(i));
        }

        if(list1.containsAll(list2)){
            return true;
        }else{
            return true;
        }

        // We will use containsAll to determine if all member are in both arrays.
        // return the result



    }
}
