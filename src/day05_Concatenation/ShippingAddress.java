package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "1123B",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "22031A";


        /*
        String name = "James King";
        String buildingNumber = "1123B";
        String streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipCode = "22031A";

         */


        // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);

    }
}


/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
 */