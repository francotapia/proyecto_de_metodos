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
    
    private int posicion;
    private int forma;
    private Tablero [][] casillas ;

    public int getPosicion() {
        return posicion;
    }
    
    public int getForma() {
        return forma;
    }
    
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setForma(int forma) {
        this.forma = forma;
    }
    
    
    public int[] getMostrarPosicion(Tablero casillas){
        int[] coordenadas = new int[2];
        for (int x = 0; x < this.casillas.length; x++){
            for (int y = 0; y < this.casillas.length; y++) {
                if (this.casillas[x][y] == casillas) {
                    coordenadas[0] = x;
                    coordenadas[1] = y;
                    System.out.println(coordenadas[0]);                                                       
                }
            }
        }
        return coordenadas;
            
        }
        
     public Tablero[][] getCasillas() {
        return casillas;
    
    
    }
}
    
    

