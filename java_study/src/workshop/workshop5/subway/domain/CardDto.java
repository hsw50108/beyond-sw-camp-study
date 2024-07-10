package workshop.workshop5.subway.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CardDto {
    private int balance;

    public CardDto() {
    }

    public CardDto(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CardDto{" +
                "balance=" + balance +
                '}';
    }
}
