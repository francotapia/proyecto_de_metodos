/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import vistas.vistaBatalla;
import vistas.vistaInvocacion;
import modelos.Accion;


/**
 *
 * @author Morris
 */
public class ControladorInvocacion implements ActionListener{
    
    private vistaBatalla vb;
    private vistaInvocacion vi;
    private ControladorPrincipal cp;
    
    public vistaInvocacion getvistaInvocacion(){
        return this.vi;
    }
     public void verVistaInvocacion (ControladorPrincipal cp){
        this.cp = cp;
        this.vi = new vistaInvocacion();
        this.vi.setVisible(true);
        this.vi.setListenerInvocacion(this);
    }
    
     
     
     
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
