package day30_CustomClass;

public class Car {
    public String brand;
    public int year;
    public String model;
    public String color;
    public double price;

    public void setInfo(String carBrand, int carYear, String carModel, String carColor, double carPrice){
        brand = carBrand;
        year = carYear;
        model = carModel;
        color = carColor;
        price = carPrice;

    }


    public void drive(){
        System.out.println("Driving " + brand + " " + model);
    }

    public void start(){
        System.out.println("Starting " + brand + " " + model);
    }
    public void stop(){
        System.out.println("Stop " + brand + " " + model);
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year='" + year + '\'' +
                ", model=" + model +
                ", color=" + color +
                ", price='" + price + '\'' +
                '}';
    }
}
/*
Attributes:
   name, model, gender, breed, size, color
Actions:
    drive(), start(), stop(), toString(), setInfo()
 */

