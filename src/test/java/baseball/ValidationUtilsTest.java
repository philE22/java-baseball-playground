package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

    @DisplayName("1 ~ 9 사이의 숫자인가?")
    @Test
    void valid() {
        Assertions.assertThat(ValidationUtils.valid(9)).isTrue();
        Assertions.assertThat(ValidationUtils.valid(1)).isTrue();
        Assertions.assertThat(ValidationUtils.valid(5)).isTrue();
        Assertions.assertThat(ValidationUtils.valid(0)).isFalse();
        Assertions.assertThat(ValidationUtils.valid(10)).isFalse();
        Assertions.assertThat(ValidationUtils.valid(13)).isFalse();
    }

}
