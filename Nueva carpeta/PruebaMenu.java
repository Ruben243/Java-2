
import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class PruebaMenu extends JApplet{
    
     public void init(){
        JTextArea salida=new JTextArea();
        Container contenedor=getContentPane();
        contenedor.add(salida);
        salida.setText("******MENU********\n"+"1-ensalda\n"+"2carne"); 
         
         
        String s1= JOptionPane.showInputDialog("Escriba el primer valor de punto flotante");
        Double numero1 =Double.parseDouble(s1);
      
        
     
     
     
     }

}
