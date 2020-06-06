/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author ruben-gfp
 */
public class Repartidor extends Empleado {

    private String zona;

    public Repartidor(String zona, String nombre, int sueldo, Categoria categoriaProfesional) {
        super(nombre, sueldo, categoriaProfesional);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Zona de reparto:" + this.getZona();
    }

}
