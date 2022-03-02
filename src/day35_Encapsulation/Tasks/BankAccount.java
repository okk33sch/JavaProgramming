package day35_Encapsulation.Tasks;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Hermann Hesse", 1877, 2000000);
        System.out.println(bankAccount);
        bankAccount.deposit(1000);
        bankAccount.withdraw(2000000);
    }

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.err.println("Depositing amount must be greater thar $0");
            return;
        }
        System.out.println("$" + amount + " deposited into account " + accountNumber + ".");
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.err.println("Insufficient balance!!!");
            return;
        }
        if(amount <= 0){
            System.err.println("Withdraw amount must be greater thar $0");
            return;
        }
        System.out.println("$" + amount + " withdrawal from your account succeeded!");
        balance -= amount;
    }

    public double checkBalance(double balance){
        return checkBalance(balance);
    }

    public String toString() {
        return "BankAccount {" +
                "Account Holder Name is '" + accountHolder + '\'' +
                ", Account Number: " + accountNumber +
                ", Balance= " + balance +
                '}';
    }
}