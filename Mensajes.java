/**
 * Mensajes
 */

import java.util.Scanner;

public class Mensajes {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        System.out.println("***** MENU ****");
        System.out.println();
        System.out.println("1,20,50 - Mensaje bonito");
        System.out.println("2 - Mensaje feo");
        System.out.println("3 - Mensaje soso");
        System.out.print("Elige una de las opciones anteriores: ");

        opcion = entrada.nextInt();


        switch (opcion) {
            case 1:
            case 20:
            case 50:
                System.out.println("Que guapo es el amor");
                break;
            case 2:
                System.out.println("Este mundo es una m.....");
                break;
            case 3:
                System.out.println("Ni fu ni fa");
                break;
        
            default:
                System.out.println ("Entre en default");
                break;
        }

        
    }
}