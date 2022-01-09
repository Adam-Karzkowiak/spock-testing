package com.demo.spock;

class Renderer {

    private final Palette palette;

    Renderer(final Palette palette) {
        this.palette = palette;
    }

    Colour getForegroundColour() {
        return palette.getPrimaryColour();
    }

    void drawLine() {
    }
}
