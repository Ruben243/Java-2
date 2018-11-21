/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class PruebaEntero {
    
    public static void main(String[] args) {
        
      Entero numero1= new Entero(5);
      Entero numero2=new Entero(6);
      
      Entero resultado= null;;
        
      resultado= numero1.Sumar(numero2);
        
        System.out.println(numero1.getOperando()+ " + " + numero2.getOperando()+ " = " + resultado.getOperando() );
        
        resultado= numero1.restar(numero2);
        
        System.out.println(numero1.getOperando()+ " - " + numero2.getOperando()+ " = " + resultado.getOperando() );
        
        resultado= numero1.multiplicar(numero2);
        
        System.out.println(numero1.getOperando()+ " * " + numero2.getOperando()+ " = " + resultado.getOperando() );
        
        
    }
}
