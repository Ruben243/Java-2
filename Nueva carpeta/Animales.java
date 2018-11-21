/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class Animales {

private String nombre;
private String sexo;
private String especie;


public Animales(){
    this("desconocido");
    
}
public Animales(String nombre){
    
    this(nombre,"sin clasificar");
}
public Animales(String nombre, String sexo){
    this(nombre,sexo,"sin clasificar");
    
}
public Animales(String nombre, String sexo, String especie){
    
    this.setNombre(nombre);
    this.setSexo(sexo);
    this.setEspecie(especie);
    
    
    
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }




}
