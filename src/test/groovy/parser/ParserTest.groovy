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

	@Test
	void testExecutar2() {
		parser = new Parser()

		String saida = parser.executar("3,5,F,F,C,C,C")
		assertEquals("2", saida)
	}

	@Test
	void testExecutar3() {
		parser = new Parser()

		String saida = parser.executar("5,10,F,F,F,F,F,C,C,C,C,C")
		assertEquals("0", saida)
	}

	@Test
	void testExecutar4() {
		parser = new Parser()

		String saida = parser.executar("1,2,F,F")
		assertEquals("3", saida)
	}

	@Test
	void testExecutar5() {
		parser = new Parser()

		String saida = parser.executar("3,3,C,F,C")
		assertEquals("2", saida)
	}

	@Test
	void testExecutar6() {
		parser = new Parser()

		String saida = parser.executar("4,3,F,F,C")
		assertEquals("5", saida)
	}
}
