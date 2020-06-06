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
public class Enano extends SeresVivos {

    private String arma;

    public Enano(String arma, String nombre, int vida) {
        super(nombre, vida);
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