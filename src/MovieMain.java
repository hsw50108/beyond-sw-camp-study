import workshop.workshop7.movie.guessgame.MovieServiceImpl;

public class MovieMain {
    public static void main(String[] args) {
        MovieServiceImpl service = new MovieServiceImpl();
        String selectSentence = service.selectSentence();
        System.out.println("selectSentence : " + selectSentence);

        String str = service.initGame(selectSentence);
        System.out.println(str);

        for (int i = 0; i < 5; i++) {
            String oneLetter = service.getOneLetter();
            System.out.println("남은 기회 : " + (5 - i) + "번 남았습니다.");

            StringBuffer solvingSentence = new StringBuffer();
            boolean correctGuess = service.checkString(selectSentence, solvingSentence, oneLetter);

            if (correctGuess) {
                System.out.println("정답입니다!");
            } else {
                System.out.println("틀렸습니다.");
            }

            if (i == 4) {
                System.out.println("다음 기회에 다시 도전해주세요");
            }

        }
    }
}
