/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class Entero {
    private int operando;
    
    
     public Entero(int operando) {
        this.operando =operando;
    }
    

    public int getOperando() {
        return operando;
    }

    public void setOperando(int operando) {
        this.operando = operando;
    }

   
   
     


    public Entero Sumar(Entero operando2){
        Entero resultado=new Entero(0);
        
        resultado.setOperando(operando2.getOperando()+this.getOperando());
        return resultado;
        
        //return new Entero(this.getOperando()+ operando2.getOperando());
       
       
   }
   
   
    public Entero restar(Entero operando2){
        Entero resultado= new Entero(0);
        
       resultado.setOperando(this.getOperando()- operando2.getOperando()); 
        
       return resultado;
    }
    
    public Entero multiplicar(Entero operando2){
        Entero resultado= new Entero(0);
        resultado.setOperando(this.getOperando()* operando2.getOperando());
        
        return resultado;
    }
    
   
}
