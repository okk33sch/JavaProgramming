package turquaz_Practice;

public class HulyaHaniminSorusu2Cozum2 {
    public static void main(String[] args) {
        int max = 0;
        int secondMax = 0;
        int array[] =  {10, 45, 82, 40, 90, 2, 20};

        for(int i = 0; i<array.length; i++ ){
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
            }
        }
        System.out.println("Largest number is: " + max);
        System.out.println("Third second largest number is:: " + secondMax);
    }
}


