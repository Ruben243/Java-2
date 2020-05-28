/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import Ejercico2.tipoPizza;

/**
 *
 * @author ruben-gfp
 */
public class Pruebatarjeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TarjetaRegalo t1 = new TarjetaRegalo(23.00);
        TarjetaRegalo t2=new TarjetaRegalo(20.00);
        
        System.out.println("tajeta 1");
        System.out.println(t1.toString());

        t1.gastar(14.50);

        t1.recargar(34.00);

        System.out.println(t1.toString());
        
        System.out.println("Tajeta 2");
        System.out.println(t2.toString());
        
        t1.fusionarCon(t2);
    }

}
