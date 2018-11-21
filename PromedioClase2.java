/*
 * PromedioClase2.java
 */
 
import java.util.Scanner;
 
public class PromedioClase2 {

	public static void main (String args[]) {
	
		int total; // Suma de las notas
		int contador; // Número notas introducidas
		int calificacion; // La nota introducida
		
		double promedio; // La media de las notas
		
		Scanner entrada = new Scanner (System.in);
		
		total = 0;
		contador = 0;
		
		System.out.print ("Introduzca nota o -1 para terminar: ");
		calificacion = entrada.nextInt();
		
		while (calificacion != -1) {
			total = total + calificacion;
			contador = contador + 1;
			
			System.out.print ("Introduzca nota o -1 para terminar: ");
			calificacion = entrada.nextInt();
		}
		
		if (contador != 0) {
			promedio = (double) total / contador;
		
			System.out.printf("El promedio de las %d notas es: %.2f", contador,
							promedio);
		}
		else {
			System.out.println ("No se han introducido notas");
		}					
			
	}
	
}
