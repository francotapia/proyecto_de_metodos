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
public class Trampa extends ElementoEnElCampo {
    
    private String nombre;
    private int coste;
    private int espacio;
    private int posicion;
    
    public int buscarEspacios(){
        return espacio;
    // con este metodo se buscan los espacios disponibles para posicionar
    // la trampa.
    }
    
    public int posicionarTrampa(){
        return posicion;
    //se escoge la posicion en la cual se quiere poner la trampa.
    }
    
    public String seleccionarTrampa(){
        return nombre;
    }

    
}
