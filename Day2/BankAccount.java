class BankAccount {
    String accountNumber;
    double balance;
    
    public BankAccount(String accountNumber, double initialBalance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    public void displayAccount() {
        System.out.println("Account: " + accountNumber + ", Balance: $" + balance);
    }
    
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount("ACC123", 1000.0);
            account.displayAccount();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
