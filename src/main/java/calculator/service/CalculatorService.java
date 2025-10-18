package calculator.service;

import java.util.List;

public class CalculatorService {

    private CalculatorService () {
    }

    public static long calculateTotalSum(String input, List<String> delimiterList) {
        long sum = 0L;
        StringBuilder numberBuffer = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char currentIndexCharacter = input.charAt(i);

            boolean isDelimiter = delimiterList.contains(String.valueOf(currentIndexCharacter));
            if (isDelimiter) {
                if (numberBuffer.isEmpty()) {
                    continue;
                }
                sum += Long.parseLong(numberBuffer.toString());
                numberBuffer = new StringBuilder();
                continue;
            }

            if (Character.isDigit(currentIndexCharacter)) {
                numberBuffer.append(currentIndexCharacter);
            } else {
                throw new IllegalArgumentException("잘못된 입력값입니다.");
            }
        }
        if(!numberBuffer.isEmpty()){
            sum += Long.parseLong(numberBuffer.toString());
        }

        return sum;
    }
}
