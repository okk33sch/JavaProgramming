package GroupMeetingPractices;

public class UniqueCharacter {

    public static void main(String[] args) {

        String str="aabcccdfffg"; // bg
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch == each){
                    count++;
                }
            }
            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result +=ch;
            }
            if(count != 1){
                continue;
            }
            result += ch;
        }
        System.out.println(result);
    }
}
/*

 */