package practice;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string ");
        String s1=s.nextLine();
        System.out.println("Enter a character");
        String ch=s.next();

        int count=0;

        for (int i = 0; i <=s1.length()-1 ; i++) {
            String ch2=s1.charAt(i)+"";

            if (ch.equals(ch2)){


                count++;
            }

        }
        System.out.println(count);

    }
}


/*
2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */
