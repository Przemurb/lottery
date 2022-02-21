package com.example.lottery.data;

public class CouponException extends Exception {
    private final String message;
        public CouponException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
