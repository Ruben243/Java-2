/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class PruebaArca {
    
    public static void main(String[] args) {
        
        Arca arca= new Arca(8);
        
        Animales animal1= new Animales("Fox ", "Macho ","Perro");
        Animales animal2= new Animales("drago ","Macho ","gato");
        Animales animal3= new Animales("Lucas ","Macho ","pato ");
        Animales animal4= new Animales("Anacleto ","Macho ","ornitorinco ");
 

        arca.insertarAnimal(animal1);
        arca.insertarAnimal(animal2);
        arca.insertarAnimal(animal3);
        arca.insertarAnimal(animal4);
         
        System.out.println(arca.mostrarArca());
        
        System.out.println("Se saca un animal");
        arca.sacarAnimal("Lucas");
        
        System.out.println(arca.mostrarArca());
        
        Animales animalBuscar=null;
        animalBuscar=arca.buscarAnimal("Anacleto");
        
        if(animalBuscar!=null)
            System.out.println(animalBuscar.getNombre());
    }
}
