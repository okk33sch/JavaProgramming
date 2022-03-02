package GroupMeetingPractices;

public class Anagram2 {
    public static void main(String[] args) {
        String str = "Cat";
    }

    static boolean isAnagram(String str, String str1) {

        // silent listen
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str.charAt(i) != str1.charAt(j)) {
                    continue;
                } else {
                    count++;
                }
            }
            if (count == str.length()) {
                return true;
            }
        }
        return false;
    }
}
        


