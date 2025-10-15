package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String input = guideInput();

        if(hasCustomRegex(input)) {

        }




    }

    private static boolean hasCustomRegex(String input) {
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
