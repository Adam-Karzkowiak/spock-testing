package com.demo.spock;

class Polygon {
    private final int numberOfSides;

    private Polygon(final int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public static Polygon of(final int numberOfSides) {
        if (numberOfSides < 3) {
            throw new TooFewSidesException("Polygon should have at least 3 sides");
        }
        return new Polygon(numberOfSides);
    }
}
