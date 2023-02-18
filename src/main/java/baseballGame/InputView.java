package baseballGame;

import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);
    public String numberInput() {
        System.out.print("숫자를 입력해 주세요 : ");
        String str = sc.nextLine();
        System.out.println();

        return str;
    }

    public String restartInput() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = sc.nextLine();

        return input;
    }
}
