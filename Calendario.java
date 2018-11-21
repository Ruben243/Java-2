/**
 * Calendario
 */
public class Calendario {

    public static void main(String[] args) {
        

        for (int mes = 1; mes <= 12; mes++) {
            
            System.out.printf("Mes %d - ", mes);

            switch (mes) {
                case 1:
                case 3:
                case 5:    
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tiene 31 dias");
                    break;

                case 2:
                    System.out.println("Tiene 28 dias");
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tiene 30 dias");
                    break;
            
                default:
                    break;
            }
            
        }
    }
}