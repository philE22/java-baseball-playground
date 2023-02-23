import baseball.*;

public class BaseballGameApplication {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        boolean restart = true;

        while (restart) {
            System.out.println("게임을 시작합니다");
            Balls computer = new Balls(NumberUtils.ramdomList());

            boolean gameOver = false;
            while (!gameOver) {
                Balls user = new Balls(NumberUtils.parsingInput(inputView.input()));
                PlayResult result = computer.play(user);
                resultView.result(result);
                gameOver = result.isGameOver();
            }
            restart = inputView.isRestart();
        }
        System.out.println("게임을 종료합니다.");
    }
}
