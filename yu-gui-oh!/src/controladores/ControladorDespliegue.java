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
import javax.swing.JButton;


/**
 *
 * @author sebastian
 */
public class ControladorDespliegue implements ActionListener {
    
    private vistaDespliegue vd;
    private Tablero terr;
    
    public ControladorDespliegue(){
        this.vd = new vistaDespliegue();
        this.verVista();
    }
    public vistaDespliegue getVistaDespliegue(){
        return this.vd;
    }
    
    public void verVista (){
        this.vd = new vistaDespliegue();
        this.vd.setVisible(true);
        this.vd.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vd.getjButton1() == (JButton)e.getSource()){
              ControladorRotaciones cr = new ControladorRotaciones();
              this.vd.dispose();
          }
          if(vd.getjButton2() == (JButton)e.getSource()){
              ControladorRotaciones cr = new ControladorRotaciones();
              this.vd.dispose();
          }
          if(vd.getjButton3() == (JButton)e.getSource()){
              ControladorRotaciones cr = new ControladorRotaciones();
              this.vd.dispose();
          }
          if(vd.getjButton4() == (JButton)e.getSource()){
              ControladorRotaciones cr = new ControladorRotaciones();
              this.vd.dispose();
          }
          if(vd.getjButton5() == (JButton)e.getSource()){
              ControladorRotaciones cr = new ControladorRotaciones();
              this.vd.dispose();
          }
          if(vd.getjButton6() == (JButton)e.getSource()){
              ControladorRotaciones cr = new ControladorRotaciones();
              this.vd.dispose();
          }
          if(vd.getjButton7() == (JButton)e.getSource()){
              ControladorRotaciones cr = new ControladorRotaciones();
              this.vd.dispose();
          }
          if(vd.getjButton8() == (JButton)e.getSource()){
              ControladorRotaciones cr = new ControladorRotaciones();
              this.vd.dispose();
          }
          if(vd.getjButton9() == (JButton)e.getSource()){
              ControladorRotaciones cr = new ControladorRotaciones();
              this.vd.dispose();
          }
          if(vd.getjButton10() == (JButton)e.getSource()){
              ControladorRotaciones cr = new ControladorRotaciones();
              this.vd.dispose();
          }
    }    
}

    
   
    
    
            
