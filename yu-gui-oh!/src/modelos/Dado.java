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
    
    //contructores para objeto dado:
    public Dado (int Caras, String cara, int camino, String nombreCriatura){
        this.cantidadCaras = Caras;
        this.cara = cara;
        this.camino = camino;
        this.nombreCriatura = nombreCriatura;
    }

    public Dado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int lanzarDado(){
        Random rGenerador = new Random();
        numeroDeCara = rGenerador.nextInt(6)+1;
                
        return numeroDeCara;
        
    //metodo que obtiene una cara del dado al azar.
    
    }

    
}
class ImagenesResulados{
    public ImageIcon imagenDado;
    public ImageIcon pngDadoR(int DadoR){
        switch(DadoR){
            case 1:
                imagenDado = new ImageIcon(ataque.png); break; //aqui deberia accederse a la imagen ataque en paquete Imagenes
            case 2:
                imagenDado = new ImageIcon(invocacion.png); break;
            case 3:
                imagenDado = new ImageIcon(magia.png); break;
            case 4:
                imagenDado = new ImageIcon(movimiento.png); break;
            case 5:
                imagenDado = new ImageIcon (trampa.png); break;
        }
        return imagenDado;
    }
}