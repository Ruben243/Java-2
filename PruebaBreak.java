/**
 * PruebaBreak
 */
public class PruebaBreak {

    public static void main(String[] args) {
        
        int cuenta;

        for (cuenta = 1; cuenta <= 10; cuenta++)
        {
            if (cuenta == 5)
                break;

            System.out.printf("%d ", cuenta);
        }

        System.out.printf("Salio de la cuenta en el paso = %d\n", cuenta);

    }
}