package alumni_mentor_s_tasks;

import java.util.ArrayList;

public class EvenNumberArrayList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        ArrayList array = evenNumbers(arr);
        System.out.println("Odd numbers: " + array);
    }
    public static ArrayList<Integer> evenNumbers(int[] arr){
        ArrayList<Integer> even = new ArrayList<>();
        for (int each : arr) {
            if(each % 2 == 0){
                even.add(each);
            }
        }
        return even;
    }
}
//TODO: Create a method which will return an Integer ArrayList. The method will accept an int array parameter.
// Return every even number which are in the Array.

