package net.intergrupo.arca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public abstract class Animal implements PorComer {
    
    private String nombre;
    private String especie;

    public Animal() {
        
    }

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
    @Override
    public String toString(){
        
        return " nombre: " + this.getNombre()+ " Especie: " +this.getEspecie() + "\n";
    }
    
    public abstract void hablar();
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
}
