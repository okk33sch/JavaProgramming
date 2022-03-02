package practice;
import java.util.*;

public class ChooseYourLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select your language preference:\n1 - English, 2 - Spanish, 3 - Turkish, 4 - Russian, 5 - French");
        int selection = scan.nextInt();

        String language = (selection==1)? "Hello, thank you for calling!":(selection==2)?"Hola, gracias por llamar!":(selection==3)?"Merhaba, aradiginiz icin tesekkkurler!":(selection==4)?"Privet, spasibo za vash zvonok":(selection==5)?"Merci ,pour votre appel":"Invalid selection";
        System.out.print(selection+": "+language);
    }
}