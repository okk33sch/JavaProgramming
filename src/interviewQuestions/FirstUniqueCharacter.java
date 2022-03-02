package interviewQuestions;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String result = firstUniqueCharacter("frt4538wffrr");
        System.out.println(result);


    }

    public static String firstUniqueCharacter(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                result += ch;
                break;
            }
        }
        return result;
    }
}
