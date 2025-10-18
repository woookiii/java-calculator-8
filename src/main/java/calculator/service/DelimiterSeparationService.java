package calculator.service;

public class DelimiterSeparationService {

    private DelimiterSeparationService() {
    }

    public static String refineInput(String input) {
        return input.substring(5);
    }

    public static String extractCustomDelimiter(String input) {
        return String.valueOf(input.charAt(2));
    }

    public static boolean hasCustomDelimiter(String input) {
        if(input.charAt(0) == '/' && input.charAt(1) == '/' && input.charAt(3) == '\\' && input.charAt(4) == 'n'){
            return true;
        }
        return false;
    }
}
