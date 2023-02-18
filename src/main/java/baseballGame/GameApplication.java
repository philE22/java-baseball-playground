package baseballGame;

public class GameApplication {
    public static void main(String[] args) {

        BaseballGame game = new BaseballGame();
        //게임 객체 생성 시 랜덤 숫자 세팅, continue 여부 true 설정

        boolean gameContinue = true;

        while (gameContinue) {
            gameContinue = game.process();
        }
    }
}
