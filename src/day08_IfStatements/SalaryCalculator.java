package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 65,
            weeklyHour = 40;

        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;


        //----------------------------------------
        int salaryBeforeTax = hourlyRate * weeklyHour * 52; // salary is equal to one week salary * 52
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is = $" + salaryBeforeTax);
        System.out.println("State Tax    = $" + stateTax);
        System.out.println("Federal Tax  = $" + federalTax);
        System.out.println("Total Tax    = $" + totalTax);
        System.out.println("Net income   = $" + salaryAfterTax);





    }
}
