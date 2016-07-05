/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import modelos.Registro;
import vistas.vistaRegistro;
import java.awt.event.ActionListener;

/**
 *
 * @author franc
 */
public class ControladorRegistro implements ActionListener {
    
    private Registro mR;
    private vistaRegistro vr;
    
    public ControladorRegistro(){
        this.vr = new vistaRegistro();
        this.verVista();
    }
    
    public void verVista (){
        this.mR = new Registro();
        this.vr = new vistaRegistro();
        this.vr.setVisible(true);
        this.vr.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vr.getBoton()) {
            mR.setUser(vr.getFieldUsuario());
            mR.setPassword(vr.getFieldPass());
            mR.setPassword2(vr.getFieldPass2());
            mR.setJefeTerreno(vr.getSeleccionJefeTerreno());
            if (mR.registroCorrecto()) {
                System.out.println("Usuario registrado correctamente");
                this.vr.dispose();
                ControladorLogin cl = new ControladorLogin();
            }
            else {
                System.out.println("Fallo el registro");
            }
        }
        else if (e.getSource() == vr.getBotonAtras()) {
            this.vr.dispose();
            ControladorLogin cl = new ControladorLogin();
        }
    }
    
}
