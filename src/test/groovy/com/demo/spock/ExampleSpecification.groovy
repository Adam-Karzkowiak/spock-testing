package com.demo.spock

import spock.lang.Specification


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


    def "should not throw TooFewSidesException when 3 sides provided for polygon"() {
        when:
        Polygon.of(3)

        then:
        notThrown(TooFewSidesException.class)
    }
}
