/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Random;

/**
 *
 * @author ruben-gfp
 */
public class TarjetaRegalo {

    private double saldo;
    Random numAleatorio1 = new Random();
    private int codigotarj = numAleatorio1.nextInt(200 - 1 + 1) + 1000000000;

    public TarjetaRegalo(double s) {
        this.saldo = s;

    }

    public double getSaldo() {
        return saldo;
    }

    public int getCodigotarj() {
        return codigotarj;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void gastar(double s) {
        if (s > this.saldo) {
            System.out.println("Sin fondos");
        } else {
            this.saldo = this.saldo - s;
            System.out.println("Tu saldo es " + this.getSaldo());
        }
    }

    public void recargar(double s) {
        this.saldo = this.saldo + s;
        System.out.println("Tu saldo actual es " + getSaldo());

    }

    public void fusionarCon(TarjetaRegalo t1) {
        this.saldo = t1.getSaldo() + this.getSaldo();

        TarjetaRegalo nuevatarjeta = new TarjetaRegalo(getSaldo());

        System.out.println("Tarjeta fusionadas " + nuevatarjeta.toString());

    }

    @Override
    public String toString() {
        return "Saldo: " + this.getSaldo() + "\n"
                + "Codigo tarjeta: " + this.getCodigotarj();
    }

}
