package day11_Switch_Scanner;

public class PracticeDaysInWeekWithSwitchStatement {
    public static void main(String[] args) {

        int number = 2;
        String result = "";

        switch (number){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Thuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid entry";
        }
        System.out.println(result);

    }

}
