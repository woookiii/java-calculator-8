package calculator.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorServiceTest {

    @Test
    void calculateTotalSum() {
        List<String> delimiters = Arrays.asList(",", ":", "-");
        String input = "1,2:3-4";

        long result = CalculatorService.calculateTotalSum(input, delimiters);

        assertThat(result).isEqualTo(10L);
    }
}