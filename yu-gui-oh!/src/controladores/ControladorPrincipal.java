/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.Jugador;
import vistas.vistaLogin;
/**
 *
 * @author franc
 */
public class ControladorPrincipal {
     vistaLogin vl;
    Jugador jug;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorPrincipal cp=new ControladorPrincipal();
        cp.vl = new vistaLogin();
        cp.jug = new Jugador();
        cp.vl.setVisible(true);
    }
    
}
