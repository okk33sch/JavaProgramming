package practice;

public class CarpimTablosu {
    public static void main(String[] args) {
        System.out.println("\t\t\t\tMALTIPLICATION TABLE");
        System.out.println();
        for (int i = 1; i <10; i++) {
            System.out.print("\t"+i);

        }
        System.out.println();
        for (int i = 0; i <74; i++) {


            System.out.print("-");

        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            System.out.print(i+ "  |");
            for (int j = 1; j < 10; j++) {
                System.out.printf("\t%2d",i*j);

            }

            System.out.println();
        }
    }
}
