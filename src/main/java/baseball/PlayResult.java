package baseball;

public class PlayResult {
    private int strike = 0;
    private int ball = 0;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void report(BallStatus ballStatus) {
        if (ballStatus.isStrike()) {
            strike++;
        }
        if (ballStatus.isBall()) {
            ball++;
        }
    }

    public boolean isGameOver() {
        return strike == 3;
    }
}
