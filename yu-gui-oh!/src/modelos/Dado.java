/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.Random;
import javax.swing.ImageIcon;
/**
 *
 * @author franc
 */
public class Dado {
    
    private int cantidadCaras;
    private String cara;
    private int camino; //tipos de caminos que se habilitan, como matrices.
    private String nombreCriatura;
    private int numeroDeCara;
    private ImagenesResultados img;
    
    //contructores para objeto dado:
    public Dado (int Caras, String cara, int camino, String nombreCriatura){
        this.cantidadCaras = Caras;
        this.cara = cara;
        this.camino = camino;
        this.nombreCriatura = nombreCriatura;
    }    
    public int lanzarDado(){
        Random rGenerador = new Random();
        numeroDeCara = rGenerador.nextInt(6)+1;
                
        return numeroDeCara;
        
    //metodo que obtiene una cara del dado al azar.
    
    }
}
class ImagenesResultados{
    public ImageIcon imagenDado;
    public ImageIcon pngDadoR(int DadoR){
        imagenDado = new ImageIcon("carasDados/"+Integer.toString(DadoR)+".png"); 
        return imagenDado;
    }
}