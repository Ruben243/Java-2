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
public class Animal {

    private String especie;
    private String nombre;
    private boolean dormido = false;
    private Sexo sexo;

    public Animal() {
        sexo = Sexo.MACHO;
        this.especie = "Especie no definida";
        this.nombre = "nombre no definido";

    }

    public Animal(String s) {
        sexo = Sexo.valueOf(s.toUpperCase());
        this.especie = "Especie no definida";
        this.nombre = "nombre no definido";

    }

    public Animal(String s, String nombre) {
        sexo = Sexo.valueOf(s.toUpperCase());
        this.especie = "Especie no definida";
        this.nombre = nombre;

    }

    public Animal(String s, String nombre, String especie) {
        sexo = Sexo.valueOf(s.toUpperCase());
        this.especie = especie;
        this.nombre = nombre;

    }

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDormido(Boolean dormido) {
        this.dormido = dormido;
    }

    public Boolean getDormido() {
        return dormido;
    }
    
     public void setSexo(String s){
     sexo= Sexo.valueOf(s.toUpperCase());
     
     }

    public void Dormido() {
        Boolean estado = this.getDormido();

        if (estado) {
            System.out.println("Despierto");
            this.setDormido(false);
        } else {
            System.out.println("Dormido");
            this.setDormido(true);
        }

    }
    

    public void Comer() {
        System.out.println("Me gusta lo que estoy comiendo pero no se lo que es");

    }

    public void Comer(String comida) {

        if (comida.charAt(0) == 'c') {
            System.out.println("Me gusta comer " + comida);
        } else {
            System.out.println("No me gusta comer " + comida);
        }

    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\n"
                + "Especie: " + this.getEspecie() + "\n"
                + "Sexo: " + this.sexo.getSexo();

    }

}
