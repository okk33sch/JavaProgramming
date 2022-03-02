package OfficeHours.Day3_12_015_2021;

public class SumOfEven_Odd {
    public static void main(String[] args) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int i = 0;

        do {

        if (i % 2 == 0) {
            sumOfEven += i; // sumOfEven = 2+4+6+8+10 = 30
        } else {
            sumOfOdd += i;  // sumOfOdd = 1+3+5+7+9 = 25
        }
        i++;
    }
        while (i<=10);
            System.out.println("Sum of even numbers are: " + sumOfEven);
            System.out.println("Sum of even numbers are: " + sumOfOdd);
        }
    }

/*
                       (SumOfEven_Odd)
                     Write a program using while loop, that calculates the sum of the even numbers between 0 and 10
                   */