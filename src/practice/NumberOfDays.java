package practice;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 5;
        if(month == 2){
            System.out.println("28 days");
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("30 days");
        }else{
            System.out.println("31 days");
        }
    }
}


/*
2. Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you, write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)
 */