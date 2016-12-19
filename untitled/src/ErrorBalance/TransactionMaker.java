package ErrorBalance;

/**
 * Created by yuriyf on 12/19/2016
 */
public class TransactionMaker {
    public static void main(String[] args) throws NegativeBalanceException {
        BankAccount bankAccount = new BankAccount(31.22); // input balance here
            System.out.println(bankAccount.withdraw(300)); // set how much to withdraw here
    }
}
