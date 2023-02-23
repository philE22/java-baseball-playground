package baseball;

import java.util.Scanner;

public class InputView {
    private Scanner sc = new Scanner(System.in);
    public String input() {
        String input = null;

        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.print("숫자를 입력 주세요 : ");
            input = sc.nextLine();

            isCorrect = ValidatorUtils.isCorrectAnswerInput(input);
        }

        return input;
    }

    public boolean isRestart() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        String input = null;

        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            input = sc.nextLine();

            isCorrect = ValidatorUtils.isCorrectRestartInput(input);
        }

        return Integer.parseInt(String.valueOf(input)) == 1;
    }

}
