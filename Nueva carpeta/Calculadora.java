/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruben Gines Fernandez Perez
 * DNI 53555461F
 */

public class Calculadora {
    
    private int operando1;
    private int operando2;
   
    public Calculadora (int operando1,int operando2){
        
        this.setOperando1(operando1);
        this.setOperando2(operando2);
        
    }  
        
   public void setOperando1(int operando1){    
        
       this.operando1= operando1;
    }
   
   public void setOperando2(int operando2){
       this.operando2=operando2;
   }
   
   public int getOperando1(){
       
       return this.operando1;
   }
   
   
   public int getOperando2(){
       return this.operando2;
       
   }
   public int getSuma(){
       
       return this.operando1+this.operando2;
   }
   
   public int getResta(){
       
       return this.operando2-this.operando1;
   }
   
   public int getProducto(){
       
       return this.operando2*this.operando1;
   }
}
