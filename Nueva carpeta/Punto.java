/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno33
 */
public class Punto {
    
    private int x;
    private int y;
    
    public Punto(){
        //llamada implicita
    }

    public Punto(int x, int y) {
        //llmada implicita al constructor objet
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
       
    //Metodo que se hereda de la clase objet
    @Override
    public String toString(){
        return"["+ this.getX()
    + ","+ this.getY()+"]";
        
    }
}
