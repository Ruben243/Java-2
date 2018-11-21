/*

Ejercicio 7

Escriba una aplicación que utilice sólo las instrucciones de salida

System.out.print ("* ");
System.out.print (" ");
System.out.print ();

para mostrar el patrón de tablero de damas que se muestra a continuación.

* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
  
Observe que una llamada al método System.out.println sin argumentos hace que el
programa imprima un solo carácter de nueva linea.

*/

public class Ejercicio7 {

    public static void main (String args[]) {

		int fila;
		int columna;

		fila = 1;
		columna = 1;


		while (fila <= 8) {

			columna = 1;

			while (columna <= 8) {

				System.out.print ("*");
				System.out.print (" ");

				columna++;

			}

			System.out.println ();

			fila++;

		}
    }

}