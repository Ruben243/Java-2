
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
public class PruebaMaximo extends JApplet {
    
    public void init()
    {
        String s1= JOptionPane.showInputDialog("Escriba el primer valor de punto flotante");
        String s2=JOptionPane.showInputDialog("Escriba el segundo numero de tipo flotante");
        String s3=JOptionPane.showInputDialog("Escriba el tercer numero de punto flotante");
        
        Double numero1 =Double.parseDouble(s1);
        Double numero2 = Double.parseDouble(s2);
        Double numero3=Double.parseDouble(s3);
        
        double max=maximo (numero1,numero2,numero3);
        
        JTextArea salida=new JTextArea();
        Container contenedor=getContentPane();
        contenedor.add(salida);
        salida.setText("numero1: "+ numero1+"\nnumero2 "+numero2+"\nnumero: "+numero3+"\nel numero maximo es: "+max);
        
    }
            
      public double maximo(double x,double y,double z  )
      {
          return Math.max(x,Math.max(y, z));
          
      }
              
        
    
}
