import spock.lang.Specification


class TestSpecification extends Specification {

    def "simple test"() {
        given:
        int i = 1

        when:
        i++

        then:
        i==2

    }

    def "get typeahead components"(){
        given:
        String component = 'TypeAhead'

        when:
        def gotComponents = [id:'TypeAhead', version:'latest']

        then:
        def got = get
    }
}
