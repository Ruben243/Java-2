
import javax.swing.JOptionPane;
import java.lang.Math;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

/**
 *
 * @author Alumno33
 */
public class EnterosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor;
        String salida="";
        
        for (int contador = 1; contador<= 20;contador++) {
         
        valor=1+( int)(Math.random()*6);
        
       
        salida+=valor+"";
                
         if (contador%5==0)
             salida+="\n";
        
        }
            JOptionPane.showMessageDialog(null,salida,"20 numeros aleatorios",
                    JOptionPane.INFORMATION_MESSAGE);
            
                   System.exit(0);
    }
    
}
