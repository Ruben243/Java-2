/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercico2;

public enum Tamaños {
    
    MEDIANA("mediana"),
    FAMILIAR("familiar");

    private final String tamaño;

    private Tamaños(String a) {
        tamaño = a;
    }

    public String getTamaño() {
        return tamaño;
    }

  
}
