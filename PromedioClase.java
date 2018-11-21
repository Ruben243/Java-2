/*
 * PromedioClase.java
 */
 
 import java.util.Scanner;
 
 public class PromedioClase
 {
	 public static void main (String args[])
	 {
		 int total; // Suma de las notas
		 int contador; // Número de nota a introducir
		 int calificacion; // Valor de la nota
		 int promedio; // Media de las notas
		 
		 Scanner entrada = new Scanner (System.in);
		 
		 total = 0;
		 contador = 1;
		 calificacion = 0;
		 promedio = 0;
		 
		 while (contador <= 10) {
			System.out.print ("Introduce nota: ");
			calificacion = entrada.nextInt();
			
			total = total + calificacion;
			contador = contador + 1;
		 }
		 
		 promedio = total / 10;
		 
		 System.out.printf("El promedio es %d", promedio);
		 
	 }
 }
 
	

