package calculator.runner;

import calculator.service.CalculatorService;
import calculator.service.DelimiterSeparationService;
import calculator.view.CalculatorView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorRunner {

    private CalculatorRunner() {
    }

    public static void run() {

        String input = CalculatorView.guideInput();

        List<String> delimiterList = new ArrayList<>(Arrays.asList(":",","));

        if(DelimiterSeparationService.hasCustomDelimiter(input)) {
            String customDelimiter = DelimiterSeparationService.extractCustomDelimiter(input);

            delimiterList.add(customDelimiter);

            input = DelimiterSeparationService.refineInput(input);
        }

        long totalSum = CalculatorService.calculateTotalSum(input, delimiterList);

        CalculatorView.showResult(totalSum);
    }
}
