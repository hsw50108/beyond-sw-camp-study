package workshop.workshop7.movie.guessgame;

import java.io.OutputStream;
import java.util.Random;
import java.util.Scanner;

public class MovieServiceImpl {
    private String[] sentenceDictionary = {"Matrix",
            "I know what you did last summer", "The Silence Of The Lambs",
            "Saving Private Ryan", "Black Hawk Down", "American Pie",
            "Enemy Of The State"};

    public MovieServiceImpl() {
    }

    /*
       임의의 영화 제목 반환
       Random(nextInt()) - 난수
     */
    public String selectSentence() {
        int randomNumber = new Random().nextInt(sentenceDictionary.length) + 1;
        return sentenceDictionary[randomNumber];
    }

    // 게임의 초기화 화면을 출력하고 숨겨진 영화제목 반환
    public String initGame(String selectSentence) {
        System.out.println("---------------------------");
        System.out.println("영화 제목을 맞춰 보세요");
        System.out.println("5번 기회 있습니다.");
        System.out.println("---------------------------");

        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < selectSentence.length(); i++) {
            char currentChar = selectSentence.charAt(i);
            if (currentChar != ' ') {
                masked.append('ㅁ');
            } else {
                masked.append(' ');
            }
        }
        return masked.toString();
    }

    // Scanner
    // 사용자로부터 한 문자를 입력받아서 반환
    public String getOneLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("한 문자를 입력해 주세요: ");
        return scanner.nextLine();
    }

    // 영화 제목에서 입력받은 문자를 정답으로 변경하고 찾았는지 여부를 반환
    // 영화제목, 문제 풀이중인 영화제목, 사용자가 입력한 문자
    public boolean checkString(String selectedSentence, StringBuffer solvingSentence, String letter) {
        boolean found = false;
        for (int i = 0; i < selectedSentence.length(); i++) {
            String check = String.valueOf(selectedSentence.charAt(i));
            if (check.equals(letter)) {
                solvingSentence.setCharAt(i, letter.charAt(0)); // 해당 위치에 문자 추가
                found = true;
            }
        }
        return found;
    }


}



