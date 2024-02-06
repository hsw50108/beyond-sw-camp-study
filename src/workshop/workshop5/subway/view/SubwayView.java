package workshop.workshop5.subway.view;

import workshop.workshop5.subway.domain.CardDto;
import workshop.workshop5.subway.domain.StationDto;
import workshop.workshop5.subway.service.SubwayServiceImpl;

import java.util.Scanner;

public class SubwayView {
    private final StationDto[] stations;
    private final SubwayServiceImpl subwayService;
    private CardDto card;
    public SubwayView() {
        stations = new StationDto[]{
                new StationDto("A1105", "합정", 0),
                new StationDto("A1106", "홍대입구", 10),
                new StationDto("A1107", "신촌", 15),
                new StationDto("A1108", "이대", 20),
                new StationDto("A1109", "아현", 30),
                new StationDto("A1110", "충정로", 35),
                new StationDto("A1111", "시청", 40),
                new StationDto("A1112", "을지로입구", 50),
                new StationDto("A1113", "을지로3가", 58),
                new StationDto("A1114", "을지로4가", 67),
                new StationDto("A1115", "동대문운동장", 77),
        };
        subwayService = new SubwayServiceImpl();
    }

    public void menu() {
        System.out.print("[교통카드 충전금액을 입력해주세요 : ] :");
        card = new CardDto(getUserInput());

        printStationList(stations);
        StationDto startStation = stations[selectNumber(stations, "승차")];

        printStationList(stations);
        StationDto lastStation = stations[selectNumber(stations, "하차")];

        int fee = subwayService.chargeFee(card, startStation, lastStation);

        if (fee >= 0) {
            printSuccess(card, startStation, lastStation, fee);
        } else {
            printFail();
        }



    }

    // 역 정보 출력
    public void printStationList(StationDto[] stations) {
        System.out.println("=====================");
        for (int i = 0; i < stations.length; i++) {
            System.out.println(i + 1 + ". " + stations[i].getName());
        }
        System.out.println("=====================");
    }

    // card : 소유 카드
    // start : 출발역, end : 종착역
    // chargedFee : 요금
    // 요금 정산 성공 메시지를 출력
    public void printSuccess(CardDto card, StationDto start, StationDto end, int chargedFee) {
        System.out.println("정상 처리되었습니다.");
        System.out.println("승차역은 " + start.getName() + " 하차역은 " + end.getName());
        System.out.println("요금은 " + chargedFee);
        System.out.println("남은 금액 : " + card.getBalance());
    }

    //  요금 정산 실패 메시지 출력
    public void printFail() {
        System.out.println("역무원을 호출해주세요");
    }

    /**
     * 역 선택 메서드
     *
     * @Params stations : 역 정보를 담는 배열
     * @Params msg 출력 메시지
     */
    public int selectNumber(StationDto[] stations, String msg) {
        System.out.print(msg + "역을 선택하세요 1 ~ " + stations.length + " : ");
        int stationNumber = getUserInput();
        return stationNumber - 1;
    }

    /**
     * Scanner 이용헤서 입력받은 값을 처리하는 메서드
     */
    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
