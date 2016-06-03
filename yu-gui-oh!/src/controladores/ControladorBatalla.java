/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaBatalla;
import java.awt.event.ActionListener;

/**
 *
 * @author franc
 */
public class ControladorBatalla implements ActionListener{
    
    private vistaBatalla vb;
    private ControladorPrincipal cp;
    
    public vistaBatalla getvistaBatalla(){
        return this.vb;
    }
    public void verVista (ControladorPrincipal cp){
        this.cp = cp;
        this.vb = new vistaBatalla();
        this.vb.setVisible(true);
     
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
