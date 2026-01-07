//package Day6;
/* Create an abstract class BankAccount with abstract methods deposit(double amount) and withdraw(double amount). 
Implement two subclasses SavingsAccount and CheckingAccount with different withdrawal rules (savings has minimum balance requirement).
 */
abstract class BankAcc{
    double amount;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class SavingsAccount extends BankAcc{
     double balance;
     double minBalance=0;

    public SavingsAccount(double balance) {
       
        this.balance = balance;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied. Minimum balance requirement not met.");
        }
    }
}
class CheckingAccount extends BankAcc{
    double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
       
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance );
    }
}
public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(300);
        savings.deposit(1000);
        savings.withdraw(400); // Successful withdrawal
        savings.withdraw(1000); // Withdrawal denied

        CheckingAccount checking = new CheckingAccount(0);
        checking.deposit(500);
        checking.withdraw(200); // Successful withdrawal
    }
}
