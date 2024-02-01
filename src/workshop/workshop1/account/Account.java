package workshop.workshop1.account;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Account {

    private String custId;
    private String custName;
    private String accountNumber;
    private int balance;

    public Account(String custId, String custName, String accountNumber, int balance) {
        this.custId = custId;
        this.custName = custName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }

    public void subtractBalance(int amount) {
        this.balance -= amount;
    }


}
