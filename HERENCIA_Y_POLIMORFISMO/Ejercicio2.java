/*

EJERCICIO 2

Escriba una nueva clase TarjetaDeVisita que herede de la clase Object y que 
sobrecarge el método toString para imprimir la tarjeta en pantalla.

En la tarjeta deben de aparecer los campos: nombre, empresa, puesto, dirección y
teléfono.

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


	private String obtenerNombre () {

		return nombre;

	}


	private String obtenerEmpresa () {

		return empresa;

	}


	private String obtenerPuesto () {

		return puesto;

	}


	private String obtenerDireccion () {

		return direccion;

	}


	private String obtenerTelefono () {

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



public class Ejercicio2 extends JApplet {



    public void init () {


	TarjetaDeVisita tarjeta = new TarjetaDeVisita ("Fernando Pestes Pestes", "Universidad de Oviedo", "Profesor", "Departamento de Informatica", " +34 985 67 66 55");

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
