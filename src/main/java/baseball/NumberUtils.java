package baseball;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static List<Integer> ramdomList() {
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() < 3) {
            int num = (int) (Math.random() * 10);
            if (num != 0 && !list.contains(num)) {
                list.add(num);
            }
        }

        return list;
    }

    public static List<Integer> parsingInput(String input) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(String.valueOf(input.charAt(i))));
        }
        return list;
    }
}
