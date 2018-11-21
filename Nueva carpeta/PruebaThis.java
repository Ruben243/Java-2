
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class PruebaThis {
    
    public static void main(String[] args) {
        PruebaThis prueba= new PruebaThis();
        HoraSimple hora = prueba.new HoraSimple(2,4,5);
        System.out.println(hora.crearCadena());
        
      
    }
    
    class HoraSimple {
        
        private int hora;
        private int minuto;
        private int segundo;
        
        public HoraSimple(int hora,int minuto,int segundo){
            this.hora=hora;
            this.minuto= minuto;
            this.segundo=segundo;
            
            
            
        }
        //Utilizar this implicito e explicito
        
        public String crearCadena(){
            return "this.aStringStandar()" + this.aStringStandar() + "\naStringStandar(): " + aStringStandar();
        }
        
        //devolver String horasSimple
        public String aStringStandar(){
            
            DecimalFormat dosDigitos = new DecimalFormat("00");
               return dosDigitos.format(this.hora)+ ":" +
                       dosDigitos.format(this.minuto)+ ":" +
                       dosDigitos.format(this.segundo); 
        }
    }
    
}
