package day09_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 4;

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12;

        if (number == 2){
            System.out.println("Month that has 28 days");
        }
        if (number == 4 || number == 6 || number == 9 || number == 11){
            System.out.println("Months that has 30 days");
        }
        if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12){
            System.out.println("Months that has 31 days");
        }
    }
}


/*
3. Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2

 */