package ejercicios;

import java.util.Scanner;

public class TareaC9_5 {

	// C9_5
	/*
	 * Tienes que crear un programa que de recomendaciones sobre la cantidad de
	 * calor�as que una persona debe comer cada d�a. Las calor�as son unidades de
	 * energ�a que se encuentran en todos los alimentos. Basar�s tu recomendaci�n en
	 * el peso de la persona y si la persona tiene un estilo de vida activo o
	 * sedentario. Si la persona es sedentaria, el factor de actividad de esa
	 * persona es 13. Si la persona es activa, el factor de actividad de esa persona
	 * es 15. Multiplicando el factor de actividad por el peso de la persona,
	 * obtendr�s el n�mero recomendado de calor�as.
	 * 
	 * 
	 */

	public static void caloriasRecomendadas() {

		Scanner teclado = new Scanner(System.in);

		// Multiplicar peso * factor actividad

		int resultado;
		String actividad;

		System.out.println("Introduce tu peso");
		int peso = teclado.nextInt();

		System.out.println("Eres sedentario(S) o activo(A)");
		actividad = teclado.next();

		if (actividad.equals("S") || actividad.equals("sedentario")) {

			resultado = peso * 13;

			System.out.println("Tu numero recomendado de calorias siendo sedentario es:" + resultado);

		} else if (actividad.equals("A") || actividad.equals("activo")) {

			resultado = peso * 15;
			System.out.println("Tu numero recomendado de calorias siendo activo es:" + resultado);
		} else {
			System.out.println("No has seleccionado ninguna de las 2 opciones");
		}

	}

}
