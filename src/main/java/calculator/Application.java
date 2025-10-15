package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.beans.Customizer;

public class Application {
    public static void main(String[] args) {
        String input = guideInput();

        if(hasCustomDelimiter(input)) {
            String customDelimiter = extractCustomDelimiter(input);
//            System.out.println(customDelimiter);

        }




    }

    private static String extractCustomDelimiter(String input) {
        return String.valueOf(input.charAt(2));
    }

    private static boolean hasCustomDelimiter(String input) {
        if(input.charAt(0) == '/' && input.charAt(1) == '/' && input.charAt(3) == '\\' && input.charAt(4) == 'n'){
            return true;
        }
        return false;
    }

    private static String guideInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        Console.close();
        return input;
    }

}
