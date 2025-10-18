package calculator.view;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorViewTest {

    @Test
    void guideInput() {
        String expectedInput = "1,2-4\\\\nnn";
        System.setIn(new ByteArrayInputStream((expectedInput + "\n").getBytes()));

        String input = CalculatorView.guideInput();

        assertThat(input).isEqualTo(expectedInput);
    }

    @Test
    void showResult() {
        long totalSum = 10000000000L;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        CalculatorView.showResult(totalSum);

        assertThat(out.toString()).contains("결과 : 10000000000");
    }
}