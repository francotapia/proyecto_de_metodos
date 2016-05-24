/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.Jugador;
import vistas.vistaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author franc
 */
public class ControladorLogin implements ActionListener{
    vistaLogin vista;
    Jugador ingresar;
    
    public ControladorLogin(vistaLogin v, Jugador i){
        this.vista = v;
        this.ingresar = i;
        this.vista.agregarListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(vista.getBoton1() == (JButton)e.getSource()){
            
            String usuario = vista.getUsuario();
            String pass = vista.getContraseña();
            
            if(usuario.equals("Antonio") && pass.equals("Andres")){
            
            }
        
        }
        
        if(vista.getBoton2() == (JButton)e.getSource()){
            
            
        }
            
                  
    }
    
}
