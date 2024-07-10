package workshop.workshop5.subway.service;

import workshop.workshop5.subway.domain.CardDto;
import workshop.workshop5.subway.domain.StationDto;

public class SubwayServiceImpl implements SubwayService {

    @Override
    public int chargeFee(CardDto card, StationDto start, StationDto end) {
        int fee = 0;
        int distance = getDistance(start, end);

        if (distance <= 12) {
            fee = SubwayService.BASIC_FEE;

        } else if (distance > 12 && distance <= 42) {
            fee = BASIC_FEE + ((distance - 12) / 6) * 100;

        } else if (distance > 42) {
            fee = 500 + BASIC_FEE + ((distance - 12) / 6) * 100;
        }
        // 요금
        if (subtractBalance(card, fee)) {
            return fee;
        } else {
            return -1;
        }
    }


    @Override
    public boolean subtractBalance(CardDto card, int amount) {
        int currentBalance = card.getBalance() - amount;

        if (currentBalance >= 0) {
            card.setBalance(currentBalance);
            return true;
        }
        return false;
    }


    @Override
    public int getDistance(StationDto start, StationDto end) {
        return Math.abs(start.getLocation() - end.getLocation());
    }
}
