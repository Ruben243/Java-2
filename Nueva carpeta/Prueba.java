/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @autho Ruben Gines Fernandez Perez
 * DNI 53555461F
 */

public class Prueba {
    
    public static void main(String[] args) {
        
     Calculadora calculadora1 =new Calculadora(2,4);
        
        System.out.println("Operando 1: "+ calculadora1.getOperando1());
        System.out.println("Operando2: "+  calculadora1.getOperando2());
        System.out.println("Suma: "+calculadora1.getSuma());
        System.out.println("Resta: "+calculadora1.getResta());
        System.out.println("Producto: "+calculadora1.getProducto());
        
        System.out.println("\n"); 
        
        calculadora1.setOperando1(4);
        calculadora1.setOperando2(7);
         
        System.out.println("Operando 1: "+ calculadora1.getOperando1());
        System.out.println("Operando2: "+  calculadora1.getOperando2());
        System.out.println("Suma: "+calculadora1.getSuma());
        System.out.println("Resta: "+calculadora1.getResta());
        System.out.println("Producto: "+calculadora1.getProducto());
    }
    
}
