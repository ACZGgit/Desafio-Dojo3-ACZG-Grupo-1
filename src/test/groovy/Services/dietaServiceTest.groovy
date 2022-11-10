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
	void testExecutar1() {

		String saida = dieta_Service.executar('ABCD,AB,C')
		assertEquals('D', saida)

	}

	@Test
	void testExecutar2() {

		String saida = dieta_Service.executar("ABEDCS, , ")
		assertEquals("ABEDCS", saida)
	}

	@Test
	void testExecutar3() {

		String saida = dieta_Service.executar("EDSMB,MSD,A")
		assertEquals("CHEATER", saida)
	}

}
