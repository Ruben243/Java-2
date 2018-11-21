/*

Ejercicio 4

Escriba una aplicación que muestre los siguientes patrones, empleando para ello
solo las siguientes instrucciones:

System.out.print ("*")

System.out.print (" ")

System.out.println ()

más bucles.

*
**
***
****
*****
******
*******
********
*********
**********

**********
*********
********
*******
******
*****
****
***
**
*

**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
         
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********

*/

public class Ejercicio4 {

    public static void main (String args[]) {

		for (int i=1; i<=10; i++) {

			for (int j=1; j<=i; j++) {

			System.out.print("*");
		}

			System.out.println();

		}

		System.out.println ();

		for (int i=1; i<=10; i++) {

			for (int j=10; j>=i; j--) {

			System.out.print ("*");

			}

			System.out.println ();

		}

		System.out.println ();

		for (int i=1; i<=10; i++) {

			for (int j=1; j<i; j++) {

			System.out.print (" ");
			}

			for (int k=10; k>=i; k--) {

			System.out.print ("*");

			}

			System.out.println ();
		}

		System.out.println ();


		for (int i=1; i<=10; i++) {

			for (int j=10; j>i; j--) {

			System.out.print (" ");

			}

			for (int k=1; k<=i; k++) {

			System.out.print ("*");

			}

			System.out.println ();

		}

    }

}