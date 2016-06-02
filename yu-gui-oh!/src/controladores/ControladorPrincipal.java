/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.Jugador;
import vistas.vistaLogin;
import vistas.vistaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author franc
 */
public class ControladorPrincipal implements ActionListener{
    
    vistaLogin vl;
    vistaRegistro vr;
    ControladorLogin contLogin;
    Jugador jug;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorPrincipal cp = new ControladorPrincipal();
        cp.contLogin = new ControladorLogin();
        cp.jug = new Jugador("antonio", "andres");
        cp.vl = new vistaLogin();
        cp.vl.setVisible(true);
        cp.vl.agregarListener(cp);
        cp.vr = new vistaRegistro();
        cp.vr.setVisible(false);
        cp.vr.agregarListener(cp);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
         if(vl.getBoton1() == (JButton)e.getSource()){
             this.vl.setVisible(false);
             String usuario = vl.getUsuario();
             String contraseña = vl.getContraseña();
             verificar(usuario,contraseña);    
         } 
          if(vl.getBoton2() == (JButton)e.getSource()){
              this.vl.setVisible(false);
              this.vr.setVisible(true);
          }
    }
    private void verificar(String usuario,String contraseña ){
        if(jug.existe(usuario)){
            
            if(jug.ingresar(usuario, contraseña)){
                vl.bienvenida(usuario);
                
            }else{
                vl.errorContraseña(usuario);
            }
        
        }else{
            vl.errorUsuario(usuario);
        }
    }
}
