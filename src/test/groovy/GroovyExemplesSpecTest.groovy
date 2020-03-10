import spock.lang.Specification
import spock.lang.Unroll

class GroovyExamplesSpecTest extends Specification {

    @Unroll
    def "this is test method that I want to run"() {
        given:
        def myString = var1
        when:
        def empty = object
        then:
        var2 == myString
        where:
        var1   | var2   | object
        "Mama" | "Tata" | new ConstructorsMocking()
        "1234" | "1234" | new SpyExample<String>()
    }


}
