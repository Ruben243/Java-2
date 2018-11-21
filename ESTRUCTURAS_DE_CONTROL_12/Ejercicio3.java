/*
Ejercicio 3

Mostrar toda la tabla de multiplicar.

*/

public class Ejercicio3 {

    public static void main (String args[]) {


		String resultado;

		int tabla;
		int contador;

		tabla = 1;

		resultado = "";

		while (tabla <= 10) {
			
			contador = 1;
			
			resultado += "\n\nLa tabla de multiplicar del " + tabla + "\n\n";

			while (contador <= 10) {

			resultado += tabla + " * " + contador + " = " + (tabla*contador) + " \n";

			contador++;

			}

			tabla++;
		
		}

		System.out.println(resultado);

    }

}
