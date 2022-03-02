package day51_Map;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //            bca
        //            235
        // Collections.frequency()

        //String[] arr = str.split("");

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str.split("")));

        Map<String, Integer> result = new LinkedHashMap<>(); // {b=2, c=3, a=5}

        //for (String each : arr) { // each: characters of string
        for (String each : arrayList) {

            int frequency = Collections.frequency(arrayList, each); // Enes hoca yontemi CopyRight
            //int frequency = Collections.frequency(Arrays.asList(arr), each);
            //result.put(each, Collections.frequency(Arrays.asList(arr), each));
            result.put(each, frequency);
        }
        System.out.println(result);
    }
}
