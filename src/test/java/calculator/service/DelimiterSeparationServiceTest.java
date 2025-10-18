package calculator.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DelimiterSeparationServiceTest {

    @Test
    void refineInput() {
        String input = "//*\\n*1:2*3,4*";

        String result = DelimiterSeparationService.refineInput(input);

        assertThat(result).isEqualTo("*1:2*3,4*");
    }

    @Test
    void extractCustomDelimiter() {
        String input = "//?\\n?1:2?3,4?";

        String result = DelimiterSeparationService.extractCustomDelimiter(input);

        assertThat(result).isEqualTo("?");
    }

    @Test
    void hasCustomDelimiter() {
        String input = "//^\\n^1^2^3^";

        boolean result = DelimiterSeparationService.hasCustomDelimiter(input);

        assertThat(result).isTrue();
    }
}