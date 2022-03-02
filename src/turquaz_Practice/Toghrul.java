package turquaz_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Toghrul {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 1, 2, 3, 4, 5, 6, 6, 6, 7));


        for (Integer outerEach : list) {
            //        1
            int count = 0;
            for (Integer innerEach : list) {
                //         1
                if (outerEach == innerEach) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(outerEach);
                break;
            }

        }
    }
}