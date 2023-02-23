package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {
    @Test
    void fullCompare_nothing() {
        Balls com = new Balls(Arrays.asList(1, 2, 3));
        Ball ball = new Ball(1, 4);
        BallStatus status = com.fullCompare(ball);
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void fullCompare_Ball() {
        Balls com = new Balls(Arrays.asList(1, 2, 3));
        Ball ball = new Ball(1, 3);
        BallStatus status = com.fullCompare(ball);
        assertThat(status).isEqualTo(BallStatus.BALL);
    }
    @Test
    void fullCompare_Strike() {
        Balls com = new Balls(Arrays.asList(1, 2, 3));
        Ball ball = new Ball(1, 1);
        BallStatus status = com.fullCompare(ball);
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }
    @Test
    void play_nothing() {
        Balls com = new Balls(Arrays.asList(1, 2, 3));
        Balls user = new Balls(Arrays.asList(4, 5, 6));
        PlayResult result= com.play(user);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(0);
    }
    @Test
    void play_1ball_0strike() {
        Balls com = new Balls(Arrays.asList(1, 2, 3));
        Balls user = new Balls(Arrays.asList(2, 5, 6));
        PlayResult result= com.play(user);
        assertThat(result.getBall()).isEqualTo(1);
        assertThat(result.getStrike()).isEqualTo(0);
    }
    @Test
    void play_1ball_1strike() {
        Balls com = new Balls(Arrays.asList(1, 2, 3));
        Balls user = new Balls(Arrays.asList(2, 5, 3));
        PlayResult result= com.play(user);
        assertThat(result.getBall()).isEqualTo(1);
        assertThat(result.getStrike()).isEqualTo(1);
    }
    @Test
    void play_0ball_3strike() {
        Balls com = new Balls(Arrays.asList(1, 2, 3));
        Balls user = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result= com.play(user);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.isGameOver()).isTrue();
    }
}
