package turquaz_Practice;

import java.util.Arrays;

public class HulyaHaniminSorusu2Cozum5Aciklamali{

    //bu fonksiyon bir elemanın bir array in içinde olup olmadığını kontrol etmek için
    public static boolean inArray(int array[], int element) {
        //bildiğimiz for loop
        for (int i = 0; i < array.length; i++) {
            //eğer array in i elemanı element e eşit ise
            if (array[i] == element) {
                //fonksiyondan true döndür
                return true;
            }
        }
        //fonksiyon bu zamana kadar true dönmemişse eleman yoktur
        //false döndür
        return false;
    }

    //bu fonksiyon ile ilk parametrede verilen array deki en buyuk elemanı alıyoruz
    //ancak bu elemanın ikinci parametrede verilen array içinde olmamasını istiyoruz
    public static int getMax(int array[], int exceptArray[]) {
        //ilk parametredeki arraydaki max elemanı bulmak için variable
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            //eğer array in i elemanı max dan büyük ise ve ikinci parametrede verilen
            //array de bulunmuyorsa max i array[i] ye eşitle
            if (array[i] > max && !inArray(exceptArray, array[i])) {
                max = array[i];
            }
        }
        //max değeri dön
        return max;
    }

    public static void main(String args[]){
        //array imiz
        int array[] =  {10, 45, 82, 40, 90, 2, 20};
        //sort edilmiş array için boş array
        int sortedArray[] = new int[array.length];
        //ilk array in her elemanı kadar for loop
        for (int i = 0; i < array.length; i++){
            //şimdi burada olay şu.
            //array deki max değeri buluyoruz ve bunu sorted array e ekliyoruz
            //diğer loop da bir daha cagırdığımızda gene max i istiyoruz
            //ancak her defasında aynı max i vermesin diye
            //bu daha onceki buldugumuz max lar içinde olmasın istiyoruz
            //böylece tüm değerleri büyükten küçüğe sıralmış oluyoruz
            sortedArray[i] = getMax(array, sortedArray);
        }
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Second largest element is: "+ sortedArray[1]); // If you want to find n'th largest number you should assign n-1 in sortedArray[]
    }
}