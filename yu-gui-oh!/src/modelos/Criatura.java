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
public class Criatura {
    
    private int vida;
    private int def;
    private int atk;
    private int nivel;
    private int posicion;
    private String nombre;
    
    //metodos set de vida
    public void setVida(int vida){ //reemplaza vida luego de ataque
        this.vida = vida;
    }
    public int getPosicion(){
        return this.posicion;
    }
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
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

    public int restarVida(int atk, int def){
        int vidaN = def - atk;
        this.vida = vidaN;
        return vida;
    // metodo que resta la vida de la criatura cuando recibe un ataque
    
    }
    public void atacar(){
        
    }
    public void comprobarAtaque(int x, int y, int x1, int y1){ //boolean
       
    }

}
