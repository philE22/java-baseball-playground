package baseball;

import java.util.Objects;

public class Ball {
    private int position;
    private int ballNo;

    public Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = ballNo;
    }

    public BallStatus compare(Ball answer) {
        if (this.getBallNo() == answer.getBallNo() && this.getPosition() != answer.getPosition()) {
            return BallStatus.BALL;
        }
        if (this.equals(answer)) {
            return BallStatus.STRIKE;
        }
        return BallStatus.NOTHING;
    }

    public int getPosition() {
        return position;
    }

    public int getBallNo() {
        return ballNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && ballNo == ball.ballNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, ballNo);
    }
}
