
package modelos;

import otros.BD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author franc
 */
public class Jugador {
   
    //Atributos de la clase Jugador
    private String usuario;
    private String contraseña;
    private int puntaje;
    private int jefeTerreno;
    private PuzzleDeDados puzzle;
    private Accion accion;
    private Turno turno;
    private boolean leTocaJugar;
    
    //Constructores de la clase
    public Jugador(String jug, String cont, int jTerreno){
        this.usuario = jug;
        this.contraseña = cont;
        this.jefeTerreno = jTerreno;
    }
    public Jugador(){
        this.turno = new Turno();
        this.usuario = null;
        this.contraseña = null;
        
    }
    //Metodos de la clase
    //get de los atributos
    public String getUsuario(){
        return this.usuario;
    }
    public String getContraseña(){
        return this.contraseña;
    }
    public int getPuntaje(){
        return this.puntaje;
    }
    public boolean getLeTocaJugar(){
        return this.leTocaJugar;
    }
    //set de los atributos
    public String setUsuario(String usuario){
        return this.usuario = usuario;
    }
    public String setContraseña(String contraseña){
        return this.contraseña = contraseña;
    }
    public void setLeTocaJugar(boolean bool){
        this.leTocaJugar = bool;
    }
    public void setPuntaje(int puntaje){
        this.puntaje = puntaje;
    }
   public void setAcciones(int mov, int atac, int inv, int mag, int tramp){
       Accion accion = new Accion(mov, atac, 0, mag, tramp);
       this.accion = accion;
   }
    
    public Jugador ingresar (String usuario, String contraseña){
        //Condición para reconocer si el usuario y contraseña son correctos
        BD conexionBD = new BD();
        try {
            conexionBD.conectar();
            Statement stmt = conexionBD.crearConsulta();
            final String consulta = "SELECT USUARIO,PASSWORD,JEFE_TERRENO FROM USUARIOS WHERE USUARIO = '" + usuario + "' AND PASSWORD='" + contraseña + "' AND ES_HUMANO=TRUE";

            ResultSet resultados = stmt.executeQuery(consulta);

            if (resultados.next()) {
                String nombre = resultados.getString("USUARIO");
                String password = resultados.getString("PASSWORD");
                int jefeTerr = resultados.getInt("JEFE_TERRENO");
                Jugador jugador =  new Jugador(nombre, password, jefeTerr);
                return jugador;
            }
            else {
                return null;
            }
        }
        catch (SQLException ex) {
                System.err.println("Base de datos no conectada");
                return null;
        }
    }
    
    public boolean existeUsuario(String usuario) {
        //Verifica que el usuario esta registrado
        BD conexionBD = new BD();
        try {
            conexionBD.conectar();
            Statement stmt = conexionBD.crearConsulta();
            final String consulta = "SELECT USUARIO FROM USUARIOS WHERE USUARIO = '" + usuario + "' AND ES_HUMANO=TRUE";

            ResultSet resultados = stmt.executeQuery(consulta);

            if (resultados.next()) {
                    return true;
                }
            else {
                    return false;
                }
            }
        catch (SQLException ex) {
                System.err.println("Base de datos no conectada");
                return false;
        }
    }
}
