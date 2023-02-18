package baseballGame;

import baseballGame.BaseballGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

class BaseballGameTest {

    private BaseballGame game;
    @BeforeEach
    void setUp() {
        game = new BaseballGame();
    }

    @DisplayName("숫자를 설정하면, 3자리이고 3숫자가 모두 다르다")
    @Test
    void setUpNumber() {
        for (int i = 0; i < 100; i++) {
            game.setUpNumbers();
            ArrayList<Integer> numbers = game.getNumbers();

            assertThat(numbers.size()).isEqualTo(3);
            assertThat(numbers.get(0)).isNotEqualTo(numbers.get(1));
            assertThat(numbers.get(1)).isNotEqualTo(numbers.get(2));
            assertThat(numbers.get(0)).isNotEqualTo(numbers.get(2));
        }
    }

    @ParameterizedTest
    @CsvSource(value = {"123:0:3", "456:0:0", "132:2:1", "236:2:0", "312:3:0"}, delimiter = ':')
    void calculate(String input, int ball, int strike) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        game.setNumbers(list);

        game.calculate(input);
        assertThat(game.getBall()).isEqualTo(ball);
        assertThat(game.getStrike()).isEqualTo(strike);
    }


}