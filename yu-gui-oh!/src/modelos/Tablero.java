package modelos;

import java.awt.Color;

/**
 *
 * @author franco
 */
public class Tablero {
    
    private Espacio[][] tablero;

    public Tablero(){
        this.tablero = new Espacio[15][15];
        for(int y=0; y<15; y++){
            for(int x=0; x<15; x++){
                this.tablero[x][y] = new Espacio(x,y);
            } 
        }
    }
    //////gets
    public Espacio[][] getTablero(){
        return this.tablero;
    }
    
    public String getDueno(int x, int y){ //arroja dueño de espacio en tablero en (x,y)
        return tablero[x][y].getDueno(); 
    }
    //////sets
    public void setDueno(int x, int y, int[][] matriz, String dueno){ //agrega dueño a terreno desplegado (forma/matriz)
        tablero[matriz[0][0]+x][matriz[0][1]+y].setDueno(dueno);
        tablero[matriz[1][0]+x][matriz[1][1]+y].setDueno(dueno);
        tablero[matriz[2][0]+x][matriz[2][1]+y].setDueno(dueno);
        tablero[matriz[3][0]+x][matriz[3][1]+y].setDueno(dueno);
        tablero[matriz[4][0]+x][matriz[4][1]+y].setDueno(dueno);
        tablero[matriz[5][0]+x][matriz[5][1]+y].setDueno(dueno);
    }
    
    public void verificarAdyacente(int[][] forma){
        
    }
    public boolean verificarEnMatriz(int[][] forma){
        for (int y=0;y<6;y++) {
            for (int x=0;x<6;x++){

                
            }
        }return true;    
    }
    public void verificarDesocupado(int x, int y){ //verifica si esta ocupado
        
    }
}
