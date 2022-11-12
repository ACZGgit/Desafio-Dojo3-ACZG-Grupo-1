package Services

import groovy.test.GroovyTestCase
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeAll


class dietaServiceTest extends GroovyTestCase{

	static dietaService dieta_Service

	@BeforeAll
	static void instanciaDietaService(){
		dieta_Service = new dietaService()
	}

	@Test
	void testEntradaComum() {
		String saida = dieta_Service.executar('ABCD,AB,C')
		assertEquals('D', saida)

	}

	@Test
	void testEntradaComumInvertida() {
		String saida = dieta_Service.executar('ABCD,BA,C')
		assertEquals('D', saida)

	}

	@Test
	void testEntradaRepetido() {
		String saida = dieta_Service.executar('ABCD,BA,CB')
		assertEquals('CHEATER', saida)

	}

	@Test
	void testSaidaOrdenada() {
		String saida = dieta_Service.executar('ZDCBAY,BC,A')
		assertEquals('DYZ', saida)

	}

	@Test
	void testEntradaComEspaco() {

		String saida = dieta_Service.executar("ABEDCS, , ")
		assertEquals("ABCDES", saida)
	}

	@Test
	void testIngeriuAlimentoForaDaDieta() {

		String saida = dieta_Service.executar("EDSMB,MSD,A")
		assertEquals("CHEATER", saida)
	}


}
