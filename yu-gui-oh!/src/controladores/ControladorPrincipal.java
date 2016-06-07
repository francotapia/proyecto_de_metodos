/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.Jugador;
import modelos.Dado;
import vistas.vistaLogin;
import vistas.vistaRegistro;
import vistas.vistaMenu;
import vistas.vistaPerfil;
import vistas.vistaBatalla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

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
     */
    public ControladorPrincipal() {
        // TODO code application logic here
        
        this.contLogin = new ControladorLogin();
        this.jug = new Jugador("antonio", "andres");
        this.vl = new vistaLogin();
        this.vl.setVisible(true);
        this.vl.agregarListener(this);
        this.vr = new vistaRegistro();
        this.vr.setVisible(false);
        this.vr.agregarListener(this);
        this.vm = new vistaMenu();
        this.vm.setVisible(false);
        this.vm.agregarListener(this);
        this.vp = new vistaPerfil();
        this.vp.setVisible(false);
        this.vp.agregarListener(this);
        this.vb = new vistaBatalla();
        this.vb.setVisible(false);
        this.vb.agregarListener(this);
        
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
          //Cambio de imagen del dado con su resultado.
          if(vb.getBoton1() == (JButton)e.getSource()){
              Dado Dado1 = new Dado();
              int num1 = Dado1.lanzarDado();
              String nom1 = Dado1.cara(num1);
              ImageIcon objImag1 = Dado1.ImagenesResultados(num1);
              vb.setImagen(objImag1);
              vb.setResultado(nom1);
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
