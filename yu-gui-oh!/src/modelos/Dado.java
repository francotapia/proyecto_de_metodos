/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.ImageIcon;
import otros.BD;
/**
 *
 * @author franc
 */
public class Dado {
    
    private String cara6;
    private String cara;
    private int camino; //tipos de caminos que se habilitan, como matrices.
    private String nombreCriatura;
    private int numeroDeCara;
    private ImageIcon imagenDado;
    private Criatura criatura;
    private static final int[][] forma1 = {{0,0},{0,1},{0,2},{1,1},{2,1},{3,1}};


    //contructores para objeto dado:
    public Dado (String cara6, String cara, int camino, String nombreCriatura, Criatura criatura){
        this.cara6 = cara6;
        this.cara = cara;
        this.camino = camino;
        this.nombreCriatura = nombreCriatura;
        this.criatura = criatura;
    } 
    public Dado(){} //constructor vacio
    
    public int lanzarDado(){
        Random rGenerador = new Random();
        numeroDeCara = rGenerador.nextInt(6)+1;
        System.out.println(numeroDeCara);
        return numeroDeCara;
        
    //metodo que obtiene una cara del dado al azar.
    }
    public String cara(int numero){
        if(numero == 1){
            this.cara = "Ataque";
        }
        if(numero == 2){
            this.cara = "Invocacion";
        }
        if(numero == 3){
            this.cara = "Magia";
        }
        if(numero == 4){
            this.cara = "Movimiento";
        }
        if(numero == 5){
            this.cara = "Trampa";
        }
        if(numero == 6){
            this.cara = cara6;
        }
        return cara;
    // metodo que dice a que corresponde la cara que se obtuvo al azar.
    }
    public static int[][] getForma1(){
        return forma1;
    }

    public ImageIcon ImagenesResultados(int DadoR){
        String urlIDado = "\\Imagenes\\carasDados\\"+Integer.toString(DadoR)+".png";
        URL url1 = this.getClass().getClassLoader().getResource(urlIDado);
        //ImageIcon imagenDado = new ImageIcon(url1);
        System.out.println(imagenDado);
        return imagenDado;
        //this.ImagenesResultados.setIcon(imagenDado);
      //imagenDado = new ImageIcon("\\Imagenes\\carasDados\\"+Integer.toString(DadoR)+".png");
    }
    
}