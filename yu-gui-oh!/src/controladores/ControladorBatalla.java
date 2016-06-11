
package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaBatalla;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import modelos.Tablero;

/**
 *
 * @author franc
 */
public class ControladorBatalla implements ActionListener{
    
    private vistaBatalla vb;
    private ControladorPrincipal cp;
    private Tablero tab;
    
    //public int[] Listener (vistaBatalla vb){
      
    //} GridView
    
    
    
    
    public int[] mostrarCoordenadas(Tablero tab){ ///entrega coordenadas en arreglo int
        return this.tab.getMostrarPosicion(tab);  //
    }
    
    public vistaBatalla getvistaBatalla(){
        return this.vb;
    }
    public void verVista (ControladorPrincipal cp){
        this.cp = cp;
        this.vb = new vistaBatalla();
        this.vb.setVisible(true);
     
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Hago algo");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
