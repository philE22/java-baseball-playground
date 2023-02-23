package baseball;

public class ValidatorUtils {

    public static boolean isCorrectAnswerInput(String input) {
        if (input.length() != 3) {
            System.out.println("입력하는 숫자는 3자리여야 합니다.");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            int num;
            try {
                num = Integer.parseInt(String.valueOf(input.charAt(i)));
            } catch (NumberFormatException e) {
                System.out.println("입력값은 숫자여야합니다.");
                return false;
            }

            if (num == 0) {
                System.out.println("숫자는 1-9 사이의 숫자여야합니다.");
                return false;
            }
        }

        return true;
    }

    public static boolean isCorrectRestartInput(String input) {
        int num;

        try {
            num = Integer.parseInt(String.valueOf(input));
        } catch (NumberFormatException e) {
            System.out.println("입력한 값은 숫자여야합니다");
            return false;
        }

        if (num != 1 && num != 2) {
            System.out.println("입력값은 1 아니면 2여야합니다.");
            return false;
        }

        return true;
    }
}
