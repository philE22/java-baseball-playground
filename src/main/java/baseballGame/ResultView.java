package baseballGame;

public class ResultView {
    public void printStart() {
        System.out.println("게임을 시작합니다!");
    }
    public void printScore(int ball, int strike) {
        String str = "";

        if (ball > 0) {
            str += ball + "볼 ";
        }
        if (strike > 0) {
            str += strike + "스트라이크";
        }

        System.out.println(str);
    }
    public void printEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
