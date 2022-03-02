package day04_Variables;

public class Square {

    public static void main(String[] args) {
        //DataType variableName = Data;

        double side = 8.5; //double for decimels only.
        double primeter = (4 * side);
        double area = (side * side);

        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("primeter = " + primeter);

    }
}


/*
1. Create a class named Square, write a program that can calculate the area & perimeter of any given square
						side (3.5)
						area = side * side;
						perimeter = 4 * side
 */