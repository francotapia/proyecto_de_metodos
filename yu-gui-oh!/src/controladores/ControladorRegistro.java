/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import modelos.Jugador;
import vistas.vistaRegistro;
import java.awt.event.ActionListener;

/**
 *
 * @author franc
 */
public class ControladorRegistro implements ActionListener {
    
    private vistaRegistro vr;
    private ControladorLogin cl;
    
    public ControladorRegistro(){
        this.vr = new vistaRegistro();
        this.verVista(cl);
    }
    public vistaRegistro getvistaRegistro(){
        return this.vr;
    }
    public void verVista (ControladorLogin cl){
        this.cl = cl;
        this.vr = new vistaRegistro();
        this.vr.setVisible(true);
        this.vr.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
