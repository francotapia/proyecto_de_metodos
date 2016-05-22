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
public class Criatura extends ElementoEnElCampo {
    
    private int vida;
    private int def;
    private int atk;
    private int nivel;
    private String nombre;
    
    public int getAtk(){ 
        return atk;
    }
    
    public int getVida(){
        return vida;
    }
    
    public int getdef(){
        return def;
    }
    
    public int getNivel(){
        return nivel;
    }

    public int restarVida(){
        return vida;
    // metodo que resta la vida de la criatura cuando recibe un ataque
    
    }

}
