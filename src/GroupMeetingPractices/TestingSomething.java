package GroupMeetingPractices;

public class TestingSomething {
    public static void main(String[] args) {

        String str = "Python is a nice programming language. Nice Python Python"; // str length = 20;
        str.replace("O", ""); //

        String word = "nice";

        int countWord = (str.length()   - str.replace(word, "").length())/word.length();

        System.out.println("countWord = " + countWord);


    }
}

/*
String str = "hello";
        char[] char1 = {'h','e','l','l','o'};

        //str2 = char1.charAt(length)
        str = str+" world";
        System.out.println(str);
        char h = str.charAt(1);

        int lengthOfStr = str.length(); // 4

        String str1 = str.substring(0,3);

        str = str.replace("o", "w");

        System.out.println("str = "+ str);
 */
