/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaDespliegue;
import modelos.Tablero;
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
    private vistaBatalla vb;
    public static boolean vvvv;
    public vistaDespliegue vd;
    
    public ControladorRotaciones(){
        vr = new vistaRotaciones();
        this.verVista();
    }
    public vistaRotaciones getVistaRotaciones(){
        return this.vr;
    }

    public void verVista (){
        vr.setVisible(true);
        vr.agregarListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(vr.getjButton1()==e.getSource()){
            vr.dispose();
        }
        if(vr.getjButton2()==e.getSource()){
            vr.dispose();
        }
        if(vr.getjButton3()==e.getSource()){
            this.vr.dispose();
        }
        if(vr.getjButton4()==e.getSource()){
            this.vr.dispose();
        }
        
    }
}
