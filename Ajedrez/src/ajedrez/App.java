package ajedrez;

import java.util.Scanner;

import javax.swing.JFrame;



public class App extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		int tamaño=0;
		System.out.println("Introduzca tamaño");
		tamaño=t.nextInt();
		JFrame ventana = new JFrame();

		RetoTablero tablero = new RetoTablero();
		tablero.setSize(tamaño,tamaño);
		ventana.add(tablero);
		ventana.pack();
		ventana.setVisible(true);
	}

}
