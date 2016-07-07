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
    private JefeDeTerreno jefeDeTerreno;
    
    //Constructor
    public Espacio(int x, int y){
        this.posicionX = x;
        this.posicionY = y;
        this.dueno = null;
        this.criatura = null;
        this.trampa = null;
    }

    //Metodos
    //********************************
    //gets
    public String getDueno(){
        return this.dueno;
    }
    public JefeDeTerreno getJefeDeTerreno(){
        return this.jefeDeTerreno;
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
    public void setJefeDeTerreno(JefeDeTerreno jefeDeTerreno){
        this.jefeDeTerreno = jefeDeTerreno;
    }
    public void setCriatura(Criatura criatura){
        this.criatura = criatura;
    }
    
    ////otros metodos para tablero-batalla
    public boolean verificarJefeDeTerreno(){ //verifica si está jefe de terreno...
        if(this.jefeDeTerreno != null){         //puede usarse para ubicar terreno y comprobaciones
            return true;
        }
        else{
            return false;
        }
    }
    public boolean verificarCriatura(){  //verifica si hay ciratura en espacio...
        if(this.criatura != null){      //puede utilizarse para movimiento de ciratura (no pasar encima de otra
            return true;
        }
        else{
            return false;
        }
    }
    public boolean hayTerreno() { //comprueba si el terreno tiene despliegue
        if(this.dueno != null){     //para despliegue
            return dueno != null;
        }
        else{
            return false;
        }
    }
    public boolean verificarVacio(){ //comprueba si hay criatura o Jefe
        if(!this.verificarJefeDeTerreno() && !this.verificarCriatura()){
            return true;
        }
        else{
            return false;
        }
    }
}