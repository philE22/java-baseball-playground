package baseball;

import java.util.Scanner;

public class InputView {
    private Scanner sc = new Scanner(System.in);
    public String input() {
        String input;

        while (true) {
            System.out.print("숫자를 입력 주세요 : ");
            input = sc.nextLine();

            if (isCorrectInput(input)) {
                break;
            }
        }

        return input;
    }

    private boolean isCorrectInput(String input) {
        if (input.length() != 3) {
            System.out.println("입력하는 숫자는 3자리여야 합니다.");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            int num;
            try {
                num = Integer.parseInt(String.valueOf(input.charAt(i)));
            } catch (NumberFormatException e) {
                System.out.println("입력한 값은 숫자여야만 합니다.");
                return false;
            }
            if (num == 0) {
                System.out.println("숫자 0은 입력할 수 없습니다.");
                return false;
            }
        }
        return true;
    }

    public boolean isRestart() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        int num;

        while (true) {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String input = sc.nextLine();

            try {
                num = Integer.parseInt(String.valueOf(input));
            } catch (NumberFormatException e) {
                System.out.println("입력한 값은 숫자여야합니다");
                continue;
            }

            if (num != 1 && num != 2) {
                System.out.println("입력값은 1 아니면 2여야합니다.");
                continue;
            }
            break;
        }

        return num == 1;
    }

}
