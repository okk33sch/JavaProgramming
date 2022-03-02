package day11_Switch_Scanner;

public class NameOfMonth {

    public static void main(String[] args) {

        int number = 5;

        switch (number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Number");

        }


    }
}

/*
int number = 7;

        String result = (number >= 0 && number <= 9) ?
                (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 2) ? "Two"
                        : (number == 3) ? "Three" : (number == 4) ? "Four" : (number == 5) ? "Five"
                        : (number == 6) ? "Six" : (number == 7) ? "Seven" : (number == 8) ? "Eight" : "Nine"
                : "Invalid Number";

        System.out.println(result);
 */