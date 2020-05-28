/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author ruben-gfp
 */
public class PruebaTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tiempo t1 = new Tiempo(03, 45, 34);
        Tiempo t2 = new Tiempo(02, 54, 12);

        System.out.println(t1.toString());
        t1.suma(3, 20, 00);
        System.out.println("+++++++++++++++++++++");
        System.out.println(t1.toString());
        t1.resta(1, 50, 30);
        System.out.println(t1.toString());

    }

}
