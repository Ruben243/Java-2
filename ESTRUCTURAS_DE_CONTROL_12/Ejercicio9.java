/*

Ejercicio 9

Desarrolle una aplicación en Java que determine el sueldo bruto para cada
empleado. La empresa paga la cuota normal en las primeras 40 horas de trabajo y
paga cuota y media para el resto de horas. El programa le pedira el número de
trabajadores. Y para cada trabajador el número de horas trabajadas, y la tarifa
para cada hora. Debera de mostrar el sueldo bruto para cada trabajador.

*/

import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main (String args[]) {

		String cadenaNumeroTrabajadores;
		String cadenaHoras;
		String cadenaTarifa;
		String resultado;

		int numeroTrabajadores;
		int horas;
		int tarifa;

		resultado = "No ha introducido trabajadores";

		cadenaNumeroTrabajadores = JOptionPane.showInputDialog ("Número de trabajadores: ");

		numeroTrabajadores = Integer.parseInt (cadenaNumeroTrabajadores);

		if (numeroTrabajadores > 0) {

			while (numeroTrabajadores > 0) {

			cadenaHoras = JOptionPane.showInputDialog ("Horas: ");

			horas = Integer.parseInt (cadenaHoras);

			if (horas > 0) {

				cadenaTarifa = JOptionPane.showInputDialog ("Introduce la tarifa por hora: ");

				tarifa = Integer.parseInt (cadenaTarifa);

				if (tarifa > 0) {
				
				if (horas > 40) {

					resultado = "El sueldo del trabajador " + numeroTrabajadores + " es: " + ((tarifa*40) + (tarifa+(tarifa/2))*(horas-40));

				}

				else {

					resultado = "El sueldo del trabajador " + numeroTrabajadores + " es: " + tarifa*horas;

				}
				}

				else {
				
				resultado = "No se ha introducido tarifa correcta";
				}

			}

			else {

				resultado = "No se han introducido las horas correctas";

			}

			JOptionPane.showMessageDialog (null, resultado);
	 
			numeroTrabajadores--;

			}

		}

		else {

			JOptionPane.showMessageDialog (null, resultado);

		}

		System.exit (0);

    }

}