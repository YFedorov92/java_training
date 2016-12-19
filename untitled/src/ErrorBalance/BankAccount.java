package ErrorBalance;

/**
 * Created by yuriyf on 12/19/2016
 */
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) throws NegativeBalanceException {
        setBalance(balance - amount);
            if (balance < 0.0){
                throw new NegativeBalanceException();
            }

        return balance;
    }
}
