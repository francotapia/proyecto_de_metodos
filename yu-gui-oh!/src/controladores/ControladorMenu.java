/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaMenu;
import modelos.Jugador;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author franc
 */
public class ControladorMenu implements ActionListener{
    
    private vistaMenu vm;
    private Jugador jug;
    ControladorLogin cl;
    
    public vistaMenu getvistaMenu(){
        return this.vm;
    }
    public ControladorMenu(String usuario){
        this.vm = new vistaMenu();
        this.vm.setUsuario(usuario);
        this.verVista();
    }
     public void verVista (){
        this.vm.setVisible(true);
        this.vm.agregarListener(this);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vm.getBoton2() == (JButton)e.getSource()){
           this.vm.setVisible(false);
           ControladorMenuB cmb = new ControladorMenuB(); 
        }
        if(vm.getBoton1() == (JButton)e.getSource()){
           this.vm.setVisible(false);
           ControladorPerfil cp = new ControladorPerfil();
          }
    } 
}
