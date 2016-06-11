/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaMenuBatalla;
import java.awt.event.ActionListener;

/**
 *
 * @author franc
 */
public class ControladorMenuB implements ActionListener{
    
    private vistaMenuBatalla vmb;
    private ControladorPrincipal cp;
    
    public vistaMenuBatalla getvistaMenu(){
        return this.vmb;
    }
    public void verVista (ControladorPrincipal cp){
        this.cp = cp;
        this.vmb = new vistaMenuBatalla();
        this.vmb.setVisible(true);
        this.vmb.agregarListener(this);
    }  

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
