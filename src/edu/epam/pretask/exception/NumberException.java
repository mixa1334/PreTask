package edu.epam.pretask.exception;

public class NumberException extends Exception {
    public NumberException() {
        super();
    }

    public NumberException(String message) {
        super(message);
    }

    public NumberException(Exception e) {
        super(e);
    }

    public NumberException(String message, Exception e) {
        super(message, e);
    }
}
