// PruebaDivisionEntreCero.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaDivisionEntreCero extends JFrame implements ActionListener {
    
    private JTextField campoEntrada1, campoEntrada2, campoSalida;
    private int numero1, numero2, resultado;
    
    public PruebaDivisionEntreCero()
    {
        super ("Demostración de las excepciones");
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(3,2));
        
        contenedor.add(new JLabel("Escriba el numerador ", SwingConstants.RIGHT));
        campoEntrada1 = new JTextField();
        contenedor.add (campoEntrada1);
        
        contenedor.add(new JLabel("Escriba el denominador y oprima Intro ", SwingConstants.RIGHT));
        campoEntrada2 = new JTextField();
        contenedor.add(campoEntrada2);
        
        campoEntrada2.addActionListener(this);
        
        contenedor.add(new JLabel("RESULTADO ", SwingConstants.RIGHT));
        campoSalida = new JTextField();
        contenedor.add(campoSalida);
        
        setSize( 425, 100);
        setVisible(true);
        
    }
    
    public void actionPerformed (ActionEvent evento)
    {
        
        campoSalida.setText("");
        
        try {
            
            numero1 = Integer.parseInt(campoEntrada1.getText());
            numero2 = Integer.parseInt(campoEntrada2.getText());
            
            resultado = cociente (numero1, numero2);
            campoSalida.setText( String.valueOf(resultado));
            
        }
        catch (NumberFormatException excepcionFormatoNumero) {
            
            JOptionPane.showMessageDialog (this, "Debe escribir dos enteros", "Formato de número inválido",
                JOptionPane.ERROR_MESSAGE);
        }
        catch (ArithmeticException excepcionAritmetica) {
            JOptionPane.showMessageDialog(this, excepcionAritmetica.toString(), "Excepción aritmetica",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int cociente (int numerador, int denominador) {
        
        return numerador / denominador;
        
    }
    
    public static void main (String args[])
    {
        
        PruebaDivisionEntreCero aplicacion = new PruebaDivisionEntreCero();
        aplicacion.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
    }
            
    
}
