package day05_Concatenation;

import javax.swing.*;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        //System.out.println("fullName = " + fullName);

        //Full name of the person is _______
        System.out.println("Full name of the person is " + fullName );

        //___ is __ years old.

        System.out.println(fullName + " is " + age + " years old.");

        //FullName is JobTitle, works at CompanyName, and FullName's salary is Salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", and " + fullName + "'s salary is $" + salary);



/*
Concantenation
 */


      /*
        Shipping Address:

            Jimmy Joe
            7925 Jones Branch Dr
            McLean, VA 20125

       */
    }
}
