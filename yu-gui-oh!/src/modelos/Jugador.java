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
    
    //metodos de la clase Jugadpr
    public Jugador(){
        this.usuario = null;
        this.contraseña = null;
    }
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
        public boolean ingresar (String usuario, String contraseña){
        //Condición para reconocer si el usuario y contraseña son correctos
        if(usuario.equals("antonio") && contraseña.equals("andres")){
            return true;
            
        }else{
            return false;
        }


    }
    
    
    
}

    
    

