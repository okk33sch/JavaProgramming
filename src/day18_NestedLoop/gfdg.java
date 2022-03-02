package day18_NestedLoop;

import java.util.Scanner;

public class gfdg {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int num = scan.nextInt();
        /*
        String result = "";

        for(int i = 80; i >= 20; i--){
            if(i%2==0){
                result += i +" ";
            }

        }
        System.out.println("*");
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name = scan.nextLine(); //Nick
        String list = name+", ";
        String a = "";
        while (true) {
            System.out.println("Do you want to enter new guest name:");
            a = scan.next();
            if (a.equalsIgnoreCase("no")) {
                break;
            } else if (a.equalsIgnoreCase("yes")) {
                System.out.println("Please enter guest name:");
                scan.nextLine();
                name = scan.nextLine();
                list += name+", ";


            }

        }
        System.out.println("Guest's list: "+list);
    }
}
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */