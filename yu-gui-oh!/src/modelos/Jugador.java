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
public class Jugador {
   
    //Atributos de la clase Jugador
    private String usuario;
    private String contraseña;
    
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
    public String getUsuario(){
        return this.usuario;
    }
    public String getContraseña(){
        return this.contraseña;
    }
    public String setUsuario(String usuario){
        return this.usuario = usuario;
    }
    public String setContraseña(String contraseña){
        return this.contraseña = contraseña;
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
