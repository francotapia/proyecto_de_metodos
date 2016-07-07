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
public class JefeDeTerreno extends ElementoEnElCampo {
    
    private String nombre;
    private int vida;
    private String habilidad;
    private int posicionX; //posicion en modelo
    private int posicionY;
    
    //constructores:
    public JefeDeTerreno(String nombre, int vida, String poder, int posicionX, int posicionY){
        this.vida = vida;
        this.habilidad = habilidad;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.nombre = nombre;
    }
    
    //gets:
    public String getNombreJT(){
        return nombre;
    }
    public int getVida(){
        return vida;
    }
    public String getHabilidad(){
        return habilidad;
    }
    public int getPosicionX(){
        return posicionX;
    }
    public int getPosiconY(){
        return posicionY;
    }
    
    
    public int restarVida(){
        return vida;
    // metodo que resta la vida del jefe de terreno cuando recibe un ataque.
    }
    
    //BD:
    public JefeDeTerreno sacarDeBd(int idJefe, int x, int y){
        BD conexionBD = new BD();
        try{
            conexionBD.conectar();
            Statement stmt = conexionBD.crearConsulta();
            final String consulta = "SELECT NOMBRE, VIDA, ID_JEFE, DUENO, HABILIDAD FROM JEFESDETERRENO WHERE ID_JEFE = " + idJefe;
            
            ResultSet resultados = stmt.executeQuery(consulta);
            
            if(resultados.next()){
                int vida = resultados.getInt("VIDA");
                String nombre = resultados.getString("NOMBRE");
                int IDJefe = resultados.getInt("ID_JEFE");
                String habilidad = resultados.getString("HABILIDAD");
                return new JefeDeTerreno(nombre, vida, habilidad, x, y);
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
