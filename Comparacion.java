/* Comparacion.java
 * Comparación de dos numeros
 */
 
 import java.util.Scanner;
 
 public class Comparacion
 {
	 public static void main (String args[])
	 {
		int numero1 = 0;
		int numero2 = 0;
		 
		Scanner entrada = new Scanner (System.in);
		 
		System.out.print ("Primer operando: ");
		numero1 = entrada.nextInt();
		
		System.out.print ("Segundo operando: ");
		numero2 = entrada.nextInt();
		
		
		if (numero1 == numero2) {
			System.out.printf("%d == %d\n", numero1, numero2);
		}
		
		if (numero1 != numero2) {
			System.out.printf("%d != %d\n", numero1, numero2);
		}
		
		if (numero1 > numero2) {
			System.out.printf("%d > %d\n", numero1, numero2);
		}
		
		if (numero1 < numero2) {
			System.out.printf("%d < %d\n", numero1, numero2);
		}

		if (numero1 >= numero2) {
			System.out.printf("%d >= %d\n", numero1, numero2);
		}
		
		if (numero1 <= numero2) {
			System.out.printf("%d <= %d\n", numero1, numero2);
		}

 
	 }
 }
