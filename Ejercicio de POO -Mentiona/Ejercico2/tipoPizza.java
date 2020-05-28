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
public enum tipoPizza {

    MARGARITA("margarita"),
    CUATROQUESOS("cuatro quesos"),
    FUNGHI("funghi");

    private final String tipo;

    private tipoPizza(String a) {
        tipo = a;
    }

    public String getTipo() {
        return tipo;
    }

}
