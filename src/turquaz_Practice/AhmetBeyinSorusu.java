package turquaz_Practice;

import java.util.Arrays;

// Size soru: bir array`in object index numarasini nasil bulunur?
// Object numarasi var elimde, ozellikle onun index numarasini istiyorum.

public class AhmetBeyinSorusu {
    public static void main(String[] args) {

        Integer[] array1 = {10, 45, 82, 40, 90, 2, 20};

        int getIndex = Arrays.asList(array1).indexOf(90);

        System.out.println("90 is located at " + getIndex + " index");
    }
}
