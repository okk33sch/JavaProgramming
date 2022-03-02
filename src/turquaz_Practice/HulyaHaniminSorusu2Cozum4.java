package turquaz_Practice;

public class HulyaHaniminSorusu2Cozum4{

    public static boolean intArray(int array[], int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static int getMax(int array[], int exceptArray[]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max && !intArray(exceptArray, array[i])) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        int array[] =  {10, 45, 82, 40, 90, 2, 20};
        int sortedArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++){
            sortedArray[i] = getMax(array, sortedArray);
        }
        //System.out.println(Arrays.toString(sortedArray));
        System.out.println("Second largest element is: "+ sortedArray[1]); // If you want to find n'th largest number you should assign n-1 in sortedArray[]
    }
}