package calculadora;

/**
 * <h2>Clase que representa todos los métodos relacionados con una resta</h2><br>
 * 
 * Esta clase será usada por una calculadora.
 * 
 * @author Jorge
 * @since 25/01/2022
 * 
 * @see Producto
 * @see Cociente
 * @see Suma
 */

public class Resta {
	
	/**
	 * Atributo de clase que representa el acumulado del resultado del método acumulado().
	 */
	
	private static double restaAcumulada;
	
	
	/**
	 * Método get para devolver el valor de la acumulación del método acumulado().
	 * 
	 * @return restaAcumulada acumulación de valores de entrada del método acumulado()
	 */
	
	public static double getRestaAcumulada() {
		return restaAcumulada;
	}

	/**
	 * Método que devuelve un valor numérico real
	 * resultado de la resta de dos parámetros: <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * @param num1 representa el valor numérico real del primer parámetro de la resta.
	 * @param num2 representa el valor numérico real del segundo parámetro de la resta.
	 * 
	 * @return Devuelve un <u>valor numérico real</u> siendo el resultado de la resta entre
	 * los dos parámetros.<br>
	 * Si se introduce un número negativo, devuelve código de error -1.
	 */

	public static double restaReal(double num1, double num2 ) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else
			return num1 - num2;
	}	
		
	/**
	 * Método que devuelve un valor numérico entero
	 * resultado de la resta de dos parámetros: <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * @param num1 representa el valor numérico entero del primer parámetro de la resta.
	 * @param num2 representa el valor numérico entero del segundo parámetro de la resta.
	 * 
	 * @return Devuelve un <u>valor numérico entero</u> siendo el resultado de la resta entre
	 * los dos parámetros.<br>
	 * Si se introduce un número negativo, devuelve código de error -1.
	 */
		
	public static int restaEntera(int num1, int num2 ) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else
			return num1 - num2;
	}
	
	/**
	 * Método que devuelve un valor numérico real
	 * resultado de la resta de tres parámetros: <i>num1</i>, 
	 * <i>num2</i> y <i>num3</i> .<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * @param num1 representa el valor numérico real del primer parámetro de la resta.
	 * @param num2 representa el valor numérico real del segundo parámetro de la resta.
	 * @param num3 representa el valor numérico real del tercer parámetro de la resta.
	 * 
	 * @return Devuelve un <u>valor numérico entero</u> siendo el resultado de la resta entre
	 * los tres parámetros.<br>
	 * Si se introduce un número negativo, devuelve código de error -1.
	 */
	
	public static double restaRealTriple(double num1, double num2, double num3) {
		if(num1 < 0 || num2 < 0 || num3 < 0)
			return -1;
		else
			return num1 - num2 - num3;
	}
	
	/**
	 * Método que sirve para restar el parámetro de entrada al acumulado del método.
	 * 
	 * Para ello, se acumula el valor del parámetro <i>num1</i>
	 * en el atributo de clase <i>restaAcumulada</i>, el cual restará a ese acumulada los siguientes
	 * valores que se introduzcan del parámetro.
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * @param num1 representa el valor numérico real que se quiere restar
	 * al acumulado del método.<br>
	 * Si se introduce un número negativo, devuelve código de error 0.
	 */
	
	public static void acumulado(double num1) {
		if(num1 < 0)
			restaAcumulada -= 0;
		else
			restaAcumulada -= num1;
	}
	
}
