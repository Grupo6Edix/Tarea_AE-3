package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("--------------------");
		System.out.println("Iniciando las pruebas: " + "\n");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Finalizando las pruebas.");
		System.out.println("--------------------");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inicio de un test.");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Fin de un test." + "\n");
	}

	@Test
	void testRestaReal_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 1.75;
		double resultadoReal = Resta.restaReal(8.75, 7.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testRestaReal_Incorrecto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = -1;
		double resultadoReal = Resta.restaReal(5.00, -6.50);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}


	@Test
	void testRestaEntera_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 2;
		double resultadoReal = Resta.restaEntera(10, 8);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testRestaEntera_Incorrecto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = -1;
		double resultadoReal = Resta.restaEntera(4, -8);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testRestaRealTriple_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 4.00;
		double resultadoReal = Resta.restaRealTriple(12.00, 3.00, 5.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testRestaRealTriple_Incorrecto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = -1;
		double resultadoReal = Resta.restaRealTriple(15.00, -3.00, -7.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testAcumulado_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = -3.00;
		Resta.acumulado(3.00);
		
		assertEquals(resultadoEsperado, Resta.getRestaAcumulada());
	}	
	
	@Test
	void testAcumulado_Incorrecto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 0;
		Resta.acumulado(-15.00);
		
		assertEquals(resultadoEsperado, Resta.getRestaAcumulada());
	}	

}
