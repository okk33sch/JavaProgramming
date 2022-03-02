package day31_Constructors.Tasks;

public class MySalary {
    public static void main(String[] args) {
        SalaryCalculator salary1 = new SalaryCalculator(58,0.08,0.05,42);
        SalaryCalculator salary2 = new SalaryCalculator(42,0.08,0.00,40);
        SalaryCalculator salary3 = new SalaryCalculator(42,0.08,0.06,44);
        SalaryCalculator salary4 = new SalaryCalculator(50,0.08,0.08,40);

        System.out.println(salary1.salary());
        System.out.println(salary2.salary());
        System.out.println(salary3.salary());
        System.out.println(salary4.salary());
    }
}

/*
fix yellow

dogrudan yaz

arm orange
dogrudan yaz

md  blue
#

yaml  cyan
dogrudan yaz

tex black background
$

 */