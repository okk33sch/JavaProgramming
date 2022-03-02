package day27_WrapperClasses.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Grade {
    public static void main(String[] args) {
        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        for (Integer score : scores) {
            if (score >= 0 && score <= 100) {
                if (score >= 90) {
                    gradeOfA.add(score);
                } else if (score >= 80) {
                    gradeOfB.add(score);
                } else if (score >= 70) {
                    gradeOfC.add(score);
                } else if (score >= 60) {
                    gradeOfD.add(score);
                } else {
                    gradeOfF.add(score);
                }
            }
        }

        System.out.println("Grade A -->"+gradeOfA);
        System.out.println("Grade B -->"+gradeOfB);
        System.out.println("Grade C -->"+gradeOfC);
        System.out.println("Grade D -->"+gradeOfD);
        System.out.println("Grade F -->"+gradeOfF);
        System.out.println("***********************************");
        System.out.println("Totol Grade A --->"+gradeOfA.size());
        System.out.println("Totol Grade B --->"+gradeOfB.size());
        System.out.println("Totol Grade C --->"+gradeOfC.size());
        System.out.println("Totol Grade D --->"+gradeOfD.size());
        System.out.println("Totol Grade F --->"+gradeOfF.size());

    }
}
/*
8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
 */