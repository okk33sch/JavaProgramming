package day09_IfStatements;

public class PosNegZero2 {

    public static void main(String[] args) {

        int n = 5;

        if(n > 0){
            System.out.println(n + " is a positive number.");
        }else if(n < 0){
            System.out.println(n + " is a negative number.");
        }else{
            System.out.println(n + " is zero.");
        }
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