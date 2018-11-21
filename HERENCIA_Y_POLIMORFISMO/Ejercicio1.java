/*

EJERCICIO 1

Cree las clases que se encuentran en la jerarquía de herencia:

	                    EMPLEADO
	                 /      |        \
                    /       |         \
                   /        |          \
                  /         |           \
EmpleadoAsalariado  EmpleadoPorComision  EmpleadoPorHoras
                            |
                            |
                            |
                            |
                  EmpleadoBaseMasComision

Un empleado debe tener un primer nombre, apellido paterno y número de seguro
social. Además, un EmpleadoAsalariado debe tener un salario semanal; un EmpleadoPorHoras debe tener un sueldo y el número de horas trabajadas; un
EmpleadoPorComision debe tener una tasa de comisiones y ventas brutas; y un
EmpleadoBaseMasComision debe tener un salario base. Cada clase debe tener los
constructores apropiados, los métodos establecer y obtener. Escriba un programa
que cree instancias de objetos de cada una de estas clases, y que muestre toda
la información asociada con cada objeto (incluyendo la información heredada).

Mostrar resultados: Arial, 12

*/


import javax.swing.*;

import java.awt.*;


class Empleado {


	private String nombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;



	public Empleado (String nombre, String apellidoPaterno, String numeroSeguroSocial) {


		establecerNombre (nombre);
		establecerApellidoPaterno (apellidoPaterno);
		establecerNumeroSeguroSocial (numeroSeguroSocial);

	}


	private void establecerNombre (String nombre) {


		this.nombre = nombre;

	}


	private void establecerApellidoPaterno (String apellidoPaterno) {


		this.apellidoPaterno = apellidoPaterno;

	}


	private void establecerNumeroSeguroSocial (String numeroSeguroSocial) {


		this.numeroSeguroSocial = numeroSeguroSocial;

	}


	private String obtenerNombre () {


		return nombre;

	}


	private String obtenerApellidoPaterno () {


		return apellidoPaterno;

	}


	private String obtenerNumeroSeguroSocial () {


		return numeroSeguroSocial;

	}


	public String toString () {


		String cadena;

		cadena ="Nombre: ";
		cadena += obtenerNombre () + "\n";
		cadena += "Apellido Paterno: ";
		cadena += obtenerApellidoPaterno () + "\n";
		cadena += "Número Seguro Social: ";
		cadena += obtenerNumeroSeguroSocial ()+ "\n";

		return cadena;

	}

}


class EmpleadoAsalariado extends Empleado {


	private double salarioSemanal;


	public EmpleadoAsalariado (String nombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal) {


		super (nombre, apellidoPaterno, numeroSeguroSocial);

		establecerSalarioSemanal ((salarioSemanal > 0 ? salarioSemanal : 0));

	}


	private void establecerSalarioSemanal (double salarioSemanal) {


		this.salarioSemanal = salarioSemanal;

	}


	private double obtenerSalarioSemanal () {


		return salarioSemanal;

	}


	public String toString () {


		String cadena;

		cadena = super.toString ();
		cadena += "Salario Semanal: ";
		cadena += obtenerSalarioSemanal () + "\n";

		return cadena;

	}

}



class EmpleadoPorHoras extends Empleado {


	private double sueldo;
	private int numeroHoras;


	public EmpleadoPorHoras (String nombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo, int numeroHoras) {


		super (nombre, apellidoPaterno, numeroSeguroSocial);

		establecerSueldo (sueldo > 0 ? sueldo : 0);
		establecerHoras (numeroHoras > 0 ? numeroHoras : 0);

	}


	private void establecerSueldo (double sueldo) {


		this.sueldo = sueldo;

	}


	private void establecerHoras (int numeroHoras) {


		this.numeroHoras = numeroHoras;

	}


	private double obtenerSueldo () {


		return sueldo;

	}


	private int obtenerHoras () {


		return numeroHoras;

	}


	public String toString () {


		String cadena;

		cadena = super.toString ();
		cadena += "Sueldo: ";
		cadena += obtenerSueldo () + "\n";
		cadena += "Horas: ";
		cadena += obtenerHoras () + "\n";

		return cadena;

	}

}



