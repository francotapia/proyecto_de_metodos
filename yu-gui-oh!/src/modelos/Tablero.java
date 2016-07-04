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
        for(int x=0; x<15; x++){
            for(int y=0; y<15; y++){
                this.tablero[x][y] = new Espacio(x,y);
            } 
        }
    }
    
    //public ArrayList<Espacio> 
    //public int[] getMostrarPosicion(Tablero casillas){
      //  int[] coordenadas = new int[2];
        //for (int x = 0; x < this.casillas.length; x++){
          //  for (int y = 0; y < this.casillas.length; y++) {
            //    if (this.casillas[x][y] == casillas) {
              //      coordenadas[0] = x;
                //    coordenadas[1] = y;
                  //  System.out.println(coordenadas[0]);                                                       
               // }
            //}
        //}
        //return coordenadas;
            
     //   }
        
   //  public Tablero[][] getCasillas() {
       // return casillas;
    
    
    //}
//}
    
}

