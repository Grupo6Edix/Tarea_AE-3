package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

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
	void testProductoDosReales_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 6.00;
		double resultadoReal = Producto.productoDosReales(3.00, 2.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testProductoDosReales_Inorrecto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = -1;
		double resultadoReal = Producto.productoDosReales(-3.00, 2.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testProductoEntero_Correcto() {
		System.out.println("Realizando test.");
		
		int resultadoEsperado = 10;
		int resultadoReal = Producto.productoEntero(5, 2);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	void testProductoEntero_Incorrecto() {
		System.out.println("Realizando test.");
		
		int resultadoEsperado = -1;
		int resultadoReal = Producto.productoEntero(5, -2);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testProductoTresReales_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 150.00;
		double resultadoReal = Producto.productoTresReales(3.00, 10.00, 5.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testProductoTresReales_Incorrecto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = -1;
		double resultadoReal = Producto.productoTresReales(3.00, -10.00, 5.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testPotencia_Correcto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = 9.00;
		double resultadoReal = Producto.potencia(3.00, 2.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testPotencia_Incorrecto() {
		System.out.println("Realizando test.");
		
		double resultadoEsperado = -1;
		double resultadoReal = Producto.potencia(-3.00, 2.00);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
