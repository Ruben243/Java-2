/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author ruben-gfp
 */
public class PruebaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner v1 = new Scanner(System.in);
        int opcion = 0;
        int num;
        String nombre;
        int numCre;
        Estudiante[] p1 = null;
        int id;
        System.out.println("GESTION DE ESTUDIANTES");

        while (opcion != 4) {
            System.out.println("Elije una opcion");
            System.out.println("1-Agregar estudiantes");
            System.out.println("2-Eliminar estudiantes");
            System.out.println("3-Ver informacion del estudiante");
            System.out.println("4-Salir");
            opcion = v1.nextInt();

            switch (opcion) {

                //Funciona
                case 1:

                    System.out.println("¿cuantes alumnos quieres crear?");
                    num = v1.nextInt();
                    System.out.println(num);
                    p1 = new Estudiante[num];

                    for (int i = 0; i < num; i++) {
                        System.out.println("Nombre del alumno");
                        nombre = v1.next();
                        System.out.println("Numero de creditos");
                        numCre = v1.nextInt();

                        p1[i] = new Estudiante(nombre, numCre);

                        System.out.println("Estudiante " + nombre + " creado");
                    }

                    break;

                    
                    
                    //Funciona
                case 2:
                    System.out.println("¿Que estudiante quieres eliminar?");

                    for (int i = 0; i < p1.length; i++) {
                        System.out.println(i + " " + p1[i].toString());

                    }
                    id = v1.nextInt();
                    p1[id] = null;

                    System.out.println("Estudiante " + id + " elimnado");

                    break;

                //FUNCIONA
                case 3:
                    System.out.println("¿que estudiante quieres ver");

                    for (int i = 0; i < p1.length; i++) {
                        if (p1[i] != null) {
                            System.out.println(p1[i].toString());
                        }

                    }

                    id = v1.nextInt();

                    for (int i = 0; i < p1.length; i++) {

                        //System.out.println("ID dentro del for" + id);
                        //System.out.println("id usuario dentro del for" + p1[i].getIdUsuario());
                        if (p1[i] != null) {
                            if (id == p1[i].getIdUsuario()) {

                                if (p1[i] != null) {
                                    System.out.println(p1[i].toString());
                                }

                            } else if ( i == p1.length && p1[i] != null) {
                                System.out.println("EL estudiante " + id + " no existe");

                            }
                        }
                    }

                    break;

                case 4:
                    System.out.println("FIN DEL PROGRAMA");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Elija una opcion correcta");
                    break;

            }

        }
    }

}
