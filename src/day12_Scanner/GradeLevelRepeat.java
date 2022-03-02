package day12_Scanner;
import java.util.Scanner;
public class GradeLevelRepeat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade");
        byte gradeLevel = scan.nextByte();
        String grade = "";

        if(gradeLevel >=1 && gradeLevel <=18){
            switch (gradeLevel){
                case 1:case 2:case 3:case 4:case 5:
                    grade = "Elementary School";
                    break;
                case 6:case 7:case 8:
                    grade = "Middle School";
                    break;
                case 9:case 10:case 11:case 12:
                    grade = "High School";
                    break;
                case 13:case 14:case 15:case 16:
                    grade = "College";
                case 17:case 18:
                    grade = "Grad School";
                    break;
            }
        }else{
            grade = "Invalid Grade";
        }
        System.out.println(grade);
    }
}
