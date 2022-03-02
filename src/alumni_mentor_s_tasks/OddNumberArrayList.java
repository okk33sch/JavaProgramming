package alumni_mentor_s_tasks;

import java.util.ArrayList;

public class OddNumberArrayList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        ArrayList array = oddNumbers(arr);
        System.out.println("Odd numbers: " + array);
    }
    public static ArrayList<Integer> oddNumbers(int[] arr){
        ArrayList<Integer> odd = new ArrayList<>();
        for (int each : arr) {
            if(each % 2 == 1){
                odd.add(each);
            }
        }
        return odd;
    }
}
// TODO Create a method which will Find the odd numbers from array and put them in the map one by one  and return as a map type