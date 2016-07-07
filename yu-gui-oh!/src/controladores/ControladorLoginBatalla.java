/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modelos.Turno;
import modelos.Jugador;
import vistas.vistaLoginBatalla;

/**
 *
 * @author franc
 */
public class ControladorLoginBatalla implements ActionListener{
    
    vistaLoginBatalla vlb;
    Jugador jug;
    Turno turn;
     //Se escucha a la vistaLogin
    public vistaLoginBatalla getvistaLogin(){
        return this.vlb;
    }
    public ControladorLoginBatalla(){ //constructor login para inicializar vistas
        this.jug = new Jugador("antonio", "andres", 1);
        this.turn = new Turno();
        this.vlb = new vistaLoginBatalla();
        this.verVista();
    }    

    public void verVista(){
        this.vlb.setVisible(true);
        this.vlb.agregarListener(this);  
    }
    
    private void verificar(String usuario,String contraseña ){
        if(jug.existeUsuario(usuario)){
            
            if(jug.ingresar(usuario, contraseña) != null){
                vlb.bienvenida(usuario);
                this.vlb.setVisible(false);
            }
            else{
                vlb.errorContraseña(usuario);
                this.vlb.setVisible(true);
            }
        }else{
            vlb.errorUsuario(usuario);
            this.vlb.setVisible(true);
        }
        
    }
   
    @Override
    public void actionPerformed(ActionEvent e){
        if(vlb.getBoton1() == (JButton)e.getSource()){
             String usuario = vlb.getUsuario();
             String contraseña = vlb.getContraseña();
             verificar(usuario,contraseña); 
             
        } 
    }
}

    

