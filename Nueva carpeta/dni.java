
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class dni {

    /**
     * @param args the command line arguments
     * 
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int numero=0;
        char letra='\0';
        char array[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        
        System.out.println("Introduce tu dni sin letra:");
        numero=entrada.nextInt();
        
       
        letra=array[numero%23];
        
        
        System.out.println("Tu dni es " + numero + " " +letra);
        
    }
    
}
