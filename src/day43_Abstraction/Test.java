package day43_Abstraction;

public class Test {

        static int a = 50;
        public static void main(String[] args){ //line 2
            a = 100;

            try{
                a = 200;
            }catch(Exception e){
                a = 300;
            }finally{
                a = 400;
            }
            System.out.println(a);
        }
        static{
            a = 500;
        }
    }

