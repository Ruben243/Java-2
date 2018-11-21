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
public class pruebaContacto {
    
    public static void main(String[] args) {
        
    Contacto pepe= new Contacto("Ruben","Perez","6564558");
        
    
    
        System.out.println("Nombre: " + pepe.getNombre());
        System.out.println("Apellidos: " + pepe.getApellido());
        System.out.println("Telefono: "+ pepe.getTelefono());
        System.out.println("Contacto: "+ pepe.getContacto());
    Contacto antonio= new Contacto("Antonio","Garcia","646556556");
          
        System.out.println("Nombre: " + antonio.getNombre());
        System.out.println("Apellidos: " + antonio.getApellido());
        System.out.println("Telefono: "+ antonio.getTelefono());
        System.out.println("Contacto: "+ antonio.getContacto());
        
    }
    
}
