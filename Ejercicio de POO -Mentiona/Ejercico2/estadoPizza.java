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
public enum estadoPizza {
    PEDIDA("pedida"),
    SERVIDA("servida");

    private final String tipo;

    private estadoPizza(String a) {
        tipo = a;
    }

    public String getEstado() {
        return tipo;
    }

}
