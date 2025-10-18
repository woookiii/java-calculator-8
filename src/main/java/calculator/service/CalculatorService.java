package calculator.service;

import java.util.List;

public class CalculatorService {

    private CalculatorService () {
    }

    public static long calculateTotalSum(String input, List<String> delimiterList) {
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
}
