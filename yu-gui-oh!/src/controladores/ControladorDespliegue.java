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


/**
 *
 * @author sebastian
 */
public class ControladorDespliegue implements ActionListener {
    
    private vistaDespliegue vd;
    private Tablero terr;
    private ControladorPrincipal cp;
    private ControladorBatalla cb;
    
    public vistaDespliegue getVistaDespliegue(){
        return this.vd;
    }
    
    public void verVista (ControladorPrincipal cp){
        this.cp = cp;
        this.vd = new vistaDespliegue();
        this.vd.setVisible(true);
        this.vd.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    
   
    
    
            
