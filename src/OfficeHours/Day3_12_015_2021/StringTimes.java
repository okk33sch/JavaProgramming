package OfficeHours.Day3_12_015_2021;

import java.util.Scanner;

public class StringTimes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = input.nextLine();
        System.out.println("Enter any positive number: ");
        int num = input.nextInt();

        int count = 0;
        String sum = "";

//        while (count<num){
//            sum += word; // if you want to put space between words you should put  + " " after word on this line
//            count++;
//        }

        for (int i = 0; i < num ; i++) {
            sum += word;

        }



        System.out.println(sum);




    }
}
/*
                     (StringTimes)
                    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

                     input String : Hi  ,  input int : 2

                     output: HiHi
                  */
