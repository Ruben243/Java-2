/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class arrayMultidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int array[][]={{1,2},{3,4},{5,6}};
        
        int array2[][]={{1,2},{3,65,6,7},{3,4,5}};
        int array3[][]=new int [3][4];
        
        int array4[][]=new int [4][];
       
        array4[0]=new int[5];
        array4[1]=new int [8];
        
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(" "+ array2[i][j]);
                
            }
            System.out.println("");
        }
        System.out.println("----");
        
        for (int[] filas: array2) {
            for ( int numero : filas) {
                System.out.print(" "+ numero);
            }
            System.out.println("");
        }
        
        
        System.out.println("---------------");
        for (int columna = 0; columna < array2[1].length; columna++) {
            array2[1][columna]=0;
        }
        
           for (int[] filas: array2) {
                for ( int numero : filas) {
                System.out.print(" "+ numero);
                }
        System.out.println("");
            }
    
        System.out.println("----------");
           array2[0]=array2[2];
             for (int[] filas: array2) {
                for ( int numero : filas) {
                System.out.print(" "+ numero);
                }
        System.out.println("");
            }
             
           System.out.println("----------");
           array2[0][0]=array2[0][1];
             for (int[] filas: array2) {
                for ( int numero : filas) {
                System.out.print(" "+ numero);
                }
        System.out.println("");
            }  
             
           
    }
}
