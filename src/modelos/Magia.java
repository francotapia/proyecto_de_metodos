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
public class Magia {
    
    private String nombreMagia;
    
    //efecto ejercido al momento de realizar la magia.
    private int efecto;
    
    //Coste de para realizar la magia.
    private int costo;
    
    public String getNombre(){
        return nombreMagia;
    }
    public int getEfecto(){
        return efecto;
    }
    
    public int getCosto(){
        return costo;
    }
    
    //selección de magia al azar
    public String seleccionarMagia(){
        return nombreMagia;
    }
    
    
    //realizar la magia
    public int realizarMagia(){
         return efecto;
        
    }

    
}
