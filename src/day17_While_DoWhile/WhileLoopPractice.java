package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();

        System.out.println("Your account is activated.");

        System.out.println("Enter your username: ");
        String username1 = scan.next();
        System.out.println("Enter your password: ");
        String password1 = scan.next();

        int attempt = 0;


        while (!((username.equals(username1) && password.equals(password1)))){
            System.err.println("Invalid username, please re-enter.");
            username1 = scan.next();
            password1 = scan.next();
            attempt++;

            if(attempt > 2){
                System.out.println("Your accound has been suspended.");
            }
            if(username.equals(username1) && password.equals(password1)){
                System.out.println("Logged in.");
            }




        }


        // username: "Cydeo"
        // password: "Cydeo123"



        // while (invalid && hasAttempts)

        //3 denemede giremezsen hesap kilitlenicek




    }
}
