package day15_ForLoop;

import java.security.spec.RSAOtherPrimeInfo;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName = "cyDEo";
        String lastName = "SCHOOL";

       //firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                  //C                      +      ydeo   ===>  "Cydeo"

         firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
                  //    "C"                                  +      "ydeo"  ===> Cydeo

        //firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();


        //firstName = ""+ firstName.toUpperCase() + firstName.substring(1).toLowerCase();
        //lastName = "" + lastName.substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = (firstName + " " + lastName);

        System.out.println(fullName);




    }
}
