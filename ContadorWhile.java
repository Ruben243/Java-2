/**
 * ContadorWhile: Contar de 1 a 10
 */
public class ContadorWhile {

    public static void main(String[] args) {
        
        int contador = 1;

        while (contador <= 10) {
            
            System.out.printf("%d ", contador);
            contador++;
        }

        System.out.println();
    }
}