package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BallTest {
    Ball com;
    @BeforeEach
    void setUp() {
        com = new Ball(1, 2);
    }

    @Test
    void strike() {
        assertThat(com.compare(new Ball(1, 2))).isEqualTo(BallStatus.STRIKE);
    }
    @Test
    void nothing() {
        assertThat(com.compare(new Ball(2, 1))).isEqualTo(BallStatus.NOTHING);
    }
    @Test
    void ball() {
        assertThat(com.compare(new Ball(1, 1))).isEqualTo(BallStatus.BALL);
    }
}
