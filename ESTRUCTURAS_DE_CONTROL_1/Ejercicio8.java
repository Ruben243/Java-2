/*

Ejercicio 8

Escriba una aplicación que muestre en la ventana de consola los multiplos del
entero 2, su ciclo no debe de terminar.

*/

public class Ejercicio8 {

    public static void main (String args[]) {

		int contador;

		contador = 1;

		while (true) {

			System.out.println (2*contador);

			contador++;

		}

    }

}