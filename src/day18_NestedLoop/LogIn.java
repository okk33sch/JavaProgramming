package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String userName = scan.next();
        System.out.println("Enter your password: ");
        String passWord = scan.next();

        if(userName.equals("Cydeo") && passWord.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else{

            for (int i = 1; i < 3; i++) {
                System.err.println("Incorrect username or password.");
                System.err.println("Enter your username: ");
                userName = scan.next();
                System.err.println("Enter your password: ");
                passWord = scan.next();

                if(userName.equals("Cydeo") && passWord.equals("WoodenSpoon")){
                    System.out.println("Logged In");
                    break;
                }
            }
            if (!(userName.equals("Cydeo") && passWord.equals("WoodenSpoon"))) {
                System.err.println("Your account is locked. Please contact support team.");
            }
        }
        scan.close();
    }
}
