package day15_ForLoop;

public class AToZ {
    public static void main(String[] args) {
        for(char i = 65; i <= 90; i ++){
            System.out.print(i + " ");
            }
        System.out.println();
        for(char i = 90; i >= 65; i --){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 65; i <= 90; i ++){
            System.out.print((char)i + " ");
        }
        System.out.println();
        for(int i = 90; i >= 65; i --){
            System.out.print((char)i + " ");
        }
        System.out.println();
        for(char i = 'a'; i <= 'z'; i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        for(char i = 'z'; i >= 'a'; i--){
            System.out.print(i+ " ");
        }
        System.out.println();
        for(char i = 1; i <= 400; i++){
            System.out.print(i+ " ");
        }
    }
}
