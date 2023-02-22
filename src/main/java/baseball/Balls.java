package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> balls;

    public Balls(List<Integer> numbers) {
        this.balls = mapBall(numbers);

    }
    private static List<Ball> mapBall(List<Integer> numbers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i + 1, numbers.get(i)));
        }
        return balls;
    }

    public PlayResult play(List<Integer> answers) {
        PlayResult playResult = new PlayResult();
        Balls userBalls = new Balls(answers);
        for (Ball ball : balls) {
            BallStatus status = userBalls.play(ball);
            playResult.report(status);
        }
        return playResult;
    }

    public BallStatus play(Ball userBall) {
        return balls.stream()
                .map(ball -> ball.compare(userBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
