package com.demo.spock;

class Polygon {
    private final int numberOfSides;

    Polygon(final int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
}
