package lab4.exceptions;

import lab4.colors.Colors;

public class OutOfOrderException extends RuntimeException {
    public OutOfOrderException(String message) {
        super(Colors.ANSI_RED + "OUT OF ORDER: " + message + Colors.ANSI_RESET);
    }
}
