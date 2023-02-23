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
}
