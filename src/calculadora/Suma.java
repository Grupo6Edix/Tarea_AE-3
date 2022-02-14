package calculadora;

/**
 * <h2>La clase Suma pertenece a la calculadora que sumara dos o tres valores númericos entre si.</h2>
 * 
 * @author Daviid
 * @since 19/01/2022
 * 
 * @see Producto
 * @see Resta
 * @see Cociente
 */
public class Suma {
		
	/**
	 * Atributo de clase que representa el acumulado del metodo acumulado.
	 */
	
	private static double sumaAcumulada;
		
	/**
	 * Método get para devolver el valor de la acumulación del método acumulado().
	 * 
	 * @return sumaAcumulada acumulación de valores de entrada del método acumulado()
	 */
	
	public static double getSumaAcumulada() {
		return sumaAcumulada;
	}
		
	/**
	 * Método que devuelve un valor númerico real de <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * No se permiten números negativos en los parámetros de entrada.
	 * 
	 * @param num1 representa el primer valor númerico real que se sumara.
	 * @param num2 representa el segundo valor númerico real que se sumara.
	 * 
	 * @return sumarDosReales suma dos números reales entre si,<br>
	 * y te devuelve el valor de num1 y num2.<br>
	 * Si se introduce un número negativo, devuelve código de error -1.
	 */
	
	public static double sumarDosReales(double num1, double num2) {
		if (num1 < 0 || num2 < 0)
			return -1;
		else
			return (double) num1 + num2;
	}
	
	/**
	 * Método que devuelve un valor númerico entero de <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * No se permiten números negativos en los parámetros de entrada.
	 * 
	 * @param num1 representa el primer valor númerico entero que se sumara.
	 * @param num2 representa el segundo valor númerico entero que se sumara.
	 * 
	 * @return sumarDosEnteros suma dos números enteros entre si,<br>
	 * y te devuelve el valor de num1 y num2.<br>
	 * Si se introduce un número negativo, devuelve código de error -1.
	 */
	
	public static double sumarDosEnteros(int num1, int num2) {
		if (num1 < 0 || num2 < 0)
			return -1;
		else
			return num1 + num2;
	}
	
	/**
	 * Método que devuelve un valor númerico real de <i>num1</i>, <i>num2</i> y <i>num3</i>.<br>
	 * 
	 * No se permiten números negativos en los parámetros de entrada.
	 * 
	 * @param num1 representa el primer valor númerico real que se sumara.
	 * @param num2 representa el segundo valor númerico real que se sumara.
	 * @param num3 representa el tercer valor númerico real que se sumara.
	 * 
	 * @return sumarTresReales suma tres números reales entre si, y te devuelve el valor de num1,<br>
	 * num2 y num3.<br>
	 * Si se introduce un número negativo, devuelve código de error -1.
	 */
	
	public static double sumarTresReales(double num1, double num2, double num3) {
		if (num1 < 0 || num2 < 0 || num3 < 0)
			return -1;
		else
			return num1 + num2 + num3;
	}
		
	/**
	 * Método que sirve para sumar el parámetro de entrada al acumulado del método.
	 * 
	 * @param num1 representa el valor númerico real
	 * que se quiere sumar al acumulado del atributo de clase <i>sumaAcumulada</i>.<br>
	 * Si se introduce un número negativo, devuelve código de error -1.
	 */
	
	public static void acumulado(double num1) {
		if (num1 < 0)
			sumaAcumulada += 0;
		else
			sumaAcumulada += num1;
	}
		
}
