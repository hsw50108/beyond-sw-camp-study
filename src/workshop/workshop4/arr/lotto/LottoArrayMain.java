package workshop.workshop4.arr.lotto;

public class LottoArrayMain {

    public static void main(String[] args) {
        ExerciseLotto lotto = new ExerciseLotto();
        int[] arrayLotto = lotto.generateLottoNumbers();
        lotto.displayLottoNumbers(arrayLotto);


    }
}
