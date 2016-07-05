/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaDespliegue;
import modelos.Tablero;
import controladores.ControladorPrincipal;
import java.awt.event.ActionListener;
import vistas.vistaBatalla;
import vistas.vistaRotaciones;
import modelos.Dado;

/**
 *
 * @author sebastian
 */
public class ControladorRotaciones implements ActionListener {
    private vistaRotaciones vr;
    private Tablero terr;
    private ControladorBatalla cb;
    
    public ControladorRotaciones(){
        this.vr = new vistaRotaciones();
        this.verVista();
    }
    public vistaRotaciones getVistaRotaciones(){
        return this.vr;
    }

    public void verVista (){
        this.vr = new vistaRotaciones();
        this.vr.setVisible(true);
        this.vr.agregarListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
