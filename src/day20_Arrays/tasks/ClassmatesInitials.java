package day20_Arrays.tasks;

public class ClassmatesInitials {
    public static void main(String[] args) {
        String[] classMates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};

        for (int i = 0; i < classMates.length; i++) {
            String initial = classMates[i].charAt(0) + "." + classMates[i].charAt(classMates[i].indexOf(" ") + 1);
            System.out.println(initial);
        }
    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
