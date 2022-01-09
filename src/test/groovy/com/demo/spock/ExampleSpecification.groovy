package com.demo.spock

import spock.lang.Specification


class ExampleSpecification extends Specification {
    def "should be a simple assertion"() {
        expect:
        1 == 1
    }

    def "should demonstrate given-when-then"() {
        when:
        int sides = new Polygon(4).numberOfSides

        then:
        sides == 4
    }
}
