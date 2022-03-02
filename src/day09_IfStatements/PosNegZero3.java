package day09_IfStatements;

public class PosNegZero3 {
    public static void main(String[] args) {

        int n = 96;

        if (n > 0) {
            System.out.println(n + " is a positive number.");
        }
        if (n < 0) {
            System.out.println(n + " is a negative number.");
        }
        if (n == 0) {
            System.out.println(n + " is zero.");
        }

        System.out.println("----------------------------------------");

        boolean positive = n > 0;
        boolean negative = n < 0;

        if (positive) {
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        System.out.println("-------------------------------------");

        if(positive){
            System.out.println("Positive");
        }
        if(negative){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        // if & else statement we can NEVER apply for the tasks that requires more than two condition!!




    }
}

/*
3 farkli ihtimal olan bir durumda

1. olasilik icin if
2. olasilik icin else if
3. olasilik icin ise else kullaniliyor

ilk iki durumda parantez icerisine aciklama yapman gerekiyor
ucuncu durumda ise ilk iki durumda olmayan 3. olasilik devreye giriyor
bunlarin yurutulmesi yukaridan asagiya oldugu icin
if durumunda kosul tutarsa if calistiriliyor
else if durumunda kosul tutarsa else if calistiriliyor
else durumunda kosul tutarsa else calistiriliyor

yukarida satir satir inceleyelim

 */