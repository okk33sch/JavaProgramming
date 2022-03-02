package practice;

public class FizzBuzz {
    public static void main(String[] args) {

        int number = 16;

        if(number%3==0 && number%5==0){
            System.out.println("FizzBuzz");
        }else if (number%3==0){
            System.out.println("Fizz");
        }else if(number%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println("Invalid Number");

        }



    }
}


/*
1. Create a class called FizzBuzz, an integer variable named number is given to you, write a program that prints "Fizz" if the number is divisible by 3, prints "Buzz"
if the number is divisible by 5, and prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz

 */
