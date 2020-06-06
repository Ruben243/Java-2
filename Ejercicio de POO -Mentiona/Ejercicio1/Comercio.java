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
public class Comercio extends Empleado {

    private int comision;
    private int objetivoVentas;

    public Comercio(String nombre, int sueldo, Categoria categoriaProfesional, int comision, int objetivoVentas) {
        super(nombre, sueldo, categoriaProfesional);
        this.comision = comision;
        this.objetivoVentas = objetivoVentas;
    }

    public int getObjetivoVentas() {
        return objetivoVentas;
    }

    public void setObjetivoVentas(int objetivoVentas) {
        this.objetivoVentas = objetivoVentas;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Comision: " + this.getComision() + "\n"
                + "Objetivo de ventas: " + this.getObjetivoVentas();
    }

}
