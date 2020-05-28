/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.time.LocalTime;

/**
 *
 * @author ruben-gfp
 */
public class Tiempo {

    LocalTime horas = LocalTime.parse("00:00:00");
    private int hora = horas.getHour();
    private int min = horas.getMinute();
    private int seg = horas.getSecond();

    public Tiempo(int h, int m, int s) {

        this.hora = h;
        this.min = m;
        this.seg = s;

    }

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public void suma(int h, int m, int s) {
        hora = hora + h;

        seg = seg + s;
        if (seg >= 60) {
            this.seg -= 60;
            min = min + 1;

        }

        min = min + m;

        if (min >= 60) {
            this.min -= 60;
            hora = hora + 1;

        }

    }

    public void resta(int h, int m, int s) {
        hora = hora - h;

        seg = seg - s;
        if (seg < 0) {
            min--;
            s += 60;
        }

        min = min - m;

        if (min < 0) {
            hora--;
            min += 60;
        }

    }

    @Override
    public String toString() {
        return this.getHora() + " Horas" + "\n"
                + this.getMin() + " minutos" + "\n"
                + this.getSeg() + " segundos";

    }
}
