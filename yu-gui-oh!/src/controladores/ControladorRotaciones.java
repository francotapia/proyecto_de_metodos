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

/**
 *
 * @author sebastian
 */
public class ControladorRotaciones implements ActionListener {
    private vistaRotaciones vr;
    private Tablero terr;
    private ControladorPrincipal cp;
    private ControladorBatalla cb;
    
    public vistaRotaciones getVistaRotaciones(){
        return this.vr;
    }

    public void verVista (ControladorPrincipal cp){
        this.cp = cp;
        this.vr = new vistaRotaciones();
        this.vr.setVisible(true);
        this.vr.agregarListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
