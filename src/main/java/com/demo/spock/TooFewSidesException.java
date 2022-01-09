package com.demo.spock;

class TooFewSidesException extends IllegalArgumentException {

    TooFewSidesException(final String message) {
        super(message);
    }
}
