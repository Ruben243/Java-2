
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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int numero=0;
        int size=0;
        int array[] = null;
       
        
        System.out.println("Introduzca el tamaño del array: ");
        size=entrada.nextInt();
        
        array = new int[size];
        
      
        
        for (int contador = 0; contador < size; contador++) {
             System.out.println("Introduzca un numero: ");
             numero=entrada.nextInt();
             array[contador]=numero;
        }
        System.out.println("\n");
        for (int contador = 0; contador < array.length ; contador++) {
            System.out.printf("%s\n",array[contador]);
        }
    }
    
}
