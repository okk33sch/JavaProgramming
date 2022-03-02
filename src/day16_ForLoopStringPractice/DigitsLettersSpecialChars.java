package day16_ForLoopStringPractice;

import java.util.Scanner;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        System.out.println("Enter whatever you want: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //String str = "Cydeo123456School!@#$%WoodenSpoon";

        String digits = ""; // 12345
        String upperCase = "";
        String lowerCase = "";// CydeoSchoolWoodenSpoon
        String specialChars = ""; // !@#$%

        for (int i = 0; i < str.length(); i++) { //i: index number of str (0 ~ last index)
            char ch = str.charAt(i); //ch: each character that we have in str

            if(ch >= '0' && ch <= '9'){ // if the character is between '0' to '9' then it's digit
                digits += ch;
            }else if(ch >= 'A' && ch <= 'Z'){ // if the character is between 'A' to 'Z' then it's letter
                upperCase +=ch;
            }else if(ch >= 'a' && ch <= 'z'){ // if the character is between 'a' to 'z' then it's letter
                lowerCase +=ch;
            }else{  // if the character is neither digit nor letter, then it's special character
                if(ch != ' '){ // if the special character is not a space
                    specialChars += ch;
                }
            }
        }
        System.out.println("specialChars: " + specialChars);
        System.out.println("upperCase: " + upperCase);
        System.out.println("lowerCase: " + lowerCase);
        System.out.println("digits: " + digits);

        scan.close();
    }
}
