/*

EJERCICIO 3


Cree una clase llamada CuentaDeAhorros. Use una variable static llamada tasaInteresAnual
para almacenar la tasa de interés anual para todas las cuentas habientes. Cada
objeto de la clase debe contener una variable de instancia private llamada 
saldoAhorros, que indique la cantidad que el ahorrador tiene actualmente en
depósito. Proporcione el método calcularInteresMensual para calcular el interés
mensual, multiplicando el saldoAhorros por la tasaInteresAnual dividida entre
12; este interés debe sumarse al saldoAhorros. Proporcione un método static llamado
modificarTasaInteres para establecer la tasaInteresAnual en un nuevo valor.
Escriba un programa para probrar la clase CuentaDeAhorros. Cree dos instancias
de objetos CuentaDeAhorros, ahorrador1 y ahorrador2, con saldos 2000.00€ y 3000.00€
respectivamente. Establezca la tasaInteresAnual en 4%, después calcule el interés
mensual e imprima los nuevos saldos para ambos ahorradores. Luego establezca la 
tasaInteresAnual en 5%, calcule el interés del siguiente mes e imprima los nuevos
saldos para ambos ahorradores.

Mostrar resultados: Arial, 10

*/



import javax.swing.*;

import java.text.*;

import java.awt.*;



class CuentaDeAhorros {


    private static float tasaInteresAnual;
    private float saldoAhorros;


    public CuentaDeAhorros (float saldo) {


		establecerTasaInteresAnual (0);
		establecerSaldoAhorros (saldo);

    }


    private void establecerTasaInteresAnual (float tasa) {


		tasaInteresAnual = tasa;

    }


    private void establecerSaldoAhorros (float saldo) {


		saldoAhorros = saldo;

    }


    public float obtenerSaldoAhorros () {


		return saldoAhorros;

    }


    public float obtenerTasaInteresAnual () {


		return tasaInteresAnual;

    }


    public double calcularInteresAnual () {


		double interesAnual;

		interesAnual = (saldoAhorros * tasaInteresAnual) / 12;

		saldoAhorros += interesAnual;

		return interesAnual;

    }


    public static void modificarTasaInteres (float tasa) {


		tasaInteresAnual = tasa;

    }
 
}


public class Ejercicio3 extends JApplet {


    JTextArea areaResultados;



    public void init () {


		CuentaDeAhorros ahorrador1, ahorrador2;

		DecimalFormat formato = new DecimalFormat ("0.00");
		
		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout());

		areaResultados = new JTextArea (20,20);
		areaResultados.setEditable (false);
		areaResultados.setFont (new Font ("Arial", Font.PLAIN, 10));
		contenedor.add (areaResultados);

		ahorrador1 = new CuentaDeAhorros (1000);
		ahorrador2 = new CuentaDeAhorros (2000);

		areaResultados.setText ("Saldo actual ahorrador1: " + formato.format(ahorrador1.obtenerSaldoAhorros ()) + "\n\n");	
		areaResultados.append ("Saldo actual ahorrador2: " + formato.format(ahorrador2.obtenerSaldoAhorros ()) + "\n\n");

		areaResultados.append ("********************\n\n");

		ahorrador1.modificarTasaInteres (4);

		areaResultados.append ("Tasa interes Anual: " + formato.format(ahorrador1.obtenerTasaInteresAnual ()) + "\n");

		areaResultados.append ("Interes anual ahorrador1: " + formato.format(ahorrador1.calcularInteresAnual()) + "\n\n");
		areaResultados.append ("Interes anual ahorrador2: " + formato.format(ahorrador2.calcularInteresAnual()) + "\n\n");

		
		areaResultados.append ("Saldo actual ahorrador1: " + formato.format(ahorrador1.obtenerSaldoAhorros ()) + "\n\n");	
		areaResultados.append ("Saldo actual ahorrador2: " + formato.format(ahorrador2.obtenerSaldoAhorros ()) + "\n\n");

		areaResultados.append ("********************\n\n");

		ahorrador1.modificarTasaInteres (5);

		areaResultados.append ("Tasa interes Anual: " + formato.format(ahorrador1.obtenerTasaInteresAnual ()) + "\n");

		areaResultados.append ("Interes anual ahorrador1: " + formato.format(ahorrador1.calcularInteresAnual()) + "\n\n");
		areaResultados.append ("Interes anual ahorrador2: " + formato.format(ahorrador2.calcularInteresAnual()) + "\n\n");

		areaResultados.append ("Saldo actual ahorrador1: " + formato.format(ahorrador1.obtenerSaldoAhorros ()) + "\n\n");	
		areaResultados.append ("Saldo actual ahorrador2: " + formato.format(ahorrador2.obtenerSaldoAhorros ()) + "\n\n");

    }

}
