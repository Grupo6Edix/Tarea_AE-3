package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("--------------------");
		System.out.println("Comienzo de las pruebas: " + "\n");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		Suma.acumulado(0);
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
	void testSumarDosReales_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 8.00;
		double resultadoReal = Suma.sumarDosReales(6.00, 2.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testSumarDosReales_Incorrecto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = -1;
		double resultadoReal = Suma.sumarDosReales(-6.00, 2.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testSumarDosEnteros_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 8;
		double resultadoReal = Suma.sumarDosEnteros(5, 3);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testSumarDosEnteros_Incorrecto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = -1;
		double resultadoReal = Suma.sumarDosEnteros(5, -3);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testSumarTresReales_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 10.00;
		double resultadoReal = Suma.sumarTresReales(6.00, 3.00, 1.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testSumarTresReales_Incorrecto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = -1;
		double resultadoReal = Suma.sumarTresReales(6.00, -3.00, 1.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testAcumulado_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 20.00;
		Suma.acumulado(20.00);
		
		assertEquals(resultadoEsperado, Suma.getSumaAcumulada());
	}
	
	@Test
	void testAcumulado_Incorrecto() {
		System.out.println("Realizando test.");
		double resultadoEsperado = 0;
		Suma.acumulado(-20.00);
		
		assertEquals(resultadoEsperado, Suma.getSumaAcumulada());
	}

}
