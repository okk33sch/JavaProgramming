package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation_Task {
    public static void main(String[] args) {

        int price = 0;

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Which bedroom do you want to reserve?");
            String room = scan.nextLine().toLowerCase();
            while (!(room.equalsIgnoreCase("king bed") || room.equalsIgnoreCase("queen bed") ||
                    room.equalsIgnoreCase("single bed"))) {
                System.err.println("Invalid Entry.Please re-enter valid entry!");
                room = scan.nextLine().toLowerCase();
            }
            System.out.println("How many nights you are staying");
            int howManyNights = scan.nextInt();

            System.out.println("Would you like to reserve another room?  yes / no");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry.Please re-enter valid entry!");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("yes")) {
                continue;
            }
            if (answer.equals("no")) {
                if (room.equals("king bed")) {
                    price = 120;
                } else if (room.equals("queen bed")) {
                    price = 100;
                } else if (room.equals("single bed")) {
                    price = 80;
                }
            }
            System.out.println(room + " reserved for you.you will pay $" + howManyNights * price);
            break;
        }
    }
}

/*

2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */
