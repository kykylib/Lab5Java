package liberman;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    public void deposit(double amount){
        if(amount>0) balance += amount;
    }

    public void withdraw(double amount){
        if(amount < balance){
            balance -= amount;
            return;
        }
        System.out.println("Not enough money to withdraw");
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountSummary() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
