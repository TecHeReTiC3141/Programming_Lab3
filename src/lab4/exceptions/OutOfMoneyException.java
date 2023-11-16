package lab4.exceptions;

import lab4.colors.Colors;

public class OutOfMoneyException extends Exception {
    public OutOfMoneyException(String message) {
        super(Colors.ANSI_RED + "OUT OF MONEY: " + message + Colors.ANSI_RESET);
    }
}
