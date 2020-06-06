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
public class Administrativo extends Empleado {

    private String departamento;

    public Administrativo(String departamento, String nombre, int sueldo, Categoria categoriaProfesional) {
        super(nombre, sueldo, categoriaProfesional);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Departamento: " + this.getDepartamento();
    }

}
