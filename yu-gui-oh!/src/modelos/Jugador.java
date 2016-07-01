
package modelos;

/**
 *
 * @author franc
 */
public class Jugador {
   
    //Atributos de la clase Jugador
    private String usuario;
    private String contraseña;
    private int puntaje;
    private PuzzleDeDados puzzle;
    
    
    //Constructores de la clase
    public Jugador(String jug, String cont){
        this.usuario = jug;
        this.contraseña = cont; 
    }
    public Jugador(){
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
    //set de los atributos
    public String setUsuario(String usuario){
        return this.usuario = usuario;
    }
    public String setContraseña(String contraseña){
        return this.contraseña = contraseña;
    }
    public int setPuntaje(int puntaje){
        return this.puntaje = puntaje;
    }
   
    
    public boolean ingresar (String usuario, String contraseña){
    //Condición para reconocer si el usuario y contraseña son correctos
    if(usuario.equals("antonio") && contraseña.equals("andres")){
        return true;
            
    }else{
        return false;
    }
    }
    
    public boolean existe(String usuario){
    //Verifica que el usuario esta registrado    
        if(usuario.equals(this.usuario)){
            return true;
        }else{
            return false;
        }
    }
    
}
