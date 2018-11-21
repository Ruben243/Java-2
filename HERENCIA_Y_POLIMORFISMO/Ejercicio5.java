/*

EJERCICIO 5


Crear una clase abstracta Juguetes (almacena el nombre del juguete y el método
abstracto imprimir). Crear dos subclases que heredan de la clase abstracta Juguetes,
que se llamen JuguetesElectricos y JuguetesMecanicos. La clase JuguetesMecanicos
tiene el atributo numeroPiezasMecanicas y los métodos correspondientes (constructor
para los correspondientes atributos, establecerNumeroPiezasMecanicas, 
obtenerNumeroPiezasMecanicas, imprimir). La clase JuguetesElectricos tiene el
atributo voltaje y los métodos correspondientes (constructor para los correspondientes
atributos, establecerVoltaje, obtenerVoltaje, imprimir).

Despues crear una clase BolsaJuguetes, el atributo es un array de juguetes y que
tengamos los métodos (constructor este se encarga de inicializar a tantos 
juguetes como se le indique como parametro el tipo de juguetes se selecciona de manera
aleatoria y el método imprimir que nos imprima los juguetes que tenga la BolsaJuguetes
(polimorfismo)). 


MOSTRAR Resultado: Arial, 12

*/



import javax.swing.*;

import java.awt.*;


abstract class Juguetes {


	private String nombreJuguete;


	public Juguetes (String nombreJuguete) {


		establecerNombreJuguete (nombreJuguete);

	}


	private void establecerNombreJuguete (String nombreJuguete) {


		this.nombreJuguete = nombreJuguete;

	}


	protected String obtenerNombre () {


		return nombreJuguete;

	}


	protected abstract String imprimir ();

	}



class JuguetesMecanicos extends Juguetes {


	private int numeroPiezasMecanicas; 


	public JuguetesMecanicos (String nombreJuguete, int numeroPiezasMecanicas) {


		super (nombreJuguete);
		establecerNumeroPiezasMecanicas (numeroPiezasMecanicas);

	}


	private void establecerNumeroPiezasMecanicas (int numeroPiezasMecanicas) {


		this.numeroPiezasMecanicas = numeroPiezasMecanicas >=0 ? numeroPiezasMecanicas : 0;

	}


	private int obtenerNumeroPiezasMecanicas () {


		return numeroPiezasMecanicas;

	}


	protected String imprimir () {


		String cadena;

		cadena = "NombreJuguete: " + obtenerNombre () + "\n\n";
		cadena += "Número de piezas mecánicas: " + obtenerNumeroPiezasMecanicas () + "\n";

		return  cadena;

	} 


}


class JuguetesElectricos extends Juguetes {


	private int voltaje; 


	public JuguetesElectricos (String nombreJuguete, int voltaje) {


		super (nombreJuguete);
		establecerVoltaje (voltaje);

	}


	private void establecerVoltaje (int voltaje) {


		this.voltaje = voltaje >=0 ? voltaje : 0;

	}


	private int obtenerVoltaje () {


		return voltaje;

	}


	protected String imprimir () {


		String cadena;

		cadena = "NombreJuguete: " + obtenerNombre () + "\n\n";
		cadena += "Voltaje: " + obtenerVoltaje () + "\n"; 

		return cadena;

	} 

}


class BolsaJuguetes {


	private Juguetes[] contenido;


	public BolsaJuguetes (int numeroJuguetes) {


		int numero;
		int tipoJuguete;


		numero = (numeroJuguetes > 0 ? numeroJuguetes : 1);

		contenido = new Juguetes[numero];


		for (int i  = 0; i < contenido.length; i++) {


			tipoJuguete = 1 + (int) (Math.random() * 2);


			switch (tipoJuguete) {

			case 1:

				contenido[i] = new JuguetesMecanicos ("Juguete Mecanico" + i, 1 + (int) (Math.random () * 100));

				break;

			case 2:

				contenido[i] = new JuguetesElectricos ("Juguete Electrico" + i, 1 + (int) (Math.random () * 100));

				break;

			default:

			}
		
		}
		
	}


	public String imprimir () {


		String cadena;

		cadena = "LISTA JUGUETES\n\n";

		for (int i = 0; i < contenido.length; i++) {

		cadena += contenido[i].imprimir () + "\n";

		}

		return cadena;

	}

}


class Ventana extends JFrame {


		public Ventana (String cadena) {

			Container contenedor;
			JTextArea areaSalida;
			JScrollPane barraDesplazamiento;

			contenedor = getContentPane ();
			contenedor.setLayout (new FlowLayout ());

			areaSalida = new JTextArea (30,30);
			areaSalida.setText (cadena);
			areaSalida.setFont (new Font ("Arial", Font.PLAIN, 12));
			areaSalida.setEditable (false);

			barraDesplazamiento = new JScrollPane (areaSalida);

			contenedor.add (barraDesplazamiento);

		}

}


public class Ejercicio5 {


    public Ejercicio5 () {
	

		BolsaJuguetes bolsaJuguetes= new BolsaJuguetes (20);

		Ventana ventana = new Ventana (bolsaJuguetes.imprimir());

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		ventana.setSize (400,500);
		ventana.setVisible (true);

    }


    public static void main (String args[]) {

		Ejercicio5 ejercicio = new Ejercicio5 ();

    }

}
