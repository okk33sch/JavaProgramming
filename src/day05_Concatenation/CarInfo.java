package day05_Concatenation;

public class CarInfo {

    public static void main(String[] args) {

        int year = 2018,
                miles = 50000,
                price = 19000;

        String make = " Toyota",
                model = " Camry",
                color = "Red";

        System.out.println(year + make + model + "\n" + miles + " miles" + "\n" + color + "\n" + "$" + price);


        /*
        year
        make
        model
        miles
        color
        price

        Use concatenation to print the full info of the car in
the following format:
Year Make Model, Miles, Color, Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.

         */


    }
}
