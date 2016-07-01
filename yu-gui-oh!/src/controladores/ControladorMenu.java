/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaMenu;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author franc
 */
public class ControladorMenu implements ActionListener{
    
    private vistaMenu vm;
    private ControladorLogin cl;
    
    public vistaMenu getvistaMenu(){
        return this.vm;
    }
    public ControladorMenu(){
        this.vm = new vistaMenu();
        this.verVista(cl);
    }
     public void verVista (ControladorLogin cl){
        this.cl = cl;
        this.vm = new vistaMenu();
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
