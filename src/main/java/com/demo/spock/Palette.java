package com.demo.spock;

class Palette {
    private final Colour primaryColour;

    Palette(final Colour primaryColour) {
        this.primaryColour = primaryColour;
    }

    Colour getPrimaryColour() {
        return primaryColour;
    }
}

enum Colour {
    RED, BLUE, GREEN
}
