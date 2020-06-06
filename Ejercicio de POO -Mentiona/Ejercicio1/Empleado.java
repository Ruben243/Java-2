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
public class Empleado {

    private String nombre;
    private int sueldo;
    private Categoria categoriaProfesional;

    public Empleado(String nombre, int sueldo, Categoria categoriaProfesional) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.categoriaProfesional = categoriaProfesional;
    }

    public Categoria getCategoriaProfesional() {
        return categoriaProfesional;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setCategoriaProfesional(Categoria categoriaProfesional) {
        this.categoriaProfesional = categoriaProfesional;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\n"
                + "Categoria: " + this.getCategoriaProfesional() + "\n"
                + "Sueldo: " + this.getSueldo();

    }

}
