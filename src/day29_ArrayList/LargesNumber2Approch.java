package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargesNumber2Approch {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,9,12,13,15));
        //System.out.println(list);
        int n =2;
        for (int i = 0; i <n-1 ; i++) {
            int nthLargestNum = list.get(0);
            for (Integer each : list) {
                if (each > nthLargestNum) {
                    nthLargestNum = each;
                }
            }
            list.removeAll(Arrays.asList(nthLargestNum));
        }
        int max = Collections.max(list);
        System.out.println(max);

    }
}
