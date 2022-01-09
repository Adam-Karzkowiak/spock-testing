package com.demo.spock;

class ShapeFactory {
    private final Renderer renderer;

    ShapeFactory(final Renderer renderer) {
        this.renderer = renderer;
    }

    Polygon createDefaultPolygon() {
        return Polygon.of(4, renderer);
    }
}
