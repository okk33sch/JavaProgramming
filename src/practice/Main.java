package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Enter your code here:

        Scanner scan = new Scanner(System.in);

        String firstName, lastName, fullName, email, street, state, city, address, contacts;
        int age, zipCode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personalPhoneNumber;

        System.out.println("Welcome to the patient portal!" + "\n" + "Please enter your personal information" + "\n" + "Enter your first name");

        firstName = scan.nextLine();

        System.out.println("Enter your last name");
        lastName = scan.nextLine();

        System.out.println("Enter your email");
        email = scan.nextLine();

        System.out.println("Enter your street");
        street = scan.nextLine();

        System.out.println("Enter your city");
        city = scan.nextLine();

        System.out.println("Enter your state");
        state = scan.nextLine();

        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        scan.nextLine();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        scan.nextLine();

        System.out.println("Enter your age");
        age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your height");
        height = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        scan.nextLine();

        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        scan.nextLine();

        address = street + ", " + city + ", " + state + " " + zipCode;

        System.out.println("Patient personal information Full name: " + firstName + ", " + lastName + "Address: " + address);
        System.out.println("Contacts: " + "work phone number" + " - " + workPhoneNumber + ", " + "personal phone number" + " - " + personalPhoneNumber + ", " + "email: " + email + " " + "Age" + age + "Height: " + height + " " + "Weight: " + "pounds " + "Married?: " + isMarried);


    }
}