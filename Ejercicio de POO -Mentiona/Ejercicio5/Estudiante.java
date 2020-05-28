/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Random;

/**
 *
 * @author ruben-gfp
 */
public class Estudiante {

    Random numAleatorio1 = new Random();
    private int idUsuario;
    private String nombre;
    private int numCreditos;
    private String email;

    public Estudiante(String nombre, int numCreditos) {
        this.nombre = nombre;
        idUsuario = numAleatorio1.nextInt(200 - 1 + 1) + 10000;
        email = idUsuario + "@edu.es";
        this.numCreditos = numCreditos;

    }

    public String getNombre() {
        return nombre;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public void modificarCreditos(int c, boolean o) {

        if (o) {
            this.numCreditos = getNumCreditos() + c;
            System.out.println("Los creditos han sido actualizados" + getNumCreditos());
        } else {
            if (c > this.numCreditos) {
                System.out.println("No tiene creidots suficientes");
            } else {
                this.numCreditos = getNumCreditos() - c;
                System.out.println("Los creditos han sido actualizados" + getNumCreditos());
            }
        }

    }

    @Override
    public String toString() {
        return "ID estudiante " + this.getIdUsuario() + "\n"
                + "Nombre: " + this.getNombre() + "\n"
                + "Email: " + this.getEmail() + "\n"
                + "Creditos: " + this.numCreditos;
    }

}
