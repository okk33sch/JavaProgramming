package turquaz_Practice;

public class HulyaHaniminSorusu2 {
    public static void main(String args[]){
        int temp, size;
        int array[] = {100, 210, 125, 63, 96, 570, 900};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //System.out.println(array[size-2]); // max number of array
        System.out.println("Second largest number is: "+array[size-2]);
    }
}
//Bi int arrayda second max nasil bulursunuz sort olmadan

