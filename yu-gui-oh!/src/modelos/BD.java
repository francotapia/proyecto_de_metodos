/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sebastian
 */
public class BD {
    private static final String SERVIDOR = "localhost";
    private static final String PUERTO = "1527";
    private static final String NOMBRE_BD = "Grupo3";
    private static final String USUARIO = "Grupo3";
    private static final String PASSWORD = "civilwar";
    private static final String URL_BD = "jdbc:derby://" + SERVIDOR + ":" + PUERTO + "/" + NOMBRE_BD + ";user=" + USUARIO + ";password=" + PASSWORD;
    private Connection bd = null;
            
    public boolean conectar() throws SQLException {
        this.bd = DriverManager.getConnection(URL_BD);
        if(this.bd != null){
            return true;
        }
        else{
            return false;
        }
    }
    public void desconectar() throws SQLException{
        if(this.bd != null){
            this.bd.close();
        }
    }
    public Statement crearConsulta() throws SQLException{
        if(this.bd != null){
            return this.bd.createStatement();
        }
        else{
            return null;
        }
    }
}
