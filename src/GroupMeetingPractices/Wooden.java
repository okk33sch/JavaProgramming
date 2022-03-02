package GroupMeetingPractices;

public class Wooden {
    public static void main(String[] args) {

        String word = "wooden spoon comes from wood";
        int result = 1;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)== ' ')
                result++;


        }

        System.out.println("result = " + result);
    }
}
