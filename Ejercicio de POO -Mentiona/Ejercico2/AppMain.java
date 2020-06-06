/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercico2;

import java.util.Random;
import java.util.Scanner;

public class AppMain {

    public static boolean atacar(int personaje, int atacado) {
        boolean res = false;
        if (personaje != atacado) {
            if (personaje == 3) {
                System.out.println("Oroco Ataque con exito");
                res = true;
            }
            /* Humano y mago*/
            if (personaje == 1 || personaje == 0 && atacado == 3 || personaje == 1 || personaje == 0 && atacado == 3) {
                System.out.println("Humano o Mago Ataca con exito");
                res = true;
            }
            /*Elfo */
            if (personaje == 2 && atacado == 0 || personaje == 2 && atacado == 3) {
                System.out.println("elfo Ataca con exito");
                res = true;
            }
            //enanos
            if (personaje == 5 && atacado == 2 || personaje == 5 && atacado == 3) {
                System.out.println("Enano Ataca con exito");
                res = true;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int personaje;
        int atacar;
        boolean control;
        Random d = new Random();
        int daño = d.nextInt(10) + 1;
        SeresVivos[] seres = new SeresVivos[5];

        seres[0] = new Humano("Aragorn", 20, "Espada");
        seres[1] = new Mago("Gandalf", 30, "baston magico");
        seres[2] = new Elfo("Arco", "Legolas", 40);
        seres[3] = new Orcos("Lanza", "Orconc", 30);
        seres[4] = new Enano("Hacha", "David", 40);

        System.out.println("Con que personaje quieres jugar?\n");
        System.out.println("0- " + seres[0].getNombre());
        System.out.println("1- " + seres[1].getNombre());
        System.out.println("2- " + seres[2].getNombre());
        System.out.println("3- " + seres[3].getNombre());
        System.out.println("4- " + seres[4].getNombre());
        System.out.println("5-ACABAR JUEGO");
        personaje = entrada.nextInt();
        entrada.nextLine();
        while (personaje != 5) {
            System.out.println("A que personaje quieres atacar?\n");
            System.out.println("0-Humano-" + seres[0].getNombre());
            System.out.println("1-Mago" + seres[1].getNombre());
            System.out.println("2-Elfo" + seres[2].getNombre());
            System.out.println("3-Orco-" + seres[3].getNombre());
            System.out.println("4-Enano" + seres[4].getNombre());
            atacar = entrada.nextInt();
            System.out.println("Personaje: " + personaje);
            System.out.println("ATACAR " + atacar);

            switch (personaje) {

                case 0:
                case 1:
                    System.out.println("Personaje switch: " + personaje);
                    System.out.println("ATACAR switch " + atacar);
                    control = atacar(personaje, atacar);
                    if (!control) {
                        System.out.println("SOLO PUEDES ATACAR A LOS ORCOS");

                    } else {
                        if (seres[atacar].getVida() > 0) {
                            seres[atacar].setVida(seres[atacar].getVida() - daño);
                            if (seres[atacar].getVida() <= 0) {
                                System.out.println("Tu enemigo a muerto");
                                System.out.println("Deseas elegir otro personaje o salir?");
                                personaje = entrada.nextInt();
                                entrada.nextLine();
                            }
                        }

                    }
                    break;

                case 2:
                    System.out.println("Personaje switch: " + personaje);
                    System.out.println("ATACAR switch " + atacar);
                    control = atacar(personaje, atacar);
                    if (!control) {
                        System.out.println("SOLO PUEDES ATACAR A LOS ELFOS Y ORCOS");

                    } else {
                        if (seres[atacar].getVida() > 0) {
                            seres[atacar].setVida(seres[atacar].getVida() - daño);
                            if (seres[atacar].getVida() <= 0) {
                                System.out.println("Tu enemigo a muerto");
                                System.out.println("Deseas elegir otro personaje o salir?");
                                personaje = entrada.nextInt();
                                entrada.nextLine();
                            }

                        }
                    }
                    break;

                case 3:
                    System.out.println("Personaje switch: " + personaje);
                    System.out.println("ATACAR switch " + atacar);
                    control = atacar(personaje, atacar);
                    if (!control) {
                        System.out.println("PUEDES ATACARLOS A TODOS,PERO,ALGO SALIDO MAL");

                    } else {
                        if (seres[atacar].getVida() > 0) {
                            seres[atacar].setVida(seres[atacar].getVida() - daño);
                            if (seres[atacar].getVida() <= 0) {
                                System.out.println("Tu enemigo a muerto");
                                System.out.println("Deseas elegir otro personaje o salir?");
                                personaje = entrada.nextInt();
                                entrada.nextLine();
                            }

                        }
                    }

                    break;
                case 4:
                    System.out.println("Personaje switch: " + personaje);
                    System.out.println("ATACAR switch " + atacar);
                    control = atacar(personaje, atacar);
                    if (!control) {
                        System.out.println("SOLO PUEDES ATACAR A LOS HUMANOS Y ORCOS");

                    } else {
                        if (seres[atacar].getVida() > 0) {
                            seres[atacar].setVida(seres[atacar].getVida() - daño);
                            if (seres[atacar].getVida() <= 0) {
                                System.out.println("Tu enemigo a muerto");
                                System.out.println("Deseas elegir otro personaje o salir?");
                                personaje = entrada.nextInt();
                                entrada.nextLine();
                            }
                            System.out.println("Al enemigo le quedan " + seres[atacar].getVida());
                        }
                    }
                    break;

            }

        }
        System.out.println("FIN DEL JUEGO");
        System.exit(0);
    }

}
