class ATMTransaction {
    double transactionAmount;

    public ATMTransaction(double amount) {
        this.transactionAmount = amount;
    }

    public void executeTransaction() {
        System.out.println("Executing a generic ATM transaction");
    }
}

class Withdrawal extends ATMTransaction {
    public Withdrawal(double amount) {
        super(amount);
    }

    
    public void executeTransaction() {
        System.out.println("Executing a withdrawal of $" + transactionAmount);
    }
}

class Deposit extends ATMTransaction {
    public Deposit(double amount) {
        super(amount);
    }

    public void executeTransaction() {
        System.out.println("Executing a deposit of $" + transactionAmount);
    }
}

public class atm {
    public static void main(String[] args) {
        ATMTransaction withdrawal = new Withdrawal(100.0);
        ATMTransaction deposit = new Deposit(200.0);

        withdrawal.executeTransaction();
        deposit.executeTransaction();
    }
}
