package day12_Scanner;

import java.util.Scanner;

public class CircleMySolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value of radius: ");

        double radius = scan.nextDouble();
        double area = radius * radius * 3.14;
        double perimeter = 2 * radius * 3.14;

        //String area = scan.next();
        //String perimeter = scan.next();

        System.out.println("Area is: " + area + "\n" + "Perimeter is: "+ perimeter );
        //System.out.println("Area is: " + pi * radius * radius + "\n" + "Perimeter is: " + 2 * pi * radius);

        System.out.println("Enter true or false: ");
        boolean ask = scan.nextBoolean();


        scan.close();
    }
}
