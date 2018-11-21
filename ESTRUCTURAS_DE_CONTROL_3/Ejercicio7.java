/*

Ejercicio 7

Escriba una aplicación que imprima la siguiente figura de rombo. Puede utilizar
instrucciones de salida que imprima un solo *, un solo espacio o un solo carácter
de nueva linea. Maximice el uso de la repetición (con instrucciones for anidadas
), y minimice el número de instrucciones de salida.

    *    
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
    
*/

public class Ejercicio7 {

    public static void main (String args[]) {


		for (int i=1; i<=9; i=i+2) {

			for (int j=1; j<=(9-i)/2; j++) {
				
				System.out.print (" ");

			}
			
			for (int k=1; k<=i; k++) {
			
				System.out.print ("*");
				
			}
			
			System.out.println ();

		}

		for (int i=7; i>=1; i=i-2) {

			for (int j=1; j<=(9-i)/2; j++) {

			System.out.print (" ");
			}

			for (int k=1; k<=i; k++) {

			System.out.print ("*");

			}

			System.out.println ();
		}

    }

}
