package baseball;

import java.util.Objects;

public class Ball {
    private final int number;
    private final int position;

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public BallStatus compare(Ball ball) {
        if (ball.equals(this)) {
            return BallStatus.STRIKE;
        }
        if (ball.isNumberMatch(number)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean isNumberMatch(int number) {
        return number == this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return number == ball.number && position == ball.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, position);
    }
}
