package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {
        // length, width, area, perimeter

        double length = 10.5;
        double width = 5.5;
        double primeter = (2 * (length + width));
        double area = length * width;

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("primeter = " + primeter);
        System.out.println("area = " + area);
    }
}
