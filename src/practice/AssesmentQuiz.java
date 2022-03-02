package practice;

public class AssesmentQuiz {
    public static void main(String[] args) {

        long s = 24l;








    }
}

// -5,0,-1


/*

int cookies = 10;
        String day = "tuesday";
switch (day){
            case "sunday":
                cookies++;
            case "monday":
                cookies +=5;
                break;
            case "tuesday":
            case "wednesday":
                cookies += 10;
            case "thursday":
                cookies += 5;
                break;
            case "friday":
                break;
            case "saturday":
                cookies--;
                break;
            default:
                cookies = 0;

        }
        System.out.println(cookies);
 */

/*
String str = "";
        int num = 20;

        switch (num){
            case 0:
                str = "C# ";
                break;
            case 10:
                str += "is ";
            case 15:
                str = "fun ";
            case 20:
                str += "java ";
            case 25:
                str += "is ";
                break;
            case 30:
                str += "fun";
                break;
            case 35:
                str = "python";
            case 40:
                str += "90";

        }
        System.out.println(str);
 */
/*
 double pi = 3.14;
        boolean b = 119 % 5 == 0;
        int num = 0;

        if (pi > 3.14 && !b){
            num += 50;
        }else {
            num -= 50;
        }

        if(b){
            num += 50;
        }

        System.out.println(num);

 */

/*
double decimal =13.142;
       int whole = decimal < 20 ? 20 : 10;

       System.out.println(whole);
 */

/*
String name = "Jimmy";
       boolean check;

       if(name == "James"){
           check = false;
       }else {
           check = true
       }

       String str = check ? "5" : "10";

       System.out.println(str == 10);

 */


/*
int check =132;
       String str = "";

       if(check % 2 == 0){
           str += check;
           if(check % 5 == 0){
               str += "132";
           }else {
               str = "500";
           }
       }else {
           str += "123";
       }
        System.out.println(str);
 */

/*
int num = 2;
       boolean b = true;

       switch (num){
           case 0:
               b = false;
           case 1:
               System.out.println(1);
           case 2:
               if(b){
                   System.out.println(2);
               }else {
                   b = false;
               }
           case 3:
               if(b){
                   System.out.println(3);
                   b = false;
               }else {
                   break;
               }
           case 4:
           System.out.println(4);
           case 5:
               if(!b){
                   break;
               }
               System.out.println(5);
       }
 */

/*
Scanner scan = new Scanner(System.in);

        int one = scan.nextInt();
        int two = scan.nextInt();

        if(one-- > two * 2){
            System.out.println("one");
        }else {
            System.out.println("two");
        }
 */

/*
String str = in.nextInt();
        int num = 0;

        switch (str){
            case "one":
                num = 1;
                break;
            case "two":
                num = 2;
                break;
            case "three":
                num = 3;
                break;

        }
        System.out.println(num);




 */

/*
Scanner userInput = new Scanner(System.in);

        byte b1 = userInput.nextByte();
        byte b2 = userInput.nextByte();

        int max = (b1 > b2) ? b1 + 2 : b2 - 4;
        System.out.println(max);
 */

/*
Scanner input = new Scanner(System.in);

        String first = input.nextLine();
        String last =  input.nextLine();
        int number = input.nextInt();

        String fullName = "";

        if(number % 2 == 0){
            fullName = first + " " + last;
        }else {
            fullName = "Not valid name";
        }

        System.out.println(fullName);
 */

/*
boolean isTall = scan.nextBoolean();
        boolean isFast = scan.nextBoolean();
        boolean isFlexible = scan.nextBoolean();
        String sport = "";

        if(isTall){
            if(isFast){
                sport = "basketball";
            }else if(isFlexible){
                sport = "gymnastcics";
            }else {
                sport = "volleyball";
            }
        }else {
            if(isFast){
                sport = "soccer";
            }else {
                sport = "tennis";
            }
        }
        System.out.println(sport);
 */