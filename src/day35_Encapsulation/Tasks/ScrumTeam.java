package day35_Encapsulation.Tasks;

public class ScrumTeam {
    public static void main(String[] args) {
        ScrumTeam scrumTeam1 = new ScrumTeam("James Gosling", 1955, "Master of Java", 99999999);
        ScrumTeam scrumTeam2 = new ScrumTeam("Guido van Rossum", 1956, "Master of Python", 99999999);

        System.out.println(scrumTeam1);
        System.out.println(scrumTeam2);

        Testers testers1 = new Testers ("James Gosling", 1955, "Master of Java", 99999999);
        Testers testers2 = new Testers ("James Gosling", 1955, "Master of Java", 99999999);

        System.out.println(testers1);
        System.out.println(testers2);
    }

    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;


    public ScrumTeam(String name, int employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {

        if(employeeID <= 0){
            return;
        }

        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if(salary < 0){
            return;
        }

        this.salary = salary;
    }


    public void coding(){
        System.out.println(name + " is coding");
    }

    public void unitTesting(){
        System.out.println(name + " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name + " is fixing bugs");
    }


    public String toString() {
        return "ScrumTeam {" +
                "Name: '" + name + '\'' +
                ", Employee ID: " + employeeID +
                ", Job Title: '" + jobTitle + '\'' +
                ", Salary: $" + salary +
                '}';
    }
}

class Testers {

    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Testers(String name, int employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);

    }

    public String toString() {
        return "Tester Team {" +
                "Name: '" + name + '\'' +
                ", Employee ID: " + employeeID +
                ", Job Title: '" + jobTitle + '\'' +
                ", Salary: $" + salary +
                '}';
    }

}
