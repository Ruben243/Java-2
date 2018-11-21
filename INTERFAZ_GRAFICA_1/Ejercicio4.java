/*

EJERCICIO 4

Crear la siguiente GUI. No hay que proporcionar ninguna funcionalidad.

*/


import javax.swing.*;
import java.awt.*;



class Ventana extends JFrame {


	private JTextArea areaIzquierda,
	    areaCentral,
	    areaDerecha;

	private JCheckBox checkBoxImagen,
	    checkBoxTexto,
	    checkBoxCodigo,
	    checkBoxImprimirArchivo;

	private JRadioButton radioBotonSeleccion,
	    radioBotonTodo,
	    radioBotonApplet;

	private JButton botonAceptar,
	    botonCancelar,
	    botonConfigurar,
	    botonAyuda;


	private JLabel etiquetaImpresora, etiquetaCalidad;

	private JComboBox listaCalidad;

	private JPanel panelBotones, panelSur, panelCentral, panelCentral1, panelCentral2, panelCentral3, panelCentral4, panelCentral5;

	private String listaValoresCalidad[] = {"Alta", "Media", "Baja"};

 

	public Ventana () {


	    super ("Impresora");

	    Container contenedor = getContentPane ();
	    contenedor.setLayout (new BorderLayout (15,15));

	    etiquetaImpresora = new JLabel ("Impresora: Mi impresora");

	    panelCentral1 = new JPanel ();

	    areaIzquierda = new JTextArea (50,50);

	    panelCentral1.add (areaIzquierda);

	    panelCentral2 = new JPanel ();
	    panelCentral2.setLayout (new GridLayout (3,1,5,5));

	    checkBoxImagen = new JCheckBox ("Imagen");
	    checkBoxTexto = new JCheckBox ("Texto");
	    checkBoxCodigo = new JCheckBox ("Código");

	    panelCentral2.add (checkBoxImagen);
	    panelCentral2.add (checkBoxTexto);
	    panelCentral2.add (checkBoxCodigo);


	    panelCentral3 = new JPanel ();

	    areaCentral = new JTextArea (50,50);

	    panelCentral3.add (areaCentral);


	    panelCentral4 = new JPanel ();
	    panelCentral4.setLayout (new GridLayout (3,1,5,5));


	    radioBotonSeleccion = new JRadioButton ("Selección");
	    radioBotonTodo = new JRadioButton ("Todo");
	    radioBotonApplet = new JRadioButton ("Applet");


	    panelCentral4.add (radioBotonSeleccion);
	    panelCentral4.add (radioBotonTodo);
	    panelCentral4.add (radioBotonApplet);


	    panelCentral5 = new JPanel ();

	    areaDerecha = new JTextArea (50,50);

	    panelCentral5.add (areaDerecha);


	    panelCentral = new JPanel ();
	    panelCentral.setLayout (new GridLayout (1,4,5,5));

	    panelCentral.add (panelCentral1);
	    panelCentral.add (panelCentral2);
	    panelCentral.add (panelCentral3);
	    panelCentral.add (panelCentral4);
	    panelCentral.add (panelCentral5);

	    panelBotones = new JPanel ();
	    panelBotones.setLayout (new GridLayout (4,1,5,5));

	    botonAceptar = new JButton ("Aceptar");
	    botonCancelar = new JButton ("Cancelar");
	    botonConfigurar = new JButton ("Configurar ...");
	    botonAyuda = new JButton ("Ayuda");

	    panelBotones.add (botonAceptar);
	    panelBotones.add (botonCancelar);
	    panelBotones.add (botonConfigurar);
	    panelBotones.add (botonAyuda);


	    panelSur = new JPanel ();
	    panelSur.setLayout (new FlowLayout (FlowLayout.LEFT));

	    etiquetaCalidad = new JLabel ("Calidad de impresión:");
	   
	    listaCalidad = new JComboBox (listaValoresCalidad);

	    checkBoxImprimirArchivo = new JCheckBox ("Imprimir en archivo");

	    panelSur.add (etiquetaCalidad);
	    panelSur.add (listaCalidad);
	    panelSur.add (checkBoxImprimirArchivo);

	    contenedor.add (etiquetaImpresora,BorderLayout.NORTH);
	    contenedor.add (panelCentral,BorderLayout.CENTER);
	    contenedor.add (panelBotones,BorderLayout.EAST);
	    contenedor.add (panelSur,BorderLayout.SOUTH);

	}

}
    
public class Ejercicio4 {



    public Ejercicio4 () {

		Ventana ventana = new Ventana ();

		ventana.setSize (700,250);
		ventana.setVisible (true);

		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    }



    public static void main (String args[]) {

		Ejercicio4 ejercicio = new Ejercicio4 ();

    }

}
