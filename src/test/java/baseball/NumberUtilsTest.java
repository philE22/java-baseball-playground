package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class NumberUtilsTest {
    private List<Integer> list;
    @BeforeEach
    void setUp() {
        list = NumberUtils.ramdomList();
    }

    @Test
    void randomGenerator_size() {
        assertThat(list.size()).isEqualTo(3);
    }

    @Test
    void randomGenerator_1_to_9() {
        Integer a = list.get(0);
        Integer b = list.get(1);
        Integer c = list.get(2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        assertThat(a > 0 && a < 10).isTrue();
        assertThat(b > 0 && b < 10).isTrue();
        assertThat(c > 0 && c < 10).isTrue();
    }

    @Test
    void randomGenerator_notSame() {
        Integer a = list.get(0);
        Integer b = list.get(1);
        Integer c = list.get(2);
        assertThat(a != b).isTrue();
        assertThat(b != c).isTrue();
        assertThat(a != c).isTrue();

    }

}
