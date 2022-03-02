package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = userInput.nextInt();

        System.out.println("Enter your gender: ");
        String gender = userInput.next();

        userInput.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = userInput.nextLine();

        System.out.println("Enter your phone number: ");
        long phoneNumber = userInput.nextLong();

        System.out.println("Enter your zip code: ");
        int zipCode = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Enter your School name: ");
        String school = userInput.nextLine();

        System.out.println("Enter your City name: ");
        String city = userInput.nextLine();

        System.out.println("Enter your State name: ");
        String state = userInput.next();
        userInput.nextLine();

        System.out.println("Enter your building number: ");
        int buildingNumber = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Enter your Street name: ");
        String streetName = userInput.next();

        userInput.close();

        System.out.println("1. fullName     : " + fullName);
        System.out.println("2. age          : " + age);
        System.out.println("3. gender       : " + gender);
        System.out.println("4. phoneNumber  : " + phoneNumber);
        System.out.println("5. Address      : " + "\n" + "\t "+"\t "+"\t "+"\t " + buildingNumber + " " + streetName + "\n" + "\t "+"\t "+"\t "+"\t " + city + ", " + state + " " + zipCode);
        System.out.println("6. school name  : " + school);

    }
}


/*
1. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in sperate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name
 */
