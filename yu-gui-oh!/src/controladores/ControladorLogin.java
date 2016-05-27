/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import modelos.Jugador;
import vistas.vistaLogin;
import java.awt.event.ActionListener;

/**
 *
 * @author franc
 */
public class ControladorLogin implements ActionListener{
    
    private vistaLogin vl;
    private Jugador ingresar;
    private ControladorPrincipal cp;
     //Se escucha a la vistaLogin
    public vistaLogin getvistaLogin(){
        return this.vl;
    }
    public ControladorLogin(){
        this.ingresar = new Jugador();
    }
    
    public void verVista(ControladorPrincipal cp){
        this.cp = cp;
        this.vl = new vistaLogin();
        this.vl.setVisible(true);
        this.vl.agregarListener(this);
        
    }



    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
