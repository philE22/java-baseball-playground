package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private ArrayList<Ball> balls;

    public Balls(List<Integer> numbers) {
        if (numbers.size() != 3) {
            throw new IllegalArgumentException("입력값은 3자리수여야합니다.");
        }

        balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i + 1, numbers.get(i)));
        }
    }

    public BallStatus fullCompare(Ball answer) {
        return balls.stream()
                .map(ball -> ball.compare(answer))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public PlayResult play(Balls user) {
        PlayResult result = new PlayResult();
        balls.stream()
                .map(ball -> user.fullCompare(ball))
                .forEach(ballStatus -> result.report(ballStatus));
        return result;
    }
}
