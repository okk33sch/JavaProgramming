package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbersWithoutOperatorsTry {
    public static void main(String[] args) {
/*
int a = 20;
        int b = 6;
        int count = 0;

        while (a >= b){
            a -= b;
            count++;
        }

        System.out.println(count + " with a remainder of " + a);

 */
        //String userName = "Cydeo";
        //String passWord = "WoodenSpoon";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = scan.next();
        System.out.println("Enter your password: ");
        String passWord = scan.next();

        for (int i = 1; i < 4; i++) {
            if(userName.equals("Cydeo") && passWord.equals("WoodenSpoon")){
                System.out.println("Logged in!!");
        }else{
                for (int j = 1; j < 4; j++) {
                    System.err.println("Invalid username or password, please re-enter your username and password again!");
                    System.err.println("Enter your username: ");
                    userName = scan.next();
                    System.err.println("Enter your password: ");
                    passWord = scan.next();

                    if(userName.equals("Cydeo") && passWord.equals("WoodenSpoon")){
                        System.out.println("Logged in!!");
                        break;
                    }else{
                        System.err.println("Your account has ben locked!!!");
                        break;

                }

                }
                scan.close();

        /*
        while(true){
            if(!(userName.equals("Cydeo") && passWord.equals("WoodenSpoon"))){
                System.out.println("Invalide entry, please re-enter.");
                System.out.println("Enter your username: ");
                userName = scan.next();
                System.out.println("Enter your password: ");
                passWord = scan.next();
            }else{
                System.out.println("Logged in");
                break;
         */
            }

        }








        /*
        2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials.
If credentials are matched, your program should print "Logged in."
If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
Nested loop: loop inside another loop (inner & outer loops)
one iteration of the outer loop, executes all the iteration of the inner loop
         */



    }
}
