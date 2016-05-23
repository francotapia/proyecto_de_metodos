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
public class Dado {
    
    private int cantidadCaras;
    private String cara;
    private int camino; //tipos de caminos que se habilitan, como matrices.
    private String nombreCriatura;
    
    //contructores para objeto dado:
    public Dado (int Caras, String cara, int camino, String nombreCriatura){
        this.cantidadCaras = Caras;
        this.cara = cara;
        this.camino = camino;
        this.nombreCriatura = nombreCriatura;
    }
    
    public String lanzarDado(){
        return cara;
    //metodo que obtiene una cara del dado al azar.
    
    }

    
}
