/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TirarDado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int frecuencia1=0,frecuencia2=0,frecuencia3=0,
            frecuencia4=0,frecuencia5=0,frecuencia6=0,cara;
        
        for (int tiradas=1; tiradas <=6000; tiradas++) {
            
            cara=1+( int)(Math.random()*6);
            
            switch(cara){
                
                case 1:
                    frecuencia1++;
                   break;
                  
                case 2:
                    frecuencia2++;
                  break;
                  
                case 3:
                    frecuencia3++;
                  break;
                  
                case 4:
                    frecuencia4++;
                  break;
                  
                case 5:
                    frecuencia5++;
                   break;
                    
                case 6:
                    frecuencia6++;
                   break;  
                 
            }
            
        }
         JTextArea areaSalida = new JTextArea();
         areaSalida.setText("cara\t frecuencia\n"+ "\n1\t" + frecuencia1+ "\n2\t" +frecuencia2+ "\n3\t"+frecuencia3 + "\n4\t" +frecuencia4+ "\n5\t" +frecuencia5+"\n6\t"+frecuencia6);
            
         JOptionPane.showMessageDialog(null,areaSalida,"tirar dado 600 veces",JOptionPane.INFORMATION_MESSAGE);
         
         System.exit(0);

    }
    
}
