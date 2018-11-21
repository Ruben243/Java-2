/*
 * AprobadoSuspenso.java
 */
 
 import java.util.Scanner;
 
 public class AprobadoSuspenso
 {
	 public static void main (String args[])
	 {
		 
		 int numeroAprobados = 0; // Almacenamos aprobados
		 int numeroSuspensos = 0; // Almacenamos suspensos
		 int contador = 1; // Almacenamos el número de nota a pedir
		 int nota = 0; // Almacena la nota pedida
		 
		 Scanner entrada = new Scanner (System.in);

		 while (contador <= 10)
		 {
			 System.out.println ("Introduce nota: ");
			 nota = entrada.nextInt();
			 
			 if (nota >= 5)
				numeroAprobados = numeroAprobados + 1;
			 else
				numeroSuspensos = numeroSuspensos + 1;
				
			 contador = contador + 1;
				
		 }
		 
		 System.out.printf ("N. Aprobados: %d\n", numeroAprobados);
		 System.out.printf ("N. Suspensos: %d\n", numeroSuspensos);
	 }
 }
