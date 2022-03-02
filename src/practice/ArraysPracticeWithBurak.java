package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPracticeWithBurak {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = new double[8];
        System.out.println("Print 8 temp degrees: ");

        for (int i = 0; i < temps.length; i++) {
            temps[i] = scan.nextDouble();

        }
        System.out.println(Arrays.toString(temps));


        //{ scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps
        /*
        double avarage = 0;

        for(double i : temps){
            avarage += i;
        }
        System.out.println(avarage/temps.length);

         */
    }
}

/*
  double sum = 0.0;

        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }
        double average = sum/temps.length;

        System.out.println(average);
  }
}
*/