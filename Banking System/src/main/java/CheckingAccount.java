public class CheckingAccount extends Account {
    /**
     * Constructor.
     */
    public CheckingAccount() {

    }

    /**
     * Constructor.
     */
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Withdraw.
     */
    @Override
    public void withdraw(double amount) {
        try {
            /*
            if (amount > 1000) {
                throw new InvalidFundingAmountException(amount);
            }
            if (this.getBalance() < 5000) {
                throw new InsufficientFundsException(amount);
            }
            */
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_CHECKING, amount,
                    getBalance(), getBalance() - amount);
            super.doWithdrawing(amount);
            addTransaction(transaction);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Deposit.
     */
    @Override
    public void deposit(double amount) {
        try {
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_CHECKING, amount,
                    getBalance(), getBalance() + amount);
            super.doDepositing(amount);
            addTransaction(transaction);
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
