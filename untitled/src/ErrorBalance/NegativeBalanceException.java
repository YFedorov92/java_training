package ErrorBalance;

/**
 * Created by yuriyf on 12/19/2016.
 */
public class NegativeBalanceException extends Exception {

    public String message = "Your balance can't be lower then 0.00. Please fill your balance to perfoem transactions!";

    public NegativeBalanceException(){ }

    @Override
    public String getMessage() {
        return message;
    }
}
