/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */

public class PruebaTiempo1 {
    public static void main(String[] args) {
        
        Tiempo1 tiempo= new Tiempo1();//llamada al constructor
        
        System.out.println("Hora Universal "+ tiempo.aStringUniversal());
        System.out.println("Hora Standar "+ tiempo.aStringStandar());
        
        tiempo.establecerHora(16, 25, 45);
         System.out.println("Hora Universal "+ tiempo.aStringUniversal());
        System.out.println("Hora Standar "+ tiempo.aStringStandar());
        
      
        
          Tiempo1 tiempo2= new Tiempo1();
          System.out.println("Imprimir tiemp 2");
          
          System.out.println("Hora Universal "+ tiempo2.aStringUniversal());
        System.out.println("Hora Standar "+ tiempo2.aStringStandar());
        
        tiempo2.establecerHora(14, 45, 35);
        
         System.out.println("Hora Universal "+ tiempo2.aStringUniversal());
        System.out.println("Hora Standar "+ tiempo2.aStringStandar());
          
    }
    
}
