/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author franc
 */
public class Espacio {
    private String dueno;
    private final int posicionX;
    private final int posicionY;
    private boolean disponible;
    private Criatura criatura;
    public Trampa trampa;
    
    //Constructor
    public Espacio(int x, int y){
        this.posicionX = x;
        this.posicionY = y;
        this.dueno = null;
        this.criatura = null;
        this.trampa = null;
    }

    //Metodos
    
    public boolean hayTerreno() { //comprueba si el terreno tiene despliegue
        return dueno != null;
    }
    //gets
    public String getDuneo(){
        return this.dueno;
    }
    public int getPosicionX(){
        return this.posicionX;
    }
    public int getPosicionY(){
        return this.posicionY;
    }
    public Criatura getCriatura(){
        return this.criatura;
    }
    public Trampa getTrampa(){
       return this.trampa;
    }
    
    //sets
    public void setDueno(String dueno){ //da dueño
        this.dueno = dueno;
    }
}