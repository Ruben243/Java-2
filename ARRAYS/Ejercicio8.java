/*

EJERCICIO 8

Escriba un método recursivo llamado minimoRecursivo que tome como argumentos un
array de enteros y su longitud, y que devuelva el elemento más pequeño del arreglo.
Este método debe dejar de procesarse y regresar cuando reciba un arreglo de un
elemento.
 
*/


import javax.swing.JOptionPane;


public class Ejercicio8 {


    public int minimoRecursivo (int matriz[], int longitud) {


		int minimo;

		if (longitud != 0) {

			minimo = minimoRecursivo (matriz, longitud -1);	    
	 
			if (matriz[longitud] < minimo)

			return matriz[longitud];

			else return minimo;

		}
		else return matriz[longitud];

    }

    public static void main (String args[]) {


		int datos[] = {1,2,3,4,-5,5,30,-2,-20};

		int resultado;

		Ejercicio8 ejercicio8 = new Ejercicio8 ();
		



		resultado = ejercicio8.minimoRecursivo (datos,datos.length-1);

		JOptionPane.showMessageDialog (null, "El número más pequeño del array es " + resultado);

		System.exit (0);


    }
}
