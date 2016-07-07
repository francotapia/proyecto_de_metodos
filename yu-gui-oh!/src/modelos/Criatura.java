/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import otros.BD;

/**
 *
 * @author franc
 */
public class Criatura {
    
    private int vida;
    private int def;
    private int atk;
    private int nivel;
    private int posicionX;
    private int posicionY;
    private String nombre;
    
    //Constructor:
    public Criatura(int vida, int def, int atk, int nivel, String nombre, int x, int y){
        this.atk = atk;
        this.def = def;
        this.nivel = nivel;
        this.vida = vida;
        this.nombre = nombre;
        this.posicionX = x;
        this.posicionY = y;      
    }
    
   //GeTS:
    public int getPosicionX(){
        return this.posicionX;
    }
    public int getPosicionY(){
        return this.posicionY;
    }
    public int getAtk(){ 
        return atk;
    }
    public int getVida(){
        return vida;
    }
    public int getdef(){
        return def;
    }
    public int getNivel(){
        return nivel;
    }
    
    //SETs:
    public void setPosicionX(int posicion){
        this.posicionX = posicion;
    }
    public void setPosicionY(int posicion){
        this.posicionY = posicion;
    }
    public void setVida(int vida){ //reemplaza vida luego de ataque
        this.vida = vida;
    }
    
    public int restarVida(int atk, int def){
        int vidaN = def - atk;
        this.vida = vidaN;
        return vida;
    // metodo que resta la vida de la criatura cuando recibe un ataque
    }
    public void atacar(){
        
    }
    public void comprobarAtaque(int x, int y, int x1, int y1){ //boolean
       
    }
    
    //DB:
    public Criatura sacarDeBD(int idCriatura, int x, int y){
        BD conexionBD = new BD();
        try{
            conexionBD.conectar();
            Statement stmt = conexionBD.crearConsulta();
            final String consulta = "SELECT NOMBRE, VIDA, ATAQUE, DEFENSA, DUENO, NIVEL, ID_CRIATURA FROM CRIATURAS WHERE ID_CRIATURA = " + idCriatura;
            
            ResultSet resultados = stmt.executeQuery(consulta);
            
            if(resultados.next()){
                int vida = resultados.getInt("VIDA");
                int ataque = resultados.getInt("ATAQUE");
                int defensa = resultados.getInt("DEFENSA");
                int nivel = resultados.getInt("NIVEL");
                String nombre = resultados.getString("NOMBRE");
                return new Criatura(vida, defensa, ataque, nivel, nombre, x, y);    
            }
            else{
                return null;
            }
        }
        catch(SQLException ex){
            System.err.println("Base de datos no conectada");
            return null;
        }
    }
}
