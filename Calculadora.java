/**
 * Calculadora
 */

 import java.util.Scanner;

public class Calculadora {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int numero1 = 0;
        int numero2 = 0;
        int opcion = 0;

        System.out.print("Introduce primer operando: ");
        numero1 = entrada.nextInt();

        System.out.print("Introduce segundo operando: ");
        numero2 = entrada.nextInt();

        System.out.println("Menu operador");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Producto");
        System.out.println("4 - Cociente");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.printf("La suma es %d\n", numero1 + numero2);
                break;
            
            case 2:
                System.out.printf("La resta es %d\n", numero1 - numero2);
                break;

            case 3:
                System.out.printf("El producto es %d\n", numero1 * numero2);
                break;
            
            case 4:
                System.out.printf("El cociente es %.2f\n", (float) numero1 / numero2);
                break;
            default:
                break;
        }


    }
}