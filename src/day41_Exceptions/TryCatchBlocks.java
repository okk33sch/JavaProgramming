package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try{

            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");

        }




        System.out.println("Test1 Completed");

        System.out.println("------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException e){

            e.printStackTrace();

            // System.out.println( e.getMessage() );

        }


        System.out.println("Test2 Completed");

        System.out.println("--------------------------------------------------");

        System.out.println("Test4 started");


        try {
            System.out.println("Cydeo".substring(2, 0));

        }catch (RuntimeException e){

            e.printStackTrace();
        }

        System.out.println("Test4 started");

        System.out.println("--------------------------------------------------");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cydeo");

        System.out.println("--------------------------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }






}

//1pt > 1dayofeffenl /per person
//        15print 2 weeks 10 ding day
//        6 deus and 2 testers.
//        T: 1 dev 0 tester s:2 weeks
//        C= 10 pt + 2