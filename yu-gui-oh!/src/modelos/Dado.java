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
    private ImageIcon imagenDado;
    
    
    //contructores para objeto dado:
    public Dado (int Caras, String cara, int camino, String nombreCriatura){
        this.cantidadCaras = Caras;
        this.cara = cara;
        this.camino = camino;
        this.nombreCriatura = nombreCriatura;
    } 
    public Dado(){}
    
    public int lanzarDado(){
        Random rGenerador = new Random();
        numeroDeCara = rGenerador.nextInt(6)+1;    
        return numeroDeCara;
        
    //metodo que obtiene una cara del dado al azar.
    }
    public String cara(int numero){
        if(numero == 1){
            this.cara = "magia";
        }
        if(numero == 2){
            this.cara = "movimiento";
        }
        if(numero == 3){
            this.cara = "invocacion";
        }
        if(numero == 4){
            this.cara = "trampa";
        }
        if(numero == 5){
            this.cara = "ataque";
        }
        return cara;
    // metodo que dice a que corresponde la cara que se obtuvo al azar.
    }

    public ImageIcon ImagenesResultados(int DadoR){
        System.out.println(DadoR);
        imagenDado = new ImageIcon("Imagenes/carasDados/"+Integer.toString(DadoR)+".png"); 
        return imagenDado;
    
    }
}