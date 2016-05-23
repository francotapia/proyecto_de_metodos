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
public class JefeDeTerreno extends ElementoEnElCampo {
    
    private int vida;
    private String poder;
    
    //constructores:
    public JefeDeTerreno(int vida, String poder, int posicion){
        this.vida = vida;
        this.poder = poder;
    }
    
    public int getVida(){
        return vida;
    }
    
    public String getPoder(){
        return poder;
    }
    
    public int restarVida(){
        return vida;
    // metodo que resta la vida del jefe de terreno cuando recibe un ataque.
    
    }

    
}
