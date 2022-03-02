package AvengerPracticeHour;

public class WithoutFirstAndLastLetter {
    public static void main(String[] args) {
        String str = "HELLO";

        String result = str.substring(1,3+1);
        System.out.println(result);

        System.out.println(str.substring(1,str.length()-1));

        String svar = str.substring(1, str.length() -1);
        System.out.println(svar);




        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);

        str = str.replace(firstChar,' ');
        str = str.replace(lastChar,' ');
        System.out.println(str.trim());

        String str2 = "SELCUK";
        char firstChars = str2.charAt(0);  // to find the first char
        char secondChar = str2.charAt(str2.length()-1); // to find the last char
        str2 = str2.replace(firstChars, ' '); // elcuk
        str2 = str2.replace(secondChar, ' ');// elcu
        System.out.println(str2.trim());


    }
}
