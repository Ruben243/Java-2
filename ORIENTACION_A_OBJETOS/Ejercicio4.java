/*

EJERCICIO 4


Cree la clase ConjuntoEnteros. Cada objeto ConjuntoEnteros puede almacenar enteros
en el rango 0 a 100. El conjunto se representa mediante un arreglo de valores
boolean. El elemento del arreglo a[i] es true si el entero i se encuentra en el
conjunto. El elemento del arreglo a[j] es false si el entero j no se encuentra en
dentro del conjunto. El constructor si argumentos inicializa el arreglo de Java
con el "conjunto vacío" (es decir, un conjunto cuya representación de arreglo
contiene valores false).

Proporcione los siguientes métodos: el método union debe crear un tercer conjunto
que sea la unión teórica de conjuntos para los dos conjuntos existentes (es decir,
un elemento del tercer arreglo se establece en true si ese elemento es true en 
cualquier o en ambos de los conjuntos existentes, en caso contrario, el elemento
del tercer conjunto se establece en false). El método intersección debe crear
un tercer conjunto que sea la intersección teórica de conjuntos para los dos
conjuntos existentes (es decir, un elemento del arreglo del tercer conjunto se
establece en false si ese elemento es false en uno o ambos de los conjuntos
existentes; en caso contrario, el elemento del tercer conjunto se establece en
true). El método insertarElemento debe insertar un nuevo entero k en un conjunto
(estableciendo a[k] en true). El método eliminarElemento debe eliminar el entero
m (estableciendo a[m] en false). El método aStringConjunto debe devolver una
cadena que contenga un conjunto como una lista denúmeros separados por espacios.
Incluya sólo aquellos elementos que estén presentes en el conjunto. Use --- para
representar un conjunto vacío. El método esIgualA debe determinar si dos conjuntos
son iguales. Escriba un programa para probar la clase ConjuntoEnteros. Cree
instancias de varios objetos ConjuntosEnteros. Pruebe que todos sus métodos
funcionan correctamente.

Mostrar resultado: Verdana, 10, negrita

*/



import javax.swing.*;

import java.awt.*;



class ConjuntoEnteros {


    boolean valores[];



    public ConjuntoEnteros () {


		valores = new boolean[101];

		for (int i = 0; i < valores.length; i++) {

			valores[i] = false;

		}

    }


    public void insertarElemento (int elemento) {


		valores[elemento] = true;

    }


    public void eliminarElemento (int elemento) {


		valores[elemento] = false;

    }


    private boolean obtenerElemento (int elemento) {


		return valores[elemento];

    }


    public ConjuntoEnteros union (ConjuntoEnteros conjunto) {


		ConjuntoEnteros conjuntoUnion = new ConjuntoEnteros ();


		for (int i = 0; i < valores.length; i++) {

			if (obtenerElemento(i) == true || conjunto.obtenerElemento(i) == true)

			conjuntoUnion.insertarElemento (i);

		} 


		return conjuntoUnion;


    }


    public ConjuntoEnteros interseccion (ConjuntoEnteros conjunto) {


		ConjuntoEnteros conjuntoInterseccion = new ConjuntoEnteros ();


		for (int i = 0; i < valores.length; i++) {

			if (obtenerElemento(i) == false || conjunto.obtenerElemento(i) == false)

			conjuntoInterseccion.eliminarElemento(i);

			else conjuntoInterseccion.insertarElemento(i);

		}

		return conjuntoInterseccion;

    }


    public String aStringConjunto () {


		String cadena;


		cadena = "";

		for (int i = 0; i < valores.length; i++) {

			if (obtenerElemento(i) == true)
			
			cadena += i + " ";

		}

		return (cadena == "" ? "---" : cadena);
    }


    public boolean esIgualA (ConjuntoEnteros conjunto) {


		boolean sonIguales;


		sonIguales = true;

		for (int i = 0; i < valores.length; i++) {

			if (obtenerElemento (i) != conjunto.obtenerElemento(i)) {

			sonIguales = false;

			break;
			}

		}

		return sonIguales;

    }


}



public class Ejercicio4 extends JApplet {


    JTextArea areaSalida;


    public void init () {


		ConjuntoEnteros conjunto1, conjunto2, conjuntoResultado;

		Container contenedor = getContentPane ();
		contenedor.setLayout (new FlowLayout ());

		areaSalida = new JTextArea ();
		areaSalida.setEditable (false);
		areaSalida.setFont (new Font ("Verdana", Font.BOLD, 10));
		contenedor.add (areaSalida);

		conjunto1 = new ConjuntoEnteros ();
		conjunto2 = new ConjuntoEnteros ();


		for (int i = 0; i <= 10; i ++) {

			conjunto1.insertarElemento (1 + (int) (Math.random () * 100));
		}

		
		for (int i = 0; i <= 20; i++) {

			conjunto2.insertarElemento (1 + (int) (Math.random () * 100));

		}



		areaSalida.append ("CONJUNTO 1\n\n");
		areaSalida.append (conjunto1.aStringConjunto () + "\n\n");
		areaSalida.append ("CONJUNTO 2\n\n");
		areaSalida .append (conjunto2.aStringConjunto () + "\n\n");


		areaSalida.append ("CONJUNTO UNIÓN\n\n");
		conjuntoResultado = conjunto1.union (conjunto2);
		areaSalida.append (conjuntoResultado.aStringConjunto () + "\n\n");


		areaSalida.append ("CONJUNTO INTERSECCIÓN\n\n");
		conjuntoResultado = conjunto1.interseccion (conjunto2);
		areaSalida.append (conjuntoResultado.aStringConjunto () + "\n\n");


		if (conjunto1.esIgualA (conjunto2))

			areaSalida.append ("LOS CONJUNTOS SON IGUALES\n\n");

		else areaSalida.append ("LOS CONJUNTOS NO SON IGUALES\n\n");

    }

}
