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
public class Pizza {

    private tipoPizza tipo;
    private estadoPizza estado;
    private Tamaños tamaño;
    private boolean est;

    public Pizza(String s, estadoPizza estado, String t) {
        this.tipo = tipoPizza.valueOf(s.toUpperCase());
        this.estado = estadoPizza.PEDIDA;
        this.tamaño = Tamaños.valueOf(t.toUpperCase());
    }

    public void setTamaño(String t) {
        tamaño = Tamaños.valueOf(t.toUpperCase());

    }

    public void setTipo(String s) {
        tipo = tipo.valueOf(s.toUpperCase());

    }

    public void setEstado(String s) {
        estado = estadoPizza.valueOf(s.toUpperCase());

    }

    public String estadoPizza(boolean e) {
        String resultado;
        if (e) {
            resultado = "En camino";
            est=true;
        } else {
            resultado = "En Preparacion";

        }
        return resultado;
    }

    public void servir() {
        if (estado.getEstado() == "servida") {
            setEstado("Esta servida");
        } else {
            setEstado("pedida");

        }
        
    }

    @Override
    public String toString() {
        return "Tipo:" + this.tipo.getTipo() + "\n"
                + "Estado:" + this.estado.getEstado() + "\n"
                + "Tamaño:" + this.tamaño.getTamaño()+"\n"
                + "Seguimiento" + estadoPizza(est);
    }

}
