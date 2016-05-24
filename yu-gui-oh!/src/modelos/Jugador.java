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
    
    private String usuario;
    private String contraseña;
    
    //metodos
    
    public String getUsuario(){
        return usuario;
    }
    public String getContraseña(){
        return contraseña;
    }
    public String setUsuario(String usuario){
        return this.usuario = usuario;
    }
    public String setContraseña(String contraseña){
        return this.contraseña = contraseña;
    }
    
    
    
}
