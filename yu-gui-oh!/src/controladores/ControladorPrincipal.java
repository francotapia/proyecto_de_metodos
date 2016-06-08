/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.Jugador;
import modelos.Dado;
import modelos.Accion;
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
    Accion ac;

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
        this.ac = new Accion();
        
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
          //Dado1:
          if(vb.getBoton1() == (JButton)e.getSource()){
              Dado Dado1 = new Dado(); //instanciación de objeto dado con constructor vacío
              int num1 = Dado1.lanzarDado(); //se llama a metodo del dado que da int al azar (de 1 a 6)
              String nom1 = Dado1.cara(num1); //se llama a metodo que da nombre a la cara
              ImageIcon objImag1 = Dado1.ImagenesResultados(num1); //se obtiene la imagen de la cara y se guarda en variable
              vb.setImagen(objImag1); //se cambia imagen de label con la variable anterior
              vb.setResultadoD1(nom1); //se inserta en textfield el resultado
              ac.guardar(num1); //se guarda acción en contadro de acciones
          }
          //Dado2:
          if(vb.getBoton2() == (JButton)e.getSource()){
              Dado Dado2 = new Dado();
              int num2 = Dado2.lanzarDado();
              String nom2 = Dado2.cara(num2);
              ImageIcon objImag2 = Dado2.ImagenesResultados(num2);
              vb.setImagen(objImag2);
              vb.setResultadoD2(nom2);
              ac.guardar(num2);
          }
          //Dado3:
          if(vb.getBoton3() == (JButton)e.getSource()){
              Dado Dado3 = new Dado();
              int num3 = Dado3.lanzarDado();
              String nom3 = Dado3.cara(num3);
              ImageIcon objImag3 = Dado3.ImagenesResultados(num3);
              vb.setImagen(objImag3);
              vb.setResultadoD3(nom3);
              ac.guardar(num3);
          }
          //Dado4:
          if(vb.getBoton4() == (JButton)e.getSource()){
              Dado Dado4 = new Dado();
              int num4 = Dado4.lanzarDado();
              String nom4 = Dado4.cara(num4);
              ImageIcon objImag4 = Dado4.ImagenesResultados(num4);
              vb.setImagen(objImag4);
              vb.setResultadoD4(nom4);
              ac.guardar(num4);
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
