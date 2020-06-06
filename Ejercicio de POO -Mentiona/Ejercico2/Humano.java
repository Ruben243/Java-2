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
public class Humano extends SeresVivos {

    private String arma;

    public Humano(String nombre, int vida, String arma) {
        super(nombre,vida);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Arma: " + this.getArma();
    }

}
