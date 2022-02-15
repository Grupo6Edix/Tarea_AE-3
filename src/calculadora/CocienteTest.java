package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocienteTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("--------------------");
		System.out.println("Comienzo de las pruebas: " + "\n");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Fin de las pruebas.");
		System.out.println("--------------------");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Comienzo de un test.");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Fin de un test." + "\n");
	}

	@Test
	void testDivisionReal_Correcto() {
		double resultadoEsperado = 2.50;
		double resultadoReal = Cociente.divisionReal(5.00, 2.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testDivisionReal_Incorrecto_1() {
		double resultadoEsperado = -1;
		double resultadoReal = Cociente.divisionReal(-1.20, 2.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testDivisionReal_Incorrecto_2() {
		double resultadoEsperado = -2;
		double resultadoReal = Cociente.divisionReal(2.50, 0.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testDivisionEntera_Correcto() {
		double resultadoEsperado = 4.00;
		double resultadoReal = Cociente.divisionEntera(20, 5);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testDivisionEntera_Incorrecto_1() {
		double resultadoEsperado = -1;
		double resultadoReal = Cociente.divisionEntera(-1, 2);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testDivisionEntera_Incorrecto_2() {
		double resultadoEsperado = -2;
		double resultadoReal = Cociente.divisionEntera(1, 0);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testInverso_Correcto() {
		double resultadoEsperado = 0.25;
		double resultadoReal = Cociente.inverso(4.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testInverso_Incorrecto() {
		double resultadoEsperado = -1;
		double resultadoReal = Cociente.inverso(-1.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testRaiz_Correcto() {
		double resultadoEsperado = 2.00;
		double resultadoReal = Cociente.raiz(4.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testRaiz_Incorrecto() {
		double resultadoEsperado = -1;
		double resultadoReal = Cociente.raiz(-2.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	
	
	
}
