/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author ruben-gfp
 */
public class Pruebaanimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Animal corzo = new Animal();
        

        corzo.Comer("cebra");
        corzo.Comer("Anchoa");

        corzo.Dormido();
        corzo.Dormido();
        
        System.out.println(corzo.toString());
        
        System.out.println("+++++++++++++++++++++++++++++++++++");
        
        Animal komodo=new Animal("hembra","Drako","reptil");
        
        System.out.println(komodo.toString());
        komodo.Comer("Nu");
        komodo.Comer();
        komodo.Comer("cebra");
        
        Animal caracol=new Animal("hermafrodita","antoni","gasteropodo");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        caracol.Comer();
        caracol.Comer("berza");
        caracol.Dormido();
        caracol.Dormido();
        caracol.setSexo("macho");
        System.out.println(caracol.toString());

    }

}
