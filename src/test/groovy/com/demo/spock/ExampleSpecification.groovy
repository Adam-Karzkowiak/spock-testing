package com.demo.spock

import spock.lang.Specification
import spock.lang.Subject


class ExampleSpecification extends Specification {
    def "should be a simple assertion"() {
        expect:
        1 == 1
    }

    def "should demonstrate given-when-then"() {
        when:
        int sides = Polygon.of(4).numberOfSides

        then:
        sides == 4
    }

    def "should throw TooFewSidesException when 0 sides provided for polygon"() {
        when:
        Polygon.of(0)

        then:
        thrown(TooFewSidesException.class)
    }

    def "should throw TooFewSidesException when wrong number of sides #sides provided for polygon"() {
        when:
        Polygon.of(sides)

        then:
        def exception = thrown(TooFewSidesException)
        exception.numberOfSides == sides

        where:
        sides << [-1, 0, 1, 2]
    }


    def "should not throw TooFewSidesException when 3 sides provided for polygon"() {
        when:
        Polygon.of(3)

        then:
        notThrown(TooFewSidesException.class)
    }

    def "should be able to create a polygon with #sides sides"() {
        expect:
        Polygon.of(sides).numberOfSides == sides

        where:
        sides << [3, 4, 5, 50]
    }

    def "should use data tables for calculating max. Max of #a and #b is #max"() {
        expect:
        Math.max(a, b) == max

        where:
        a | b || max
        1 | 3 || 3
        7 | 4 || 7
        0 | 0 || 0
    }

    def "should be able to mock a concrete class"() {
        given:
        Renderer renderer = Mock()
        @Subject
        def polygon = Polygon.of(4, renderer)

        when:
        polygon.draw()

        then:
        4 * renderer.drawLine()
    }

    def "should be able to create a stub"() {
        given:
        Palette palette = Stub()
        palette.getPrimaryColour() >> Colour.RED
        @Subject
        def renderer = new Renderer(palette)

        expect:
        renderer.getForegroundColour() == Colour.RED
    }

    def "should use a helper method"() {
        given:
        Renderer renderer = Mock()
        def shapeFactory = new ShapeFactory(renderer)

        when:
        def polygon = shapeFactory.createDefaultPolygon()

        then:
        checkDefaultShape(polygon, renderer)
    }

    private void checkDefaultShape(Polygon polygon, Renderer renderer) {
        assert polygon.numberOfSides == 4
        assert polygon.renderer == renderer
    }
}
