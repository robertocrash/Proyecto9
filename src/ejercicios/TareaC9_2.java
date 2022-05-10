package ejercicios;

import java.util.Scanner;

public class TareaC9_2 {

	// C9_2
	/*
	 * Tienes que crear un programa de Seguro de Auto en el que se va a determinar
	 * el costo de una prima de seguro de automóvil, basado en la edad del conductor
	 * y el número de accidentes que el conductor ha tenido. El cargo inicial de
	 * seguro básico es de 500 €. Hay un recargo de 100 € si el conductor es menor
	 * de 25 años y un recargo adicional por accidentes:
	 * 
	 */

	public static void seguroCoches() {

		Scanner teclado = new Scanner(System.in);

		// Variables creadas
		int seguro;
		int seguroBasico = 500;
		int edad;
		int recargo = 100;

		// Tasas accidentes
		int accidente1 = 50;
		int accidente2 = 125;
		int accidente3 = 225;
		int accidente4 = 375;
		int accidente5 = 575;

		System.out.println("Introduce tu edad:");
		edad = teclado.nextInt();

		System.out.println("¿Cuantos accidentes has tenido?(Max 6 accidentes)");
		int accidente = teclado.nextInt();

		switch (accidente) {
		case 1:
			if (edad < 25) {

				seguro = seguroBasico + recargo + accidente1;
				System.out.println("Tu seguro a pagar es: " + seguro);

			} else {

				seguro = seguroBasico + accidente1;
				System.out.println("Tu seguro a pagar es: " + seguro);

			}

			break;

		case 2:

			if (edad < 25) {

				seguro = seguroBasico + recargo + accidente2;
				System.out.println("Tu seguro a pagar es: " + seguro);

			} else {

				seguro = seguroBasico + accidente2;
				System.out.println("Tu seguro a pagar es: " + seguro);

			}

			break;

		case 3:

			if (edad < 25) {

				seguro = seguroBasico + recargo + accidente3;
				System.out.println("Tu seguro a pagar es: " + seguro);

			} else {

				seguro = seguroBasico + accidente3;
				System.out.println("Tu seguro a pagar es: " + seguro);

			}

			break;

		case 4:
			if (edad < 25) {

				seguro = seguroBasico + recargo + accidente4;
				System.out.println("Tu seguro a pagar es: " + seguro);

			} else {

				seguro = seguroBasico + accidente4;
				System.out.println("Tu seguro a pagar es: " + seguro);

			}

			break;

		case 5:

			if (edad < 25) {

				seguro = seguroBasico + recargo + accidente5;
				System.out.println("Tu seguro a pagar es: " + seguro);

			} else {

				seguro = seguroBasico + accidente5;
				System.out.println("Tu seguro a pagar es: " + seguro);

			}

			break;

		default:

			System.out.println("No se te puede asegurar");

			break;
		}

		teclado.close();

	}

}
