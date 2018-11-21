// UsoExcepciones.java

public class UsoExcepciones {


    public static void main (String args[])
    {
        
        try {
            lanzarExcepcion();
        }
        catch ( Exception excepcion ) {
            System.err.println("La excepción se manejo en main");
        }
        
        noLanzaExcepcion();
        
    }
    
    public static void lanzarExcepcion() throws Exception
    {
        try {
            System.out.println( "El metodo lanzarExcepcion");
            throw new Exception();
        }
        catch ( Exception excepcion ) {
            System.err.println("La excepcion se manejo en el metodo lanzarExcepcion");
            throw excepcion;
        }
        finally {
            System.err.println("Finalmente se ejecuto en lanzarExcepcion");
        }
        
    }
    
    public static void noLanzaExcepcion() {
        
        try {
            System.out.println ("El metodo noLanzaExcepcion");
        }
        catch ( Exception excepcion ) {
            System.err.println( excepcion );
        }
        finally {
            System.err.println("Finalmente se ejecuto en noLanzaExcepcion");
        }
        
        System.out.println ( "Fin del metodo noLanzaExcepcion");
    }
    
}
