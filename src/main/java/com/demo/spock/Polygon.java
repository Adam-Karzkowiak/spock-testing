package com.demo.spock;

class Polygon {
    private final int numberOfSides;
    private final Renderer renderer;

    private Polygon(final int numberOfSides, final Renderer renderer) {
        this.numberOfSides = numberOfSides;
        this.renderer = renderer;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void draw() {
        for (int i = 0; i < numberOfSides; i++) {
            renderer.drawLine();

        }
    }

    public static Polygon of(final int numberOfSides) {
        if (numberOfSides < 3) {
            throw new TooFewSidesException("Polygon should have at least 3 sides", numberOfSides);
        }
        var defaultRender = new Renderer();
        return new Polygon(numberOfSides, defaultRender);
    }

    public static Polygon of(final int numberOfSides, final Renderer renderer) {
        if (numberOfSides < 3) {
            throw new TooFewSidesException("Polygon should have at least 3 sides", numberOfSides);
        }
        return new Polygon(numberOfSides, renderer);
    }

}
