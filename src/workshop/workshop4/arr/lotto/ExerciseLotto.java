package workshop.workshop4.arr.lotto;

import java.util.Random;

// 로또 번호를 생성하고 생성된 번호를 배열에 담아서 관리하고 출력하는 역할
public class ExerciseLotto {
    public ExerciseLotto() {

    }

    // 로또번호 생성후 반환
    // 중복 x, 1 ~ 45
    public int[] generateLottoNumbers() {
        Random random = new Random();
        int[] lottoArray = new int[6];

        for (int i = 0; i < lottoArray.length; i++) {
            lottoArray[i] = (random.nextInt(45) + 1);

            for (int j = 0; j < i; j++) {
                if (lottoArray[i] == lottoArray[j]) {
                    i--;
                    break;
                }
            }
        }
        return lottoArray;
    }

    // 매개변수로 배열을 입력받아서 출력
    public void displayLottoNumbers(int[] lottoNumbers) {
        sortLottoNumbers(lottoNumbers);

        for (int i : lottoNumbers) {
            System.out.print(i + " ");
        }
    }

    // 로또 번호를 오름차순으로 정렬하는 역할
    private void sortLottoNumbers(int[] lottoNumbers) {

    }





}
