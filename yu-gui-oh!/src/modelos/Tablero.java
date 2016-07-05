package modelos;

import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author franco
 */
public class Tablero {
    
    private Espacio[][] tablero;

    public Tablero(int jugadores){
        this.tablero = new Espacio[15][15];
        for(int y=0; y<15; y++){
            for(int x=0; x<15; x++){
                this.tablero[x][y] = new Espacio(x,y);
            } 
        }
    }
    public void verificarAdyacente(int[][] forma){
        
    }
    public boolean verificarEnMatriz(int[][] forma){
        for (int y=0;y<6;y++) {
            for (int x=0;x<6;x++){

                
            }
        }return true;    
    }
    public void verificarDesocupado(int[][] forma){
        
    }
}
