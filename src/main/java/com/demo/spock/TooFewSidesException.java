package com.demo.spock;

class TooFewSidesException extends IllegalArgumentException {
    private final int numberOfSides;

    TooFewSidesException(final String message, int numberOfSides) {
        super(message);
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
}
