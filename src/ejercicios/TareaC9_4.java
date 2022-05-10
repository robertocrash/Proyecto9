package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TareaC9_4 {

	// C9_4
	/*
	 * Pide al usuario dos palabras. Si son las mismas, imprima “Genial – son
	 * iguales”. Si son las mismas pero que la primera está en mayúsculas y la otra
	 * en minúsculas, imprima “Bien - casi lo mismo”. Si tienen la misma longitud,
	 * imprima “Al menos tienen la misma longitud”. Necesitarás las siguientes
	 * funciones de cadena: compareTo(otherString) (que devuelve true si coincide)
	 * compareToIgnoreCase(otherString) (que devuelve true si coincide
	 * independientemente del caso) length() (que devuelve la longitud)
	 * 
	 * 
	 */

	public static void compararPalabras() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una palabra");
		String cad1 = teclado.nextLine();

		System.out.println("Introduce una palabra");
		String cad2 = teclado.nextLine();

		if (cad1.compareTo(cad2) == cad2.compareTo(cad1)) {
			System.out.println("Genial, son iguales");
		} else if (cad1.compareToIgnoreCase(cad2) == cad2.compareToIgnoreCase(cad1)) {
			System.out.println("Bien, casi lo mismo");
		} else if (cad1.length() == cad2.length()) {
			System.out.println("Al menos tienen la misma longitud");
		} else {
			System.out.println("Palabras no validas");
		}

	}

}
