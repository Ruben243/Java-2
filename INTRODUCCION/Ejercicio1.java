/*
EJERCICIO 1

Escriba una aplicación que pida al usuario que escriba dos números, que obtenga
los números del usuario e imprima la suma, producto, diferencia y cociente
(división) de los números.

*/

    import javax.swing.JOptionPane;

    public class Ejercicio1 {

	public static void main (String args[]) {


	    String cadenaNumero1;
	    String cadenaNumero2;
	    String resultado;

	    int numero1;
	    int numero2;

	    cadenaNumero1 = JOptionPane.showInputDialog ("Introduce el primer número: ");

	    cadenaNumero2 = JOptionPane.showInputDialog ("Introduce el segundo número: ");

	    numero1 = Integer.parseInt(cadenaNumero1);

	    numero2 = Integer.parseInt (cadenaNumero2);

	    resultado = "La suma de " + numero1 + " + " + numero2 + " es igual a " + (numero1+numero2) + "\n";

	    resultado += "El producto de " + numero1 + " * " + numero2 + " es igual a " + (numero1*numero2) + "\n";

	    resultado += "La diferencia de " + numero1 + " - " + numero2 + " es igual a " + (numero1-numero2) + "\n";

	    resultado += "El cociente de " + numero1 + " / " + numero2 + " es igual a " + (numero1/numero2) + "\n";

	    
	    JOptionPane.showMessageDialog (null,resultado);

	    System.exit(0);

	}

    }