/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
import java.util.Scanner;
public class EjercicioMatriz01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
           int nota =0;
            int array[]={0,0,0,0,0};
           Scanner entrada=new Scanner(System.in);
           
           for (int contador = 0; contador <=10; contador++) {
               System.out.printf("¿que nota ha sacado?");
                nota=entrada.nextInt();
            
              
                   array[nota-1]++;
               
               
          
        }
           
           
           
        for (int contador = 0; contador <array.length; contador++) {
             System.out.print("Calificacion "+(contador+1)+ " numeros de personas " +array[contador] + ": ");
            
            for (int i = 0; i < array[contador]; i++) {
                System.out.print("*");
            }
           
            System.out.println("\n");
        }
    }

}