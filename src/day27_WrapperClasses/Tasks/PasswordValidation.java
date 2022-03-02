package day27_WrapperClasses.Tasks;

public class PasswordValidation {
    public static void main(String[] args) {

        String password = "Cydeo12#";
        boolean firstCondition = false;
        boolean secondCondition = false;
        boolean thirdCondition = false;
        boolean fourthCondition = false;
        boolean fifthCondition = false;

        char[] arr = password.toCharArray();


        //1.
        if (password.length()>=8 && !password.contains(" ")){
            firstCondition = true;
        }

        //2.
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i]) ) {
                secondCondition = true;
            }
        }

        //3.
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLowerCase(arr[i]) ) {
                thirdCondition = true;
            }
        }


        //4.
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isLetterOrDigit(arr[i]) ) {
                fourthCondition = true;
            }
        }

        //5.
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i]) ) {
                fifthCondition = true;
            }
        }


        boolean isStrong = false;
        if (firstCondition==true && secondCondition==true && thirdCondition==true && fourthCondition==true && fifthCondition==true){
            isStrong = true;
        }

        System.out.println(isStrong);
    }
}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */

/*
Manas Solution
        System.out.println("Enter a new password");
        String password = new Scanner(System.in).nextLine();
        int upperCase=0, lowerCase=0, digits=0, specialChars=0;
        for (int i = 0; i < password.length(); i++) {
            char ch =  password.charAt(i);
            if (Character.isUpperCase(ch)) upperCase++;
            else if (Character.isLowerCase(ch)) lowerCase++;
            else if (Character.isDigit(ch)) digits++;
            else specialChars++;
        }
        if (password.length()>=8 && !password.contains(" ") && upperCase>=1 && lowerCase>=1 && digits>=1 && specialChars>=1){
            System.out.println(password+" is valid password type");
        } else {
            System.err.println(password+" is not a valid password type");
        }
    }
}
 */