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
public class PedirNumeros {

    /**
     * @param args the command line arguments
     */
    public static boolean buscarNumero(int array[],int numero){
        for (int contador = 0; contador < array.length; contador++) {
            if(array[contador]== numero){
                return true;
            }
           
        }
         return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=0;
        int numero=0;
        Scanner entrada=new Scanner(System.in);
        int array[]={0,0,0,0,0};
        
        while(contador <5) {
            System.out.println("Introduzca un numero: ");
            numero=entrada.nextInt();
            if (numero<=100 && numero>=10) {
                
                
                if (PedirNumeros.buscarNumero(array, numero)) {
                    
                    System.out.println("El numero esta en el array");
                    
                    
                } else {
                    
                    array[contador]=numero;
                    contador++;
                    
                }
                
            }else{
                System.out.println("Numero equivocado");
            }
        }
        for( contador = 0; contador<5; contador++){
           System.out.printf("%s\n",array[contador]);
        }
       
    }
        
    
}
