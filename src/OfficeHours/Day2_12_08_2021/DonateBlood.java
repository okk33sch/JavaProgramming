package OfficeHours.Day2_12_08_2021;
import java.util.Scanner;
public class DonateBlood {
    public static void main(String[] args) {
         /*    ( Scanner Class can be used )
                             (DonateBlood)
					        Create a program that accepts age and weight(kg) as int.
					        If age greater than or equal 18 and weight greater than 50 kg give a message
					        	EXPECTED  :  "You are eligible to donate blood"
					        If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
					        	EXPECTED  :  "You are not eligible to donate blood"
					        If age is smaller than 18 "Age must be greater than 18"
					        	EXPECTED  :  "Age must be greater than 18"
      				   */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age.");
        int age=input.nextInt();
        System.out.println("Enter your weight.");
        int weight=input.nextInt();

        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }else{
                System.out.println("You are not eligible to donate blood");
            }
        }else{
            System.out.println("Age must be greater than 18");
        }

        //    Ternary

//        System.out.println("====Ternary=====");
//
//      String result= (age>=18)?(weight>50)?"You are eligible to donate blood" : "You are not eligible to donate blood" :"Age must be greater than 18"
    }
}