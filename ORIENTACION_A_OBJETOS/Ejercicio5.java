/*

EJERCICIO 5


Cree un applet de dibujo de líneas, rectángulos. Para este fin, cree un conjunto
de clases de figuras "inteligentes", en las que los objetos de estas clases sepan
como dibujarse a sí mismos si se les proporciona un objeto Graphics que les indique
en dónde dibujarse (es decir, el objeto Graphics permite a una figura dibujarse
en el fondo del applet). Los nombres de las clases deben ser MiLinea, MiRect.

Los datos para la clase MiLinea deben de incluir las coordenadas x1, y1, x2 e y2.
El método dibujarLinea de la clase Graphics debe conectar los dos puntos suministrados
con un linea. Los datos para las clases MiRect deben incluir un valor coordenada x
de la esquina superiror izquierda, un valor de coordenadas y de la esquina superior
izquierda, una anchura (no debe ser negativa) y una altura (no debe ser negativa).
Todos los datos en cada clase deben ser private.

Además de los datos, cada clase deben declarar cuando menos los siguientes métodos public:

a) Un constructor sin argumentos que establezca las coordenadas en 0.
b) Un constructor con argumentos que establezca las coordenadas en los valores 
suministrados.
c) Métodos establecer para cada pieza individual de datos, los cuáles permiten al
programador establecer cualquier pieza de datos en una figura de manera independiente
( por ejemplo, si usted tiene una variable de instancia llamada x1, debe tener un
método llamado establecerX1).
d) Métodos obtener para cada pieza individual de datos, los cuáles permitan al
programador recuperar cualquier pieza de datos en una figura de manera independiente
( por ejemplo, si usted tiene una variable de instancia llamada x1, debe tener
un método llamado obtenerX1).
e) Un método dibujar con la primera línea

public void dibujar (Graphics g)

que se llamará desde el método paint del applet para dibujar una figura en la
pantalla.

Empiece declarando la clase MiLinea y un applet para probar sus clases. El applet
deberá tener una variable de instancia MiLinea llamada linea, que puede hacer
referencia a un objeto MiLinea (creado en el método init del applet con coordenadas
aleatorias). El método paint del applet deberá dibujar la figura mediante una
instrucción como está:

linea.dibujar (g);

en donde linea debe ser la referencia tipo MiLinea y g debe ser el objeto
Graphics que será utilizado por la figura para dibujarse a sí misma en el applet.

A continuación, modifique la referencia MiLinea para que sea un arreglo de referencias
MiLinea, y codifique varios objetos MiLinea directamente en el programa para
dibujarlos. El método paint del applet deberá recorrer cada uno de estos arreglos
y dibujar cada una de las figuras. Cree cinco figuras de cada tipo.



 */



import javax.swing.*;

import java.awt.*;



class MiLinea {


    private int x1;
    private int x2;
    private int y1;
    private int y2;


    public MiLinea () {


		establecerX1 (0);
		establecerY1 (0);
		establecerX2 (0);
		establecerY1 (0);

    }


    public MiLinea (int x1, int y1, int x2, int y2) {


		establecerX1 (x1);
		establecerY1 (y1);
		establecerX2 (x2);
		establecerY1 (y2);

    }


    public void establecerX1 (int x1) {


		this.x1 = (x1 < 0 ? 0 : x1);

    }


    public void establecerY1 (int y1) {


		this.y1 = (y1 < 0 ? 0 : y1);

    }


    public void establecerX2 (int x2) {


		this.x2 = (x2 < 0 ? 0 : x2);

    }


    public void establecerY2 (int y2) {


		this.y2 = (y2 < 0 ? 0 : y2);

    }


    public int obtenerX1 () {


		return x1;

    }


    public int obtenerY1 () {


		return y1;

    }


    public int obtenerX2 () {


		return x2;

    }


    public int obtenerY2 () {


		return y2;

    }


    public void dibujar (Graphics g) {


		g.drawLine (obtenerX1 (), obtenerY1 (), obtenerX2 (), obtenerY2 ());

    }

}



class MiRect {


    private int x;
    private int y;
    private int anchura;
    private int altura;


    public MiRect () {


		establecerX (0);
		establecerY (0);
		establecerAnchura (0);
		establecerAltura (0);

    }


    public MiRect (int x, int y, int anchura, int altura) {


		establecerX (x);
		establecerY (y);
		establecerAnchura (anchura);
		establecerAltura (altura);

    }


    public void establecerX (int x) {


		this.x = (x < 0 ? 0 : x);

    }


    public void establecerY (int y) {


		this.y = (y < 0 ? 0 : y);

    }


    public void establecerAnchura (int anchura) {


		this.anchura = (anchura < 0 ? 0 : anchura);

    }


    public void establecerAltura (int altura) {


		this.altura = (altura < 0 ? 0 : altura);
		
    }


    public int obtenerX () {


		return x;

    }


    public int obtenerY () {


		return y;

    }


    public int obtenerAltura () {


		return altura;

    }


    public int obtenerAnchura () {


		return anchura;

    }


    public void dibujar (Graphics g) {


		g.drawRect (obtenerX (), obtenerY (), obtenerAnchura (), obtenerAltura ());

    }

}



public class Ejercicio5 extends JApplet {


    MiLinea linea;
    MiRect rectangulo;

    MiLinea lineas[];
    MiRect rectangulos[];



    public void init () {


		// Una linea y un rectangulo

		linea = new MiLinea (4,5,20,50);
		rectangulo = new MiRect (20,20,40,10);


		// Arrays de lineas y rectangulos

		lineas = new MiLinea[5];
		rectangulos = new MiRect[5];


		for (int i = 0; i < lineas.length ; i++) {

			lineas[i] = new MiLinea (1 + (int) (Math.random () * 300), 1 + (int) (Math.random () * 300),1 + (int) (Math.random () * 300) , 1 + (int) (Math.random () * 300));

			rectangulos[i] = new MiRect (1 + (int) (Math.random () * 300) ,1 + (int) (Math.random () * 300) ,1 + (int) (Math.random () * 300) , 1 + (int) (Math.random () * 300));

		}

    }


    public void paint (Graphics g) {

		super.paint (g);

		linea.dibujar (g);
		rectangulo.dibujar (g);


		for (int i = 0; i < rectangulos.length ; i++) {

			lineas[i].dibujar (g);
			rectangulos[i].dibujar (g);

		}

    }

}
