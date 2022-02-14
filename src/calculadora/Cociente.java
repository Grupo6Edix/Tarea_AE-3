package calculadora;

/**
 * <h2>Clase que representa todos los métodos relacionados con una división</h2><br>
 * 
 * Esta clase será usada por una calculadora.
 * 
 * @author Jorge
 * @since 25/01/2022
 * 
 * @see Producto
 * @see Resta
 * @see Suma
 */

public class Cociente {
	
	/**
	 * Método que devuelve un valor numérico real
	 * resultado de la división de los parámetros <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * Si se introduce el valor 0 en el parámetro <i>num2</i>,
	 * se producirá un error por excepción aritmética.<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.
	 * 
	 * @param num1 representa el valor numérico real del dividendo de la división.
	 * @param num2 representa el valor numérico real del divisor de la división.
	 * 
	 * @return Devuelve un <u>valor numérico real</u> siendo el resultado del dividendo entre el divisor.<br>
	 * Si se introduce un número negativo, devuelve código de error -1.<br>
	 * Si se introduce el número 0 en el parámetro num2, devuelve código de error -2.
	 */

	public static double divisionReal(double num1, double num2) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else if (num2 == 0)
			return -2;
		else	
			return num1 / num2;
	}
	
	/**
	 * Método que devuelve un valor numérico real
	 * resultado de la división de los parámetros <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * Si se introduce el valor 0 en el parámetro <i>num2</i>,
	 * se producirá un error por excepción aritmética.<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * Debido a que existen posibilidades de que la división de números enteros no devuelva valor entero, 
	 * se hace un cast a tipo <i>double</i> de la división de los parámetros num1 y 
	 * num2 y el tipo del método sería double.
	 * 
	 * @param num1 representa el valor numérico entero del dividendo de la división.
	 * @param num2 representa el valor numérico entero del divisor de la división.
	 * 
	 * @return Devuelve un <u>valor numérico real</u> siendo el resultado del dividendo entre el divisor.
	 * Si se introduce un número negativo, devuelve código de error -1.<br>
	 * Si se introduce el número 0 en el parámetro num2, devuelve código de error -2.
	 */
	
	public static double divisionEntera(int num1, int num2) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else if (num2 == 0)
			return -2;
		else
			return (double) num1 / num2;
	}
	
	/**
	 * Método que devuelve el inverso de un número real.<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * El parámetro de entrada num1 se utiliza de divisor del número 1 para conseguir su inverso multiplicativo.
	 * 
	 * @param num1 representa el valor numérico real que se quiere invertir.
	 * @return Devuelve un <u>valor numérico real</u> siendo el inverso multiplicativo del parámetro.<br>
	 * Si se introduce un número negativo, devuelve código de error -1.
	 */
	
	public static double inverso(double num1) {	
		if(num1 < 0)
			return -1;
		else
			return 1 / num1;
	}
	
	/**
	 * Método que devuelve la raiz cuadrada del parámetro introducido en la clase <i>Math.sqrt().</i>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.
	 * 
	 * @param num1 representa el valor numérico real del cual se quiere calcular su raiz cuadrada.
	 * @return Devuelve el <u>valor real de la raiz cuadrada</u> del valor proporcionado en el parámetro.<br>
	 * Si se introduce un número negativo, devuelve código de error -1.
	 */
	
	public static double raiz(double num1) {
		if(num1 < 0)
			return -1;
		else
			return Math.sqrt(num1);
	}
	
	
}
