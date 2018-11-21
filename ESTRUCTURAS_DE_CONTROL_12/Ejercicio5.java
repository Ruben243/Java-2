/*

Ejercicio 5

Escribir una aplicación que utilice ciclos para imprimir la siguiente tabla de
valores:

N		10*N		100*N		1000*N

1		10			100		1000
2		20			200		2000
3		30			300		3000
.		.			.			.
.		.			.			.

*/

public class Ejercicio5 {

    public static void main (String args[]) {


		String resultado;
		int contadorN;

		contadorN = 1;

		resultado = "N\t\t10*N\t\t100*N\t\t1000*N\n\n";

		while (contadorN <= 10) {

			resultado += contadorN + "\t\t" + 10*contadorN + "\t\t" + 100*contadorN + "\t\t" + 1000*contadorN + "\n";

			contadorN++;

		}

		System.out.println (resultado);

    }

}