/* PedirNombreEdad.java
 * 
 * Pide el nombre y la edad y los muestra por Pantalla
 * */
 
 import java.util.Scanner;
 
 public class PedirNombreEdad
 {
	 
	 public static void main (String args[])
	 {

		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		int edad;
		
		System.out.print("Cuál es tú nombre? ");
		nombre = entrada.next();
		
		System.out.print("Cuál es tú edad? ");
		edad = entrada.nextInt();
		
		System.out.printf("Mi nombres es %s y tengo %d años\n", nombre, edad);
		
		
		
		
		
		
		 
		 
	 }
 }
