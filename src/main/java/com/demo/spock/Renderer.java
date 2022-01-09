package com.demo.spock;

class Renderer {

    private final Palette foregroundColour;

    Renderer(final Palette foregroundColour) {
        this.foregroundColour = foregroundColour;
    }

    Colour getForegroundColour() {
        return foregroundColour.getPrimaryColour();
    }

    void drawLine() {
    }
}
