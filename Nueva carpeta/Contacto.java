/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruben
 * DNI 53555461F
 */
public class Contacto {
    
    private String nombre;
    private String apellido;
    private String telefono;
    
   
    public Contacto(String nombre, String apellido, String telefono){
        this.setNombre (nombre);
        this.setApellido(apellido);
        this.setTelefono(telefono);
        
    }

   
   public void setNombre(String nombre){
    
       this.nombre=nombre.toUpperCase();
    
   }
   
   public void setApellido (String apellido){
    
       this.apellido = apellido;
  }
   
   
   public void setTelefono(String telefono){
       
    this.telefono="+34" + telefono ;
    
    }
   
   public String getNombre(){
    
    return this.nombre;
    }
   
   public String getApellido(){
    
    return this.apellido;
    }
   
   public String getTelefono(){
    
       return this.telefono;
    
    }
   
   public String getContacto(){
       
       return this.nombre +" "+this.apellido +" "+this.telefono;
   }
   
}

