package com.vavatech.springrestexample.car;

class CarNotFoundException extends RuntimeException {
    public CarNotFoundException(String s) {
        super(s);
    }

    public CarNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CarNotFoundException(Throwable cause) {
        super(cause);
    }

    public CarNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CarNotFoundException() {
    }
}
