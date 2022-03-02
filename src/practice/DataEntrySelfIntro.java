package practice;



import java.util.Scanner;

public class DataEntrySelfIntro {

    public static void main(String[] args) {
        String Name;
        String Origin;

        System.out.println("\n\tWhat is your name?");
        Scanner Srt= new Scanner(System.in);
        Name = Srt.nextLine();
        System.out.println("\tWhere are you from?");
        Origin = Srt.nextLine();
        System.out.println("\tWhere do you live?");
        String City = Srt.nextLine();
        System.out.println("\tWhat is your favorite book?");
        String Book = Srt.nextLine();
        System.out.println("\tWhat is your favorite movie?");
        String Movie = Srt.nextLine();
        System.out.println("\t\t\t\tHello Cydeo!");
        System.out.println("\t\t\t\tMy name is "+Name);
        System.out.println("\t\t\t\tI am from "+Origin);
        System.out.println("\t\t\t\tI am currently living in "+City);
        System.out.println("\t\t\t\tMy favorite book is "+Book);
        System.out.println("\t\t\t\tMy favorite movie is "+Movie);

        System.out.println("-----------------------------------------------");


    }

}