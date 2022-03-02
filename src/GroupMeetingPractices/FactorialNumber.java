package GroupMeetingPractices;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = scan.nextInt();

        long result = 1;

        for(int i = (int)num;  i >= 1 ; i-- ){
            result *= i;
        }
        System.out.println("result = " + result);

        scan.close();
    }
}

/*
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = 1;
        for (int i = n; i > 1; i--) {
                result *= i;
        }
        System.out.println(result);
    }
}

 */