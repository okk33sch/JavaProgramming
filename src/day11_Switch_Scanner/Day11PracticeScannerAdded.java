package day11_Switch_Scanner;

import java.util.Scanner;

public class Day11PracticeScannerAdded {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your amount of Salary: ");
        double salary = scan.nextDouble();
        System.out.println("Are you married? :");
        boolean isMarried = scan.nextBoolean();
        double taxRate = 0;

        if(salary >= 130000){ // false: salary < 130000;
            taxRate = 0.35;
        }else if(salary >=100000){ // false: salary < 100000;
            taxRate = 0.30;
        }else if(salary >= 80000){ // false: salary < 80000;
            taxRate = 0.25;
        }else{
            taxRate = 0.20;
        }

        if(isMarried){ // if the person is married
            taxRate -= 0.05; // subracting 5% from the original tax rate

        }

        double salaryAfterTax = salary - (salary * taxRate);

        System.out.println("Salary After Tax = " + salaryAfterTax);

        /*
Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

 */



    }
}

/*
if(num >= 0 && num <=9){
            if(num == 0){
                result = "Zero";
            }else if(num == 1){
                result = "One";
            }else if(num == 2){
                result = "Two";
            }else if(num == 3){
                result = "Three";
            }else if(num == 4){
                result = "Four";
            }else if(num == 5){
                result = "Five";
            }else if(num == 6){
                result = "Six";
            }else if(num == 7){
                result = "Seven";
            }else if(num == 8){
                result = "Eight";
            }else{
                result = "Nine";
            }
        }else{
            result = "Invalid number";
        }
        System.out.println(result);
 */
