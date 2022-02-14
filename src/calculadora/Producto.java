package calculadora;

/**
 * <h2>Clase que define los métodos representados,
 *  y que están relacionados con la operación matemática producto</h2><br>
 * 
 * Dicha clase será utilizada por una calculadora.
 * 
 * @author Jon
 * @since 24/01/2022
 * 
 * @see Cociente
 * @see Resta
 * @see Suma
 */

public class Producto {
	
	/**
	 * Método que devolverá un valor numérico real resultado del producto 
	 * entre los factores <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * El valor que se introduzca para representar los factores <u> no podrá ser negativo</u>
	 *  ya que la calculadora no podrá utilizar valores negativos.<br>
	 * 
	 * @param num1 representa el valor numérico real del primer factor del producto.
	 * @param num2 representa el valor numérico real del segundo factor del producto.
	 * 
	 * @return Devolverá un <u>valor numérico real</u> 
	 * cuyo resultado será el producto de los factores num1 y num2 representados anteriormente.<br>
	 * Si el valor introducido es negativo se devuelve código de error -1.
	 * 
	 */
	
	public static double productoDosReales(double num1, double num2) {
			if(num1 < 0 || num2 < 0)
				return -1;
			else
			return num1 * num2;
	}
	
	/**
	 * Método que devolverá un valor numérico entero resultado del producto
	 * entre los factores <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * El valor que se introduzca para representar los factores <u>no podrá ser negativo</u>
	 *  ya que la calculadora no podrá utilizar valores negativos.<br>
	 * 
	 * @param num1 representa el valor numérico entero del primer factor del producto.
	 * @param num2 representa el valor numérico entero del segundo factor del producto.
	 * 
	 * @return Devolverá un <u>valor numérico entero</u> cuyo resultado será 
	 * el producto de los factores num1 y num2 representados anteriormente.<br>
	 * Si el valor introducido es negativo se devuelve código de error -1.
	 * 
	 */
	public static int productoEntero(int num1, int num2) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else
		return num1 * num2;
	}
	
	/**
	 * Método que devolverá un valor numérico real resultado del productor entre
	 * los factores <i>num1</i>, <i>num2</i> y num3.<br>
	 * 
	 * El valor que se introduzca para representar los factores <u>no podrá ser negativo</u>
	 *  ya que la calculadora no podrá utilizar valores negativos.<br>
	 * 
	 * @param num1 representa el valor numérico real del primer factor del producto.
	 * @param num2 representa el valor numérico real del segundo factor del producto.
	 * @param num3 representa el valor numérico real del tercer factor del producto.
	 * 
	 * @return Devolverá un <u>valor numérico real</u> cuyo resultado será 
	 * el producto de los factores num1, num2 y num3.<br>
	 * Si el valor introducido es negativo se devuelve código de error -1.
	 * 
	 */
	public static double productoTresReales(double num1, double num2, double num3) {
		if(num1 < 0 || num2 < 0 || num3 <0)
			return -1;
		else
		return num1 * num2 * num3;
	}
	
	/**
	 * Método que devolverá un valor numérico real resultado de la potencia entre la 
	 * base (num1) y el exponente (num2), a través de la clase <i>Math.pow()</i><br>
	 * 
	 * El valor que se introduzca para representar los factores <u>no podrá ser negativo</u>
	 *  ya que la calculadora no podrá utilizar valores negativos.<br>
	 * 
	 * Se ha utilizado tipo de dato double por lo que no 
	 * habría problema con el valor del dato retornado si este es muy alto.
	 * 
	 * @param num1 representa el valor numérico real de la base de la potencia.
	 * @param num2 representa el valor numérico real del exponente de la potencia.
	 * 
	 * @return Devolverá un <u>valor numérico real</u> cuyo resultado 
	 * será la potencia establecida entre los valores de num1 y num2.<br>
	 * Si el valor introducido es negativo se devuelve código de error -1.
	 * 
	 */
	
	public static double potencia(double num1, double num2) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else
		return Math.pow(num1, num2);
	}
}
