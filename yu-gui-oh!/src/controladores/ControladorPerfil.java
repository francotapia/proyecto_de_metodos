/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaPerfil;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author franc
 */
public class ControladorPerfil implements ActionListener{
    
    private vistaPerfil vp;
    private ControladorMenu cm;
    
    public ControladorPerfil(){
        this.vp = new vistaPerfil();
        this.verVista(cm);
    }
    public vistaPerfil getvistaPerfil(){
        return this.vp;
    }
     public void verVista (ControladorMenu cm){
        this.cm = cm;
        this.vp = new vistaPerfil();
        this.vp.setVisible(true);
        this.vp.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vp.getBoton2() == (JButton)e.getSource()){
          this.vp.setVisible(false);
          ControladorMenu cm = new ControladorMenu();
          }
    }    
}
