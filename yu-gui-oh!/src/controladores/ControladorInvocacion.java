/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import vistas.vistaBatalla;
import vistas.vistaInvocacion;


/**
 *
 * @author Morris
 */
public class ControladorInvocacion implements ActionListener{
    
    private vistaBatalla vb;
    private vistaInvocacion vi;
    private ControladorBatalla cb;
    
    public ControladorInvocacion(){
        this.vi = new vistaInvocacion();
        this.verVistaInvocacion(cb);
    }
    public vistaInvocacion getvistaInvocacion(){
        return this.vi;
    }
     public void verVistaInvocacion (ControladorBatalla cb){
        this.cb = cb;
        this.vi = new vistaInvocacion();
        this.vi.setVisible(true);
        this.vi.agregarListener(this);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(vi.getBotonAceptar() == (JButton)e.getSource()){ //mostrar vista despliegue desde v.invocacion
            vi.setVisible(false);
            ControladorDespliegue cd = new ControladorDespliegue();
        }
    }   
}
