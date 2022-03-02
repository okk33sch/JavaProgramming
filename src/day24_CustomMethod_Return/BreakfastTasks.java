package day24_CustomMethod_Return;

import java.util.Locale;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("cydeo", "School"); // W.S

        System.out.println("-----------------------------------------------");

        domain("Cydeo.School@amazon.com");

        System.out.println("-----------------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email: emails) {
            domain(email);
        }

        System.out.println("-----------------------------------------------");

        nameOfMonth(11);

        System.out.println("-----------------------------------------------");

        nameOfDay(7);

        System.out.println("-----------------------------------------------");

        daysInMonth(11);

        System.out.println("-----------------------------------------------");

        ageGroups(10);
    }


    //1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName){
        String initial = firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0);
        //String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        //initial = initial.toUpperCase();
        System.out.println(initial);
    }


    //2. Create a method that can display the domain of the email
    public static void domain(String email) { // Cydeo.School@gmail.com
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        String name = "";

        if(number >= 1 && number <= 12){
                name = (number == 1)? "Jan" :(number == 2)? "Feb" :(number == 3)? "Mar":(number == 4)? "April":(number == 5)? "May"
                    :(number == 6)? "June":(number == 7)? "July":(number == 8)? "Aug":(number == 9)? "Sep":(number == 10)? "Oct"
                    :(number == 11)? "Nov": "Dec";
            }else{
                name = "Invalid";
        }
            System.out.println("Months name = " + name);
    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String name = "";

        if(number >= 1 && number <= 7){
            name = (number == 1)? "Monday" :(number == 2)? "Tuesday":(number == 3)? "Wednesday":(number == 4)? "Thursday"
                    :(number == 5)? "Friday":(number == 6)? "Saturday": "Sunday";
        }else{
            name = "Invalid";
        }
        System.out.println("Name of day: " + name);

    }


    // 5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days!");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days!");
                break;
            default:
                System.out.println("Invalid!");
        }
    }

    // 6. ageGroups
    public static void ageGroups (int age){
        String result="";
        result= (age<=120)?(age==1||age==2)?"infant":(age<=5)?"Toddler":(age<=9)?"Kid":(age<=12)?"Pre-Teen":(age<=17)?
                "Teenager":(age<=20)?"Young Adult":(age<=39)?"Adult":(age<=49)?"Young Middle-Aged Adult":
                (age<=54)?"Middle-Aged Adult":(age<=64)?"Very Young Senior Citizen":(age<=74)?"Young Senior Citizen":
                        (age<=84)?"Senior Citizen":"Old Senior":"Invalid age";
        System.out.println(result);
    }




}


/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has

6. ageGroups


 */
