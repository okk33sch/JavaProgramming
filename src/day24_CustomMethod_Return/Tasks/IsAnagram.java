package day24_CustomMethod_Return.Tasks;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String word1 = "koray";
        String word2 = "yarok";
        System.out.println(isAnagram(word1, word2));
    }
    public static Boolean isAnagram(String str1, String str2) {

        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        boolean isAnagram= false;
        if (Arrays.equals(arr1, arr2)) {
            isAnagram = true;
        }
        return isAnagram;
    }
}
/*
2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */