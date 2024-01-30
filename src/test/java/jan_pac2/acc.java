package jan_pac2;

class Account {                                                      
    private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }
}

class SavingsAccount extends Account {
    private final double minimumBalance;

    public SavingsAccount(String accountNumber, double balance, double minimumBalance) {
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.withdraw(amount)) {
            if (balance >= minimumBalance) {
                return true;
            } else {
                System.out.println("Withdrawal not allowed due to minimum balance constraint.");
                balance += amount; 
                return false;
            }
        }
        return false;
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal not allowed due to overdraft limit.");
            return false;
        }
    }
}

public class acc{
    public static void main(String[] args) {
        SavingsAccount savingsAcc = new SavingsAccount("Ac314", 7000, 200);
        CurrentAccount currentAcc = new CurrentAccount("Ac314", 2000, 200);

        savingsAcc.withdraw(500);
        currentAcc.withdraw(900);

        System.out.println("Savings Account Balance: " + savingsAcc.balance); 
        System.out.println("Current Account Balance: " + currentAcc.balance); 
    }
}
