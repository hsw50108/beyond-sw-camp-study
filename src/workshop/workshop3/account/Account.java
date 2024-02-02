package workshop.workshop3.account;

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
        System.out.println("증가 후 잔액 : " + balance + "원");
    }

    public void subtractBalance(int amount) {
        this.balance -= amount;
        System.out.println("감소 후 잔액 : " + balance + "원");
    }


}
