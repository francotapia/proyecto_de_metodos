/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import modelos.Jugador;
import vistas.vistaLogin;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author franc
 */
public class ControladorLogin implements ActionListener{
    
    vistaLogin vl;
    Jugador jug;
    ControladorPrincipal cp;
     //Se escucha a la vistaLogin
    public vistaLogin getvistaLogin(){
        return this.vl;
    }
    public ControladorLogin(){ //constructor login para inicializar vistas
        this.jug = new Jugador("antonio", "andres", 1);
        this.vl = new vistaLogin();
        this.verVista(cp);
    }    

    public void verVista(ControladorPrincipal cp){
        this.cp = cp;
        this.vl.setVisible(true);
        this.vl.agregarListener(this);  
    }
    
    private void verificar(String usuario,String contraseña ){
        if(jug.existeUsuario(usuario)){
            
            if(jug.ingresar(usuario, contraseña) != null){
                vl.bienvenida(usuario);
                this.vl.setVisible(false);
                ControladorMenu cm = new ControladorMenu();  
            }
            else{
                vl.errorContraseña(usuario);
                this.vl.setVisible(true);
            }
        }else{
            vl.errorUsuario(usuario);
            this.vl.setVisible(true);
        }
    }
   
    @Override
    public void actionPerformed(ActionEvent e){
        if(vl.getBoton1() == (JButton)e.getSource()){
             String usuario = vl.getUsuario();
             String contraseña = vl.getContraseña();
             verificar(usuario,contraseña);    
        } 
        if(vl.getBoton2() == (JButton)e.getSource()){
            this.vl.setVisible(false);
            ControladorRegistro cr = new ControladorRegistro();
            cr.verVista(this);
        }
    }
}