class EmpleadoPorComision extends Empleado {


	private float tasaComisiones;
	private int ventasBrutas;


	public EmpleadoPorComision (String nombre, String apellidoPaterno, String numeroSeguroSocial, float tasaComisiones, int ventasBrutas) {


		super (nombre, apellidoPaterno, numeroSeguroSocial);

		establecerTasaComisiones (tasaComisiones > 0 ? tasaComisiones : 0);
		establecerVentasBrutas (ventasBrutas > 0 ? ventasBrutas : 0);

	}


	private void establecerTasaComisiones (float tasaComisiones) {


		this.tasaComisiones = tasaComisiones;

	}


	private void establecerVentasBrutas (int ventasBrutas) {


		this.ventasBrutas = ventasBrutas;

	}


	private float obtenerTasaComisiones () {


		return tasaComisiones;

	}


	private int obtenerVentasBrutas () {


		return ventasBrutas;

	}


	public String toString () {


		String cadena;

		cadena = super.toString ();
		cadena += "Tasa de comisiones: ";
		cadena += obtenerTasaComisiones ()+ "\n";
		cadena += "Ventas Brutas: ";
		cadena += obtenerVentasBrutas () + "\n";

		return cadena;

	}

}



class EmpleadoBaseMasComision extends EmpleadoPorComision {


	private double salarioBase;


	public EmpleadoBaseMasComision (String nombre, String apellidoPaterno, String numeroSeguroSocial, float tasaComisiones, int ventasBrutas, double salarioBase) {


		super (nombre, apellidoPaterno, numeroSeguroSocial, tasaComisiones, ventasBrutas);

		establecerSalarioBase (salarioBase > 0 ? salarioBase : 0);

	}


	private void establecerSalarioBase (double salarioBase) {


		this.salarioBase = salarioBase;

	}


	private double obtenerSalarioBase () {


		return salarioBase;

	}


	public String toString () {


		String cadena;

		cadena = super.toString ();
		cadena += "Salario Base: ";
		cadena += obtenerSalarioBase () + "\n";

		return cadena;

	}


}



public class Ejercicio1 extends JFrame {



    public Ejercicio1 () {

	
		super ("Resultados empleados");
		
		Empleado empleado;
		EmpleadoAsalariado empleadoAsalariado;
		EmpleadoPorHoras empleadoPorHoras;
		EmpleadoPorComision empleadoPorComision;
		EmpleadoBaseMasComision empleadoBaseMasComision;

		String cadena;

		JTextArea areaSalida;	

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout ());

		empleado = new Empleado ("Fernando", "Perez", "11111");
		
		empleadoAsalariado = new EmpleadoAsalariado ("Ruben", "Perez", "222222", 1000);

		empleadoPorHoras = new EmpleadoPorHoras ("Ana","Perez","333333",1020,45);

		empleadoPorComision = new EmpleadoPorComision ("Luis", "Suarez","444444", 3 ,5000);

		empleadoBaseMasComision = new EmpleadoBaseMasComision ("Miguel", "Santos", "555555", 5, 2000, 45);

		cadena = "EMPLEADO \n\n\n";
		cadena += empleado.toString ();
		cadena += "\nEMPLEADO ASALARIADO\n\n\n";
		cadena += empleadoAsalariado.toString ();
		cadena += "\nEMPLEADO POR HORAS\n\n\n";
		cadena += empleadoPorHoras.toString ();
		cadena += "\nEMPLEADO POR COMISION\n\n\n";
		cadena += empleadoPorComision.toString ();
		cadena += "\nEMPLEADO BASE MAS COMISION\n\n\n";
		cadena += empleadoBaseMasComision.toString ();

		
		areaSalida = new JTextArea (20,25);
		areaSalida.setEditable (false);
		areaSalida.setFont (new Font ("Arial",Font.PLAIN,12));
		areaSalida.setText (cadena);

		contenedor.add (new JScrollPane (areaSalida));


    }



    public static void main (String args[]) {


		Ejercicio1 ejercicio = new Ejercicio1 ();
		ejercicio.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		
		ejercicio.setSize (400,500);
		ejercicio.setVisible (true);

    }

 }
