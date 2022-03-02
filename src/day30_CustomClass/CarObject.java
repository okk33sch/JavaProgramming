package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Tofas";
        car1.year = 1998;
        car1.model = "Kartal";
        car1.color = "Purple";
        car1.price = 30;

        Car car2 = new Car();
        car2.brand = "Mercedes";
        car2.year = 2016;
        car2.model = "C43 AMG";
        car2.color = "Indigo";
        car2.price = 600000;

        Car car3 = new Car();
        car3.setInfo("Toyota", 2021, "Sienna", "Dark Gray", 53000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.drive();
        car3.start();
        car2.stop();

        // Car[] cars = { car1, car2, car3 };

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3)) ;

        for(Car each  : carsList){
            System.out.println( each.brand +" : "+each.price  );
        }

        System.out.println("------------------------------------------------------------");

        /*
         Recall:
            BMW: 2005 ~ 2008
            Toyota: 1995 ~ 1997
         */

        carsList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008 );
        carsList.removeIf( p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);

    }
}