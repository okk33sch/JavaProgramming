package day24_CustomMethod_Return.Tasks;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 2, 2};
        int num = 2;

        System.out.println(frequencyArr(arr, num));
    }
    public static int frequencyArr(int[] array, int number) {

        int frequency = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                frequency++;
            }
        }
        return frequency;
    }
}
/*
5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */

