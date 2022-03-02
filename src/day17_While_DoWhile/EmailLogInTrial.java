package day17_While_DoWhile;

import java.util.Scanner;

public class EmailLogInTrial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String user = scan.next();
        System.out.println("Enter your password: ");
        String pass = scan.next();

        System.out.println("Your account is activated.");

        System.out.println("Enter your username: ");
        String user1 = scan.next();
        System.out.println("Enter your password: ");
        String pass1 = scan.next();

        int attempt = 0;


        while (!(user.equals(user1) || pass.equals(pass1))) {
            System.err.println("Invalid attempt, please re-enter,");
            user = scan.next();
            pass = scan.next();
            attempt++;


            if (attempt > 2) {
                System.err.println("Your account is locked, please contact with the customer service");
                break;
            }

            if (user.equals(user1) && pass.equals(pass1)) {
                System.out.println("You logged in");
            }

        }






    }
}
