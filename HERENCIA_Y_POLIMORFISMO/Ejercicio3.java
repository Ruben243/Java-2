/*

EJERCICIO 3


Escribir una clase DiscoDatos que herede de la clase Disco. Cree ahora una clase
DiscoDuro que herede de la clase DiscoDatos.

La clase DiscoDatos debe de contener el atributo capacidad y el método
imprimirCapacidad.

La clase DiscoDuro debe de tener los campos nuevoNumSerie, nuevaCapacidad, 
nuevaInterfaz (almacena IDE, SCSI, USB ...) y nuevoValorRevoluciones. Y los 
métodos imprimirInterfaz e imprimirRevoluciones.

Y crear una clase que pruebe todos las clases anteriores.

protected class Disco {

       protected String fabricante;
       protected int numSerie;

public Disco (String nuevoFabricante, int nuevoNumSerie) {

       fabricante = nuevoFabricante;
       numSerie = nuevoNumSerie;

}

public String imprimirFabricante () {

       return fabricante;

}

public String imprimirNumeroSerie () {

       return numSerie;
}


Mostrar resultados: Arial, 12

 */



import javax.swing.*;

import java.awt.*;



class Disco {


	protected String fabricante;
	protected int numSerie;


	public Disco (String nuevoFabricante, int nuevoNumSerie) {

		fabricante = nuevoFabricante;
		numSerie = nuevoNumSerie;

	}


	public String imprimirFabricante () {

		return fabricante;

	}


	public String imprimirNumeroSerie () {

		return Integer.toString(numSerie);
	}


}


class DiscoDatos extends Disco {


	protected int capacidad;


	public DiscoDatos (String nuevoFabricante, int nuevoNumSerie, int nuevaCapacidad) {

		super (nuevoFabricante, nuevoNumSerie);

		capacidad = nuevaCapacidad;

	}


	public String imprimirCapacidad () {

		return Integer.toString(capacidad);
	}

}



class DiscoDuro extends DiscoDatos {


	private String interfaz;
	private int revoluciones;


	public DiscoDuro (String nuevoFabricante, int nuevoNumSerie, int nuevaCapacidad, String nuevoInterfaz, int nuevoValorRevoluciones) {

		super (nuevoFabricante, nuevoNumSerie, nuevaCapacidad);

		interfaz = nuevoInterfaz;

		revoluciones = nuevoValorRevoluciones;

	}


	public String imprimirInterfaz () {

		return interfaz;

	}


	public String imprimirRevoluciones () {

		return Integer.toString (revoluciones);

	}


}


class Prueba extends JFrame {

	public Prueba () {

		JTextArea areaSalida;

		Disco disco;
		DiscoDatos discoDatos;
		DiscoDuro discoDuro;

		String cadena;

		disco = new Disco ("WD", 1500);
		discoDatos = new DiscoDatos ("Seagate", 1600, 4128);
		discoDuro = new DiscoDuro ("Seagate", 1800, 100000, "SCSI", 5600);

		cadena = "DISCO\n\n";
		cadena += "Fabricante: " + disco.imprimirFabricante () +"\n";
		cadena += "Número de Serie: " + disco.imprimirNumeroSerie () + "\n\n";
		cadena += "DISCO DATOS\n\n";
		cadena += "Fabricante: " + discoDatos.imprimirFabricante () +"\n";
		cadena += "Número de Serie: " + discoDatos.imprimirNumeroSerie () + "\n\n";
		cadena += "Capacidad: " + discoDatos.imprimirCapacidad () + "\n\n";
		cadena += "DISCO DURO\n\n";
		cadena += "Fabricante: " + discoDuro.imprimirFabricante () +"\n";
		cadena += "Número de Serie: " + discoDuro.imprimirNumeroSerie () + "\n\n";
		cadena += "Capacidad: " + discoDuro.imprimirCapacidad () + "\n\n";
		cadena += "Interfaz: " + discoDuro.imprimirInterfaz () + "\n";
		cadena += "Revoluciones: " + discoDuro.imprimirRevoluciones () + "\n\n";

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout ());

		areaSalida = new JTextArea ();
		areaSalida.setText (cadena);
		areaSalida.setEditable (false);
		areaSalida.setFont (new Font ("Arial", Font.PLAIN, 12));
		contenedor.add (areaSalida);

		setSize (400,400);
		setVisible (true);


	}

}



public class Ejercicio3 {



    public Ejercicio3 () {

		Prueba ventana = new Prueba ();

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }


    public static void main (String args[]) {

		Ejercicio3 ejercicio = new Ejercicio3 ();

    }

}
