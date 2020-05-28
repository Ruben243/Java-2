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
public class PruebaPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizza p1 = new Pizza("cuatroquesos", estadoPizza.PEDIDA, "mediana");

        System.out.println(p1.toString());
        p1.setEstado("servida");
        System.out.println("++++++++++++++++++++++");
        System.out.println(p1.toString());
        p1.estadoPizza(true);
        System.out.println(p1.toString());

    }

}
