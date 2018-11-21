/**
 * Suma: Sumar los pares de 2 a 20
 */
public class Suma {

    public static void main(String[] args) {
        
        int total = 0;

        for (int contador = 2; contador <= 20; contador+=2) {
            total += contador;    
        }

        System.out.printf("La suma es %d \n", total);
    }
}