package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {
    @Test
    void nothing() {
        Balls computerBalls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = computerBalls.play(new Ball(1, 4));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        Balls computerBalls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = computerBalls.play(new Ball(1, 2));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        Balls computerBalls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = computerBalls.play(new Ball(1, 1));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void play_nothing() {
        Balls computerBalls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = computerBalls.play(Arrays.asList(4, 5, 6));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }
    @Test
    void play_1strike_1ball() {
        Balls computerBalls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = computerBalls.play(Arrays.asList(1, 4, 2));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(1);
    }
    @Test
    void play_2ball() {
        Balls computerBalls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = computerBalls.play(Arrays.asList(5, 1, 2));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(2);
    }
    @Test
    void play_3strike() {
        Balls computerBalls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = computerBalls.play(Arrays.asList(1, 2, 3));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.isGameEnd()).isTrue();
    }
}
