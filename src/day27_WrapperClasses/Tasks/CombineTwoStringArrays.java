package day27_WrapperClasses.Tasks;

import java.util.ArrayList;

public class CombineTwoStringArrays {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> list = new ArrayList<>();
//                              3             4
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if (i < arr1.length) {
                list.add(arr1[i]); // i : 0,1,2
            } else {
                list.add(arr2[i - arr1.length]); //
                //
            }
        }
        System.out.println(list);
    }
}
/*
4. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
