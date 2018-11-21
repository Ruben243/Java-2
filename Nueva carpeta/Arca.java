/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class Arca {
    
    private Animales[] arca; //composicion,una clase compuesta de objetos de otras clase
    private int posicion;
    
    public Arca(){
        this.arca= new Animales[6];
        this.setPosicion(0);
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
    
    public Arca(int tamanio){
        this.arca=new Animales[tamanio];
         this.setPosicion(0);
    }

    public Animales[] getArca() {
        return arca;
    }

    public void setArca(Animales[] arca) {
        this.arca = arca;
    }
    
   public boolean insertarAnimal(Animales animal){
       boolean insertado=true;
       
       if(!arcaLlena()){
        this.arca[this.getPosicion()]=animal;
        this.setPosicion(this.getPosicion()+1);
       //this.posicion++;
       }
       else{
           insertado=false;
       }
       return insertado;
   } 
    
   public boolean arcaLlena(){
       return this.getPosicion()== this.getArca().length;
   }
    
    public boolean sacarAnimal(String nombre){
        boolean encontrado=false;
        
        for (int i = 0; i <this.getPosicion(); i++) {
            if (nombre.compareTo(this.arca[i].getNombre())==0) {
                
                encontrado=true;
             
                for (int j = i; j <this.getPosicion()-1 ; j++) {
                    this.arca[j]=this.arca[j+1];
                }
                this.arca[this.getPosicion()-1]=null;
                this.setPosicion(this.getPosicion()-1);
                break;
            }
        }
        return encontrado;
    }
    public String mostrarArca(){
        String cadena="";
        for (int i = 0; i < this.getPosicion(); i++) {
            cadena+= "nombre: \n" + this.arca[i].getNombre()+ 
                    "\nsexo: \n"+ this.arca[i].getSexo()+
                    "\nEspecie: \n"+ this.arca[i].getEspecie() +
                    "\n-----\n";
            
        }
        return cadena;
    }
    public Animales buscarAnimal(String nombre){
        for (int i = 0; i <this.getPosicion(); i++) {
            if (nombre.compareTo(this.arca[i].getNombre())==0) {
                return this.arca[i];
            }
        }
        return null;
    } 
}
