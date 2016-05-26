/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.Jugador;
import vistas.vistaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class ControladorLogin implements ActionListener{
     vistaLogin vista;
    Jugador ingresar;
     //Se escucha a la vistaLogin
    public ControladorLogin(vistaLogin v, Jugador i){
        this.vista = v;
        this.ingresar = i;
        this.vista.agregarListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        //Se verifica si el botón "ingresar" ha sido seleccionado
        if(vista.getBoton1() == (JButton)e.getSource()){
            
            //Asignacion de variables
            String usuario = vista.getUsuario();
            String pass = vista.getContraseña();
            //Condición para reconocer si el usuario y contraseña son correctos
            if(usuario.equals("antonio") && pass.equals("andres")){
                //Se cierra la ventana de acceso
                this.dispose();
                
                JOptionPane.showMessageDialog(null, "Bienvenido "
               , "Mensaje de bienvenida",
                JOptionPane.INFORMATION_MESSAGE);
                
               
            
            }
        
        }
        //Se verifica si el botón registrar ha sido seleccionado
        if(vista.getBoton2() == (JButton)e.getSource()){
            
            
        }
            
                  
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
