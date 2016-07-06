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
    private vistaBatalla vb;
    
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
        for(int y = 0; y<15; y++){
            for(int x=0; x<15; x++){
                if(vb.getMatriz()[x][y]==e.getSource()){
                    System.out.println("x="+x+",y="+y);
                    vb.colorear(x, y, Dado.getForma1());
                }
            }
        }   
    }
}
