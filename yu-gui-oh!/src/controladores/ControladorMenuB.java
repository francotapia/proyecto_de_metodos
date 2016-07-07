/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaMenuBatalla;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modelos.Jugador;

/**
 *
 * @author franc
 */
public class ControladorMenuB implements ActionListener{
    
    private vistaMenuBatalla vmb;
    private String usuario;
    private Jugador jugador;
    
    public vistaMenuBatalla getvistaMenu(){
        return this.vmb;
    }
    public ControladorMenuB(Jugador jugador){
        this.jugador = jugador;
        this.vmb = new vistaMenuBatalla();
        this.verVista();
    }
    public void verVista (){
        this.vmb = new vistaMenuBatalla();
        this.vmb.setVisible(true);
        this.vmb.agregarListener(this);
    }  

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vmb.getBoton() == (JButton)e.getSource()){
            if(vmb.getACantJug() == 1){
                this.vmb.setVisible(false);
                ControladorLoginBatalla cb = new ControladorLoginBatalla(2, jugador);
            }
            else if(vmb.getACantJug() == 2){
                this.vmb.setVisible(false);
                ControladorLoginBatalla cb = new ControladorLoginBatalla(3, jugador);
            } 
            else if(vmb.getACantJug() == 3){
                this.vmb.setVisible(false);
                ControladorLoginBatalla cb = new ControladorLoginBatalla(4, jugador);
            }
        }
    }        
}
