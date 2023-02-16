package study;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class StringCalculator {
    public int calculate(String input) {
        int box = 0;
        String[] arr = input.split(" ");
        box += Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i = i + 2) {
            if (arr[i].equals("+")) {
                box += Integer.parseInt(arr[i + 1]);
            }
            if (arr[i].equals("-")) {
                box -= Integer.parseInt(arr[i + 1]);
            }
            if (arr[i].equals("/")) {
                box /= Integer.parseInt(arr[i + 1]);
            }
            if (arr[i].equals("*")) {
                box *= Integer.parseInt(arr[i + 1]);
            }
        }

        return box;
    }


    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(calculator.calculate(s));
    }

}
