package ejercicios;

import java.util.Scanner;

public class TareaC9_1 {

	// C9_1

	/*
	 * Nuestro programa convertirá un peso expresado en libras en kilogramos. a.
	 * Nuestra entrada es el peso en libras. b. Nuestra salida es el peso en
	 * kilogramos c. También sabemos que Kilogramos = Libras / 2.2
	 * 
	 * • Dado que un peso no puede ser un número negativo, nuestro programa no debe
	 * aceptar un número negativo como un peso válido. • Vamos a reescribir el
	 * programa para imprimir un mensaje de error si el peso introducido en libras
	 * es negativo.
	 * 
	 */
	
	public static void libraAkg() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el peso(libras):");
		double libra = teclado.nextDouble();
		
		if (libra > 0) {
			double kg = libra / 2.2;
			
System.out.println("Has introducido "+libra+" libra/s, convertida en Kg es: "+ Math.round(kg*100d)/100d);
		} else {
			System.out.println("El valor debe ser superior a 0, prueba de nuevo.");
			System.exit(-1);
		}
		teclado.close();
	}
	
	
	
	

}
