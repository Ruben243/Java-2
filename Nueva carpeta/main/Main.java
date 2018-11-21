/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.intergrupo.main;

import net.intergrupo.arca.Animal;
import net.intergrupo.arca.Arca;
import net.intergrupo.arca.Mamifero;
import net.intergrupo.arca.Reptil;

/**
 *
 * @author Alumno33
 */
public class Main {
    public static void main(String[] args) {
        
       /* Animal animal;
        animal= new Animal("thor","perro");
        
        System.out.println(animal);
        
        Reptil reptil;
        reptil=new Reptil(true,15," pepe "," serpiente ");
        
        System.out.println(reptil);
        
        Mamifero mamifero;
        mamifero=new Mamifero(2,true,"superman", "gato");
        System.out.println(mamifero);
        
        
        Animal animalAux;
        animalAux =new Mamifero(4,true,"omar","loro" );
        
        System.out.println(animalAux);
        ////////////////////////////////////////////////////
        //animalAux.setnPatas(4);///esto no se puede hacer//
        ////////////////////////////////////////////////////
        //////////////////////////////////////////////
        //Mamifero mamiferoAux;///////////////////////
        //mamiferoAux = new Animal("luis","humano");//
        //////////////////////////////////////////////
        */
        
       
       Arca arca =new Arca();
       Mamifero mamifero1= new Mamifero(2,true,"Luis","humano");
       Mamifero mamifero2= new Mamifero(4,true,"Feliz","Gato");
       
       Reptil reptil1= new Reptil(false,4,"tom","serpiente");
       Reptil reptil2= new Reptil(true,4,"tom","cobra");
       
     
       arca.insertarAnimal(mamifero1);
       arca.insertarAnimal(reptil1);
       arca.insertarAnimal(mamifero2);
       arca.insertarAnimal(reptil2);
       
       arca.hablarArca();
       reptil1.comer();
    }  
}
