package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        String input = guideInput();
        List<String> delimiterList = new ArrayList<>(Arrays.asList(":",","));

        if(hasCustomDelimiter(input)) {
            String customDelimiter = extractCustomDelimiter(input);
//            System.out.println(customDelimiter);
            delimiterList.add(customDelimiter);

            input = refineInput(input);
//            System.out.println(input);
        }

        long totalSum = calculateTotalSum(input, delimiterList);

        showResult(totalSum);
    }

    private static void showResult(long totalSum) {
        System.out.format("결과 : %d%n", totalSum);
    }

    private static long calculateTotalSum(String input, List<String> delimiterList) {
        long sum = 0L;
        for(int i = 0; i < input.length(); i++) {
            char currentIndexCharacter = input.charAt(i);

            boolean isDelimiter = delimiterList.contains(String.valueOf(currentIndexCharacter));
            if(isDelimiter){
                continue;
            }

            if (Character.isDigit(currentIndexCharacter)) {
                sum += Character.getNumericValue(currentIndexCharacter);
            } else {
                throw new IllegalArgumentException("잘못된 입력값입니다.");
            }
        }
        return sum;
    }

    private static String refineInput(String input) {
        return input.substring(5);
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
