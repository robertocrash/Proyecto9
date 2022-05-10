package ejercicios;

import java.util.Scanner;

public class TareaC9_3 {

	// C9_3
	/*
	 * Pide al usuario un número e imprima “bien” si el número es menor que 5, entre
	 * 8 y 10 o mayor que 33. De lo contrario, imprima “mal”. Utilice el operador ||
	 * en su declaración if.
	 * 
	 */

	public static void imprimirNumero() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int num = teclado.nextInt();
		
		if (num <5 || num >= 8 && num <=10 || num > 33) {
			System.out.println("Bien");
		} else {
			System.out.println("Mal");
		}
		
		
	}
	
}
