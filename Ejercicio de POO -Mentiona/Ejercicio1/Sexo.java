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
public enum Sexo {
    MACHO("macho"),
    HEMBRA("hembra"),
    HERMAFRODITA("hermafrodita");

    private final String sexo;

    private Sexo(String a) {
        sexo = a;
    }

    public String getSexo() {
        return sexo;
    }

}
