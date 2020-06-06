/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ruben-gfp
 */
public class AppMain {

    public static void verEmpleados(Empleado[] empleo) {
        for (Empleado dato : empleo) {
            if (dato instanceof Comercio) {
                Comercio comercial = (Comercio) dato;
                System.out.println(comercial.getNombre() + "\n" + comercial.getComision());
            } else if (dato instanceof Repartidor) {
                Repartidor repartido = (Repartidor) dato;
                System.out.println(repartido.getNombre() + "\n" + repartido.getZona());

            } else if (dato instanceof Administrativo) {
                Administrativo administrativo = (Administrativo) dato;
                System.out.println(administrativo.getNombre() + "\n" + administrativo.getDepartamento());

            }
        }

    }

    public static void modificarComision(Empleado[] empleo) {
        Scanner entrada = new Scanner(System.in);
        int comision;
        for (Empleado dato : empleo) {
            if (dato instanceof Comercio) {
                Comercio comercial = (Comercio) dato;
                System.out.println("Indique la nueva comision para los comerciales\n");
                comision = entrada.nextInt();
                entrada.nextLine();
                comercial.setComision(comision);
                System.out.println(comercial.getNombre() + "\n" + comercial.getComision());
            }

        }
    }

    public static void main(String[] args) {
        // TODO code application logic her

        Empleado[] e1 = new Empleado[3];

        e1[0] = new Comercio("Antunez", 2000, Categoria.A, 23, 300);
        e1[1] = new Repartidor("Centro", "Lolo", 1000, Categoria.B);
        e1[2] = new Administrativo("Informatica", "Manuela", 2300, Categoria.C);

        verEmpleados(e1);
        modificarComision(e1);

    }

}
