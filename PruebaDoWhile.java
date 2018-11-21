/**
 * PruebaDoWhile : Contar de 1 a 10
 */
public class PruebaDoWhile {

    public static void main(String[] args) {
        
        int contador = 1;

        do {

            System.out.printf("%d ", contador);
            contador++;

        } while (contador <= 10);

        System.out.println();
    }
}