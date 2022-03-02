package GroupMeetingPractices;

public class Palindrom {
    public static void main(String[] args) {

        boolean result;
        String word = "popapopa";
        String bacwardsWord = "";

        // Don't repeat yourself DRY

        for (int i = word.length()-1; i >= 0 ; i--) {
            bacwardsWord = bacwardsWord+word.charAt(i);
        }


        //bacwardsWord = bacwardsWord+word.charAt(2);
        //bacwardsWord = bacwardsWord+word.charAt(1);
        //bacwardsWord = bacwardsWord+word.charAt(0);

        if(word.equals((bacwardsWord))){
            result = true;
        }else{
            result = false;
        }

        System.out.println("result = " + result);


    }
}
