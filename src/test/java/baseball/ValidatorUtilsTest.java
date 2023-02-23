package baseball;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class ValidatorUtilsTest {
    @ParameterizedTest
    @CsvSource(value = {"123:true", "1234:false", "abc:false", "120:false"}, delimiter = ':')
    void isCorrectAnswerInput_success(String input, boolean result) {
        assertThat(ValidatorUtils.isCorrectAnswerInput(input)).isEqualTo(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "11:false", "a:false", "abd:false"}, delimiter = ':')
    void isCorrectRestartInput_1(String input, boolean result) {
        assertThat(ValidatorUtils.isCorrectRestartInput(input)).isEqualTo(result);
    }
}
