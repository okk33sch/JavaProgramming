package day24_CustomMethod_Return.Tasks;

public class IsPalindrome {
    public static void main(String[] args) {
        boolean isPalindrome =  isPalindrome("level");
        System.out.println(isPalindrome);
    }
    public static boolean isPalindrome(String str){

        return Reverse.reverse(str).equalsIgnoreCase(str);
    }
}

/*
4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */