package net.intergrupo.arca;


import net.intergrupo.arca.Animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
 public class Mamifero extends Animal {
    
    private int nPatas;
    private boolean peludo;

    public Mamifero() {
        
        
    }

    public Mamifero(int nPatas, boolean peludo, String nombre, String especie) {
        super(nombre, especie);
        this.nPatas = nPatas;
        this.peludo = peludo;
    }
    

    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public boolean isPeludo() {
        return peludo;
    }

    public void setPeludo(boolean peludo) {
        this.peludo = peludo;
    }

    @Override
    public String toString() {
        return super.toString()+" nPatas "+ this.getnPatas()+ " peludo " + this.isPeludo()+ "\n"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hablar() {
     
          System.out.println("Muuuuuu.....");
    }
    
    
    
}
