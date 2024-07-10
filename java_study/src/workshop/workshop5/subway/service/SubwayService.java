package workshop.workshop5.subway.service;

import workshop.workshop5.subway.domain.CardDto;
import workshop.workshop5.subway.domain.StationDto;

public interface SubwayService {

    int BASIC_FEE = 800;
    // 1. constance
//    public int x = 10;

    // 운행 요금을 반환하는 메서드(잔액 부족 -1)
    // cardDto : 소유카드(충전), 출발역, 종착역
    int chargeFee(CardDto card, StationDto start, StationDto end);

    // 카드요금을 차감하는 메서드
    // 차감이 성공하면 true, 실패하면 false
    boolean subtractBalance(CardDto card, int amount);

    // 출발역과 종착역 사이의 거리 계산
    // 역간거리를 반환하는 메서드
    int getDistance(StationDto start, StationDto end);

}
