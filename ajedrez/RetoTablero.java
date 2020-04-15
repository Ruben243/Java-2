package ajedrez;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class RetoTablero extends JFrame {
	public RetoTablero() {
		JButton[][] botones;//se crea un array bidimensional
		
		botones = new JButton[8][8];//se le especifican la dimsension
		this.setLayout(new GridLayout(8,8));//especidicamos el numero de filas y columnas
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j] = new JButton();
				// SE CREAN LOS BOTONES Y SE ESTABLECE SU TAMAÑO PREFERIDO
				botones[i][j].setPreferredSize(new Dimension(8,8));
				if ((i + j + 1) % 2 == 0) {
					botones[i][j].setBackground(Color.BLACK);//se establece el color de fondo
				}
				this.add(botones[i][j]);//se añaden los botones al panel

			}
			setVisible(true);//se hace visible el panel

		}
		
	}

}
