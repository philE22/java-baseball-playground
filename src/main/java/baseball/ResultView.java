package baseball;

public class ResultView {
    public void result(PlayResult result) {
        String output = "";
        if (result.getBall() != 0) {
            output += result.getBall() + "볼";
        }
        if (result.getStrike() != 0) {
            output += result.getStrike() + "스트라이크";
        }
        if (output == "") {
            output = "낫싱";
        }

        System.out.println(output);
    }
}
