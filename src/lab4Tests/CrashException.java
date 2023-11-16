package lab4Tests;

public class CrashException extends Exception {

    public CrashException(String message) {
        super("CRASH ERROR: " + message);
    }
}
