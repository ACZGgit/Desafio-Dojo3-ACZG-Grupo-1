package parser

import groovy.test.GroovyTestCase
import org.junit.jupiter.api.Test


class ParserTest extends GroovyTestCase{

	Parser parser

	@Test
	void testExecutar1() {
		parser = new Parser()

		String saida = parser.executar('5,5,F,F,F,F,C')
		assertEquals('8', saida)
	}
}
