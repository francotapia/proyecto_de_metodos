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
    
    private int espacioDisponible;
    private int espacioNoDisponible;
    
    public int habilitarEspacio(){
        return espacioDisponible;
    // con este metodo se habilitan los espacios que no lo estaban a medida 
    // que avanza el juego.
    }

    
}
