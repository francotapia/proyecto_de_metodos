/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaMenuBatalla;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author franc
 */
public class ControladorMenuB implements ActionListener{
    
    private vistaMenuBatalla vmb;
    private ControladorMenu cm;
    
    public vistaMenuBatalla getvistaMenu(){
        return this.vmb;
    }
    public ControladorMenuB(){
        this.vmb = new vistaMenuBatalla();
        this.verVista(cm);
    }
    public void verVista (ControladorMenu cm){
        this.cm = cm;
        this.vmb = new vistaMenuBatalla();
        this.vmb.setVisible(true);
        this.vmb.agregarListener(this);
    }  

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vmb.getBoton() == (JButton)e.getSource()){
            this.vmb.setVisible(false);
            ControladorBatalla cb = new ControladorBatalla();
          }
    }        
}
