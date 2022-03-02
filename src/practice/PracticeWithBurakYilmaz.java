package practice;

import java.util.Scanner;

public class PracticeWithBurakYilmaz {
    public static void main(String[] args) {

        //1. Write a program that can return the sum of even numbers between 1 to 100

/*
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);

        //int even = 0;
        for (int j = 0; j < 100; j++) {
            if(j%2==1){
                System.out.println(j);
            }

        }

        // 3. write a program that can calculate the sum of all numbers between 1 to any given number

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;

        }
        System.out.println(sum);
        4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

        Scanner scan = new Scanner(System.in);
        int factorial = scan.nextInt();
        int f = 1;

        for (int i = 1; i <= factorial; i++) {
            f = f * i;

        }
        System.out.println(f);


        //5. write a program that can retrieve the digits, letters and special characters from a string
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for (int i = 0; i <= str.length() ; i++) {
            System.out.println(str.charAt(i));

        }
        6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...

		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String digits = "";
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch >= '0' && ch  <= '9'){
                sum += ch - '0';
            }
        }
        System.out.println(sum);

	7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

					Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        for (int i = input.length()-1; i >= 0; i--) {
            System.out.print(input.charAt(i));


        }
         */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = "";
        int count = 0;

        for(int i = 0; i < str.length()-1; i++){
            str2 = str.substring(i,i+2);
            if(str2.equalsIgnoreCase("hi")){
                count+=1;
            }
        }
        System.out.println(count);

/*
System.out.println("Enter digits and strings:");
        String symbol = scan.nextLine();

        int sum = 0;

        for (int i = 0; i < symbol.length(); i++) {
            char ch = symbol.charAt(i);
            int digit = ch - 48;
            if (ch >= 48 && ch <= 57) {
                sum += digit;
            }

        }
        System.out.println(sum);


        scan.close();
    }
}
 */



    }
}


/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc

output: 1
input: abcXXXabc

output: 1

Example:

input: xxxabyyyycd

output: 3
input: xxxabyyyycd

output: 3

Example:

input: java

output: 0

my solution
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int count = 0 ;
    //WRITE YOUR CODE HERE

    for(char i = 0; i < str.length()-2; i++){
      if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)){
        count++;
      }
    }
    System.out.println(count);
    scan.close();




  }
}

Tasks:

	1. Write a program that can return the sum of even numbers between 1 to 100

	2. Write a program that can return the sum of odd numbers between 1 to 100

	3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275


	4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )


    5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!


    6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...


	7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW


	8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true


					1. print the following shape:

				* * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *


    2. Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN



    3. Write a program that can calculate the sum of all integers between 1 to 100



Tasks:
	1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123

1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative


2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4


3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200



4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create


5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true



1. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding

    2. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique


                  Tasks
	1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.


	2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop


    3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)


	4. Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
	            if the number can be divisible by 3, 5 and 15,
	                then it should only be displayed in DivisibelBy15' section

	            if the number can be divisible by 3 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy3' section

	            if the number can be divisible by 5 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy5' section

	            EX:
	                input: 100

	                Output:
	                     Divisible By 15 15 30 45 60 75 90
	                     Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
	                     Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99



    5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)


    6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
















 */
