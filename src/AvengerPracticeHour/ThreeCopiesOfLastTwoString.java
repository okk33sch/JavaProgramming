package AvengerPracticeHour;

public class ThreeCopiesOfLastTwoString {
    public static void main(String[] args) {
        String str = "CYDEO";
        int lastIndexOfChar = str.length() -1;
        int lastSecondOfChar = str.length() -2;
        String result = ""+ str.charAt(lastSecondOfChar) + str.charAt(lastIndexOfChar);
        System.out.println(result.repeat(3));

        String result2 = str.substring(str.indexOf("E"));
        System.out.println(result2.repeat(3));

        String result3 = str.substring(3, 4+1);
        System.out.println(result3.repeat(3));

        int lastSecondOfChar2 = str.length() -2;
        String chars = str.substring(lastSecondOfChar2);
        System.out.println(chars.repeat(3));
    }
}
