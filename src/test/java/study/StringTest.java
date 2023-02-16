package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split1() {
        String str1 = "1,2";
        String[] split1 = str1.split(",");

        assertThat(split1).containsExactly("1", "2");
    }

    @Test
    void split2() {
        String str2 = "1";
        String[] split2 = str2.split(",");

        assertThat(split2).contains("1");
        assertThat(split2.length).isEqualTo(1);
        assertThat(split2).doesNotContain("2");
    }

    @Test
    void substring() {
        String str = "(1,2)";
        String substring = str.substring(1, str.length()-1);

        assertThat(substring).isEqualTo("1,2");
    }


    @DisplayName("charAt() 사용 시, 해당 index의 char값을 리턴한다. String이 가진 index를 넘어가면 IndexOutOfBoundException이 발생한다.")
    @Test
    void charAt() {
        String str = "abc";

        assertThat(str.charAt(0)).isEqualTo('a');
        assertThat(str.charAt(1)).isEqualTo('b');
        assertThat(str.charAt(2)).isEqualTo('c');
        assertThatThrownBy(() -> {
            str.charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
