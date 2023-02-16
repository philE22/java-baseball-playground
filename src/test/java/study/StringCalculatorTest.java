package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

    StringCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @ParameterizedTest
    @CsvSource(value = {"2 + 1 * 3:9", "1 + 2 + 3 / 2:3", "1 + 1:2"}, delimiter = ':')
    void input(String input, int output) {
        assertThat(calculator.calculate(input)).isEqualTo(output);
    }

}
