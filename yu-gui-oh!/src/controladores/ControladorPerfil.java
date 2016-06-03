/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaPerfil;
import java.awt.event.ActionListener;

/**
 *
 * @author franc
 */
public class ControladorPerfil implements ActionListener{
    
    private vistaPerfil vp;
    private ControladorPrincipal cp;
    
    public vistaPerfil getvistaPerfil(){
        return this.vp;
    }
     public void verVista (ControladorPrincipal cp){
        this.cp = cp;
        this.vp = new vistaPerfil();
        this.vp.setVisible(true);
        this.vp.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
