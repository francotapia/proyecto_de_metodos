/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaMenu;
import java.awt.event.ActionListener;

/**
 *
 * @author franc
 */
public class ControladorMenu implements ActionListener{
    
    private vistaMenu vm;
    private ControladorPrincipal cp;
    
    public vistaMenu getvistaMenu(){
        return this.vm;
    }
     public void verVista (ControladorPrincipal cp){
        this.cp = cp;
        this.vm = new vistaMenu();
        this.vm.setVisible(true);
        this.vm.agregarListener(this);
     }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
