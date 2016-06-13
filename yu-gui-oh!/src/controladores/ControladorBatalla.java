package controladores;




import java.awt.Color;
import java.awt.event.ActionEvent;
import vistas.vistaBatalla;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import modelos.Tablero;

/**
 *
 * @author franc
 */
public class ControladorBatalla extends JButton implements ActionListener{
    
    private vistaBatalla vb;
    private ControladorPrincipal cp;
    private Tablero tab;
    
    //public int[] Listener (vistaBatalla vb){
      
    //} GridView
    
  
    public ControladorBatalla(int posx,int posy,int ancho,int alto){
        setBounds(posx,posy,ancho,alto);
        addActionListener(this);
        
    }
    
    
    public void coordenadas(int x, int y){ ///entrega coordenadas de entero
         setText((x+1)+ ","+(y+1));
         System.out.println(x+1);
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
     setBackground(Color.GREEN);
     System.out.println("Soy un botón y soy verde");
          

     
    }
}
