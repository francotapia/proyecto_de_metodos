package modelos;

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
    public void verificarEnMatriz(int[][] forma){
        
    }
    public void verificarDesocupado(int[][] forma){
        
    }
}

