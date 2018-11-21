/*

EJERCICIO 10

Escriba un applet que simule el lanzamiento de monedas. Deje que el programa lance
una moneda cada vez que el usuario oprima el boton "lanzar". Cuente el número
de veces que aparezca cada uno de los lados de la moneda. Muestre los resultados.
El programa debe de llamar al método "tirar", que no tiene argumentos y devuelve
false en caso de cara y true en caso de cruz.

 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio10 extends JApplet implements ActionListener {


    int contadorCara, contadorCruz;

    JLabel etiquetaCara, etiquetaCruz;

    JTextField resultadoCara, resultadoCruz;

    JButton boton;


    public boolean tirar () {

		int moneda;

		moneda =  1 + (int) (Math.random () * 2);

		return  (moneda == 1 ? false : true);

    }

    public void init () {

		contadorCara = 0;
		contadorCruz = 0;

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout());

		etiquetaCara = new JLabel ("Cara");
		contenedor.add (etiquetaCara);

		resultadoCara = new JTextField (10);
		resultadoCara.setEditable (false);
		contenedor.add (resultadoCara);

		etiquetaCruz = new JLabel ("Cruz");
		contenedor.add (etiquetaCruz);

		resultadoCruz = new JTextField (10);
		resultadoCruz.setEditable (false);
		contenedor.add (resultadoCruz);

		boton = new JButton ("Tirar");
		boton.addActionListener (this);
		contenedor.add (boton);

    }


   public void actionPerformed(ActionEvent actionEvent) {

       if (tirar()) {

		   contadorCara++;

		   resultadoCara.setText (Integer.toString(contadorCara));

       }
       else {

		   contadorCruz++;

		   resultadoCruz.setText (Integer.toString(contadorCruz));

       } 

    }

}