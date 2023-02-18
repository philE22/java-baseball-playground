package baseballGame;

import java.util.ArrayList;

public class BaseballGame {
    private ArrayList<Integer> numbers;
    private int ball;
    private int strike;

    private final InputView inputView = new InputView();
    private final ResultView resultView = new ResultView();

    public boolean process() {
        resultView.printStart();
        setUpNumbers();

        boolean correct = false;

        while (!correct) {
            String input = inputView.numberInput();

            calculate(input);

            resultView.printScore(ball, strike);
            correct = result(strike);
        }
        resultView.printEnd();

        if (inputView.restartInput() == "2") return false;
        return true;
    }

    private boolean result(int strike) {
        if (strike != 3) return false;
        return true;
    }

    public void setUpNumbers() {
        numbers = new ArrayList<>();

        while (numbers.size() < 3) {
            int random = (int) (Math.random() * 10);

            addNumber(random, numbers);
        }
    }

    private void addNumber(int random, ArrayList<Integer> numbers) {
        if (!numbers.contains(random)) numbers.add(random);
    }

    public void calculate(String input) {
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(String.valueOf(input.charAt(i)));
            checkStrikeOrBall(num, i);
        }
    }

    private void checkStrikeOrBall(int num, int idx) {
        if (num == numbers.get(idx)) {
            strike++;
            return;
        }
        if (numbers.contains(num)) {
            ball++;
        }
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

}


