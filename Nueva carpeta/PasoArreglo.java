/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class PasoArreglo {

    /**
     * @param args the command line arguments
     */
    
    public static void modificarArray(int array[]){
        for (int i = 0; i <array.length; i++) {
            array[i]*=2;
            
        }
    }
    
    public static void modificarElemento(int elemento){
        elemento=elemento*2;
        System.out.println("Elemento modificado: " + elemento);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int array[]={1,2,3,4,5};
        
        System.out.println("Matriz original");
        
        for(int i: array){
            System.out.printf("%d\n", i);
        }
        PasoArreglo.modificarArray(array);
        System.out.println("Matriz modificada");
        for (int i : array) {
          System.out.printf("%d\n",i);
          
        }
        System.out.println("Valor elemento pos: 4\n" + array[4]);
        
        PasoArreglo.modificarElemento(array[4]);
        System.out.println("Valor elemento despues modificado pos 4: "+ array[4]);
        
    }
    
}
