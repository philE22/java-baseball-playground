package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BallTest {
    @Test
    void nothing() {
        Ball com = new Ball(1, 2);
        Ball user = new Ball(2, 3);
        BallStatus status = com.compare(user);
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }
    @Test
    void ball() {
        Ball com = new Ball(1, 2);
        Ball user = new Ball(2, 2);
        BallStatus status = com.compare(user);
        assertThat(status).isEqualTo(BallStatus.BALL);
    }
    @Test
    void strike() {
        Ball com = new Ball(1, 2);
        Ball user = new Ball(1, 2);
        BallStatus status = com.compare(user);
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }
}
