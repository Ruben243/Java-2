/*

EJERCICIO 4


Crear una clase TarjetaVisitaConLogo que herede de la clase TarjetaDeVisita.
Añada y sobrecargue los métodos que crea necesarios para poder imprimir una
tarjeta de visita que incluya un logotipo, un número de fax y una dirección
de correo electrónico.

Mostrar resultados: Arial, 14

*/


import java.awt.*;

import javax.swing.*;



class TarjetaDeVisita extends Object {


	private String nombre;
	private String empresa;
	private String puesto;
	private String direccion;
	private String telefono;



	public TarjetaDeVisita (String nuevoNombre, String nuevaEmpresa, String nuevoPuesto, String nuevaDireccion, String nuevoTelefono) {

		establecerNombre (nuevoNombre);
		establecerEmpresa (nuevaEmpresa);
		establecerPuesto (nuevoPuesto);
		establecerDireccion (nuevaDireccion);
		establecerTelefono (nuevoTelefono);

	}


	private void establecerNombre (String nombre) {

		this.nombre = nombre;

	}


	private void establecerEmpresa (String empresa) {

		this.empresa = empresa;

	}


	private void establecerPuesto (String puesto) {

		this.puesto = puesto;

	}


	private void establecerDireccion (String direccion) {

		this.direccion = direccion;

	}


	private void establecerTelefono (String telefono) {

		this.telefono = telefono;

	}


	protected String obtenerNombre () {

		return nombre;

	}


	protected String obtenerEmpresa () {

		return empresa;

	}


	protected String obtenerPuesto () {

		return puesto;

	}


	protected String obtenerDireccion () {

		return direccion;

	}


	protected String obtenerTelefono () {

		return telefono;

	}


	public String toString () {

		String tarjeta;


		tarjeta = "\n----------------------------------------------------------------------------------\n";
		tarjeta += obtenerEmpresa ();
		tarjeta += "\n----------------------------------------------------------------------------------\n";
		tarjeta += obtenerNombre ();
		tarjeta += "\n";
		tarjeta += obtenerPuesto ();
		tarjeta += "\n----------------------------------------------------------------------------------\n";
		tarjeta += "\t\t" + obtenerTelefono () + "\n";
		tarjeta += "\t\t" + obtenerDireccion ();
		tarjeta += "\n----------------------------------------------------------------------------------\n";

		return tarjeta;

	}

}



class TarjetaVisitaConLogo extends TarjetaDeVisita {


	private String logotipo;
	private int numeroFax;
	private String email;


	public TarjetaVisitaConLogo (String nuevoNombre, String nuevaEmpresa, String nuevoPuesto, String nuevaDireccion, String nuevoTelefono, String logotipo, int numeroFax, String email) {

		super (nuevoNombre, nuevaEmpresa, nuevoPuesto, nuevaDireccion, nuevoTelefono);

		this.logotipo = logotipo;
		this.numeroFax = numeroFax;
		this.email = email;

	}

	private void establecerLogotipo (String logotipo) {

		this.logotipo = logotipo;

	}


	private void establecerNumeroFax (int numeroFax) {

		this.numeroFax = numeroFax;

	}


	private void establecerEmail (String email) {

		this.email = email;

	}


	private String obtenerLogotipo () {

		return logotipo;

	}


	private String obtenerNumeroFax () {

		return Integer.toString(numeroFax);

	}


	private String obtenerEmail () {

		return email;

	}


	public String toString () {

		String tarjeta;


		tarjeta = "\n---------------------------------------------------------------------------------------------------\n";
		tarjeta += obtenerEmpresa ();
		tarjeta += "\n---------------------------------------------------------------------------------------------------\n\n";
		tarjeta += obtenerLogotipo ();
		tarjeta += "\n\n---------------------------------------------------------------------------------------------------\n";
		tarjeta += obtenerNombre ();
		tarjeta += "\n";
		tarjeta += obtenerPuesto ();
		tarjeta += "\n---------------------------------------------------------------------------------------------------\n";
		tarjeta += "\t\tTlfno. - " + obtenerTelefono ()  + "\n";
		tarjeta += "\t\tFax - " + obtenerNumeroFax () + "\n";
		tarjeta += "\t\tEmail - " + obtenerEmail () + "\n";
		tarjeta += "\t\tDirección - " + obtenerDireccion ();
		tarjeta += "\n---------------------------------------------------------------------------------------------------\n";

		return tarjeta;


	}

}



public class Ejercicio4 extends JApplet {



    public void init () {

		String logotipo;

		logotipo = "********\n";
		logotipo += "*  x x    *\n";
		logotipo += "*  x x    *\n";
		logotipo += "*  x x    *\n";
		logotipo += "********\n";

		TarjetaVisitaConLogo tarjeta = new TarjetaVisitaConLogo ("Fernando Pestes Pestes", "Universidad de Oviedo", "Profesor", "Departamento de Informatica", " +34 985 67 66 55", logotipo, 666777888, "ejemplo@gmail.com" );

		Container contenedor = getContentPane();
		contenedor.setLayout (new FlowLayout () );

		JTextArea areaSalida;

		areaSalida = new JTextArea (50,50);
		areaSalida.setEditable (false);
		areaSalida.setFont (new Font ("Arial", Font.PLAIN, 14));
		contenedor.add (areaSalida);

		areaSalida.setText (tarjeta.toString());

    }


}
