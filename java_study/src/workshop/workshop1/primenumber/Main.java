package workshop.workshop1.primenumber;

public class Main {
    public static void main(String[] args) {
        int inputNumber = ExercisePrimeNumber.getUserInput();
        // 소수 판단하는 로직(for, if)
        // 0,1 은 소수가 아니다.
        // 2는 소수

        if (inputNumber < 2) {
            System.out.println(inputNumber + "은(는) 소수가 아닙니다.");
        } else if (inputNumber == 2) {
            System.out.println(inputNumber + "은(는) 소수입니다.");
        }

        boolean isFlag = true;

        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber % 2 == 0) {
                isFlag = false;
                break;
            }
        }

        String msg = (isFlag) ? inputNumber + "은(는) 소수입니다." : inputNumber + "은(는) 소수가 아닙니다.";
        System.out.println(msg);

    }

}
