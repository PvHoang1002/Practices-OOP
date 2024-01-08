import java.text.DecimalFormat;

public class Account {
    private double balance;
    private java.util.ArrayList<Transaction> transitionList;

    /**
     * Constructor.
     */
    public Account() {
        this.balance = 0.00;
        this.transitionList = new java.util.ArrayList<Transaction>();
    }

    /**
     * Deposit.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            this.balance += amount;
            Transaction newTransaction = new Transaction(Transaction.DEPOSIT, amount, balance);
            transitionList.add(newTransaction);
        }
    }

    /**
     * Withdraw.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance -= amount;
            Transaction newTransaction = new Transaction(Transaction.WITHDRAW, amount, balance);
            transitionList.add(newTransaction);
        }
    }

    /**
     * Add Transaction.
     */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals(Transaction.DEPOSIT) && !operation.equals(Transaction.WITHDRAW)) {
            System.out.println("Yeu cau khong hop le!");
        } else if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
    }

    /**
     * Print Transaction.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction tempTransaction = transitionList.get(i);
            DecimalFormat df = new DecimalFormat("#.00");
            if (tempTransaction.getOperation() == Transaction.DEPOSIT) {
                System.out.println("Giao dich " + (i + 1) + ": Nap tien $"
                        + df.format(tempTransaction.getAmount()) + ". So du luc nay: $"
                        + df.format(tempTransaction.getBalance()) + ".");
            }
            if (tempTransaction.getOperation() == Transaction.WITHDRAW) {
                System.out.println("Giao dich " + (i + 1) + ": Rut tien $"
                        + df.format(tempTransaction.getAmount()) + ". So du luc nay: $"
                        + df.format(tempTransaction.getBalance()) + ".");
            }
        }
    }
}
