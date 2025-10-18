package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class StringSumView {

    private StringSumView() {
    }

    public static String guideInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        Console.close();
        return input;
    }

    public static void showResult(long totalSum) {
        System.out.format("결과 : %d%n", totalSum);
    }
}
