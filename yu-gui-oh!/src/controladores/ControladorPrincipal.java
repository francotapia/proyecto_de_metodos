/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.Jugador;
import vistas.vistaLogin;
import vistas.vistaRegistro;
import vistas.vistaMenu;
import vistas.vistaPerfil;
import vistas.vistaBatalla;
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
    vistaMenu vm;
    vistaPerfil vp;
    vistaBatalla vb;
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
        cp.vm = new vistaMenu();
        cp.vm.setVisible(false);
        cp.vm.agregarListener(cp);
        cp.vp = new vistaPerfil();
        cp.vp.setVisible(false);
        cp.vp.agregarListener(cp);
        cp.vb = new vistaBatalla();
        cp.vb.setVisible(false);
        cp.vb.agregarListener(cp);
        
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
          if(vr.getBoton() == (JButton)e.getSource()){
              this.vr.setVisible(false);
              this.vm.setVisible(true);
          }
          if(vm.getBoton2() == (JButton)e.getSource()){
              this.vm.setVisible(false);
              this.vb.setVisible(true);
          }
          if(vm.getBoton1() == (JButton)e.getSource()){
              this.vm.setVisible(false);
              this.vp.setVisible(true);
          }
          if(vp.getBoton2() == (JButton)e.getSource()){
              this.vp.setVisible(false);
              this.vm.setVisible(true);
          }
    }
    private void verificar(String usuario,String contraseña ){
        if(jug.existe(usuario)){
            
            if(jug.ingresar(usuario, contraseña)){
                vl.bienvenida(usuario);
                this.vl.setVisible(false);
                this.vm.setVisible(true);
                
            }else{
                vl.errorContraseña(usuario);
            }
        
        }else{
            vl.errorUsuario(usuario);
        }
    }
}
