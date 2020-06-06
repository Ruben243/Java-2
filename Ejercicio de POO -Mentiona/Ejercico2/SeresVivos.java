/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercico2;

/**
 *
 * @author ruben-gfp
 */
public class SeresVivos {
    
    private String nombre;
    private int vida;

    public SeresVivos(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+"\n"
                +"Vida: "+this.getVida();
    }
    
    
    
}
