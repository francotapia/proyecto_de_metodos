package controladores;




import java.awt.event.ActionEvent;
import vistas.vistaBatalla;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import modelos.Tablero;
import modelos.Accion;
import modelos.Dado;

/**
 *
 * @author franc
 */
public class ControladorBatalla implements ActionListener{
    
    private vistaBatalla vb;
    private ControladorMenuB cmb;
    private Tablero tab;
    Accion ac;
    
    //public int[] Listener (vistaBatalla vb){
      
    //} GridView
    
  

    public ControladorBatalla() {
        this.vb = new vistaBatalla();
        this.ac = new Accion();
        this.verVista(cmb);
        vb.desactivar();
    }
    
    public vistaBatalla getvistaBatalla(){
        return this.vb;
    }
    public void verVista (ControladorMenuB cmb){
        this.cmb = cmb;
        this.vb = new vistaBatalla();
        this.vb.setVisible(true);
        this.vb.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Cambio de imagen del dado con su resultado.
          //Dado1:
          if(vb.getBoton1() == (JButton)e.getSource()){
              Dado Dado1 = new Dado(); //instanciación de objeto dado con constructor vacío
              int num1 = Dado1.lanzarDado(); //se llama a metodo del dado que da int al azar (de 1 a 6)
              String nom1 = Dado1.cara(num1); //se llama a metodo que da nombre a la cara
              vb.setResultadoD1(nom1); //se inserta en textfield el resultado
              int cambio = ac.guardar(num1); //se guarda acción en contadro de acciones
              
              if(num1 == 1){
                  vb.setCantAtk(cambio);
                  if(ac.getAtaque() != 0){//verifica que el contador es distinto a cero.
                      vb.activarAtk();//activa el boton de accion.
                  }
              }
              if(num1 == 2){
                  vb.setCantInv(cambio);
                  if(ac.getInvocacion() != 0){
                      vb.activarInv();
                  }
              }
              if(num1 == 3){
                  vb.setCantMag(cambio);
                  if(ac.getMagia() != 0){
                      vb.activarMag();
                  }
              }
              if(num1 == 4){
                  vb.setCantMov(cambio);
                  if(ac.getMovimiento() != 0){
                      vb.activarMov();
                  }
              }
              if(num1 == 5){
                  vb.setCantTram(cambio);
                  if(ac.getTrampa() != 0){
                      vb.activarTram();
                  }
              }

          }
          //Dado2:
          if(vb.getBoton2() == (JButton)e.getSource()){
              Dado Dado2 = new Dado();
              int num2 = Dado2.lanzarDado();
              String nom2 = Dado2.cara(num2);
              ImageIcon objImag2 = Dado2.ImagenesResultados(num2);
              vb.setImagen(objImag2);
              vb.setResultadoD2(nom2);
              int cambio = ac.guardar(num2);
              
              if(num2 == 1){
                  vb.setCantAtk(cambio);
                  if(ac.getAtaque() != 0){//verifica que el contador es distinto a cero.
                      vb.activarAtk();//activa el boton de accion.
                  }
              }
              if(num2 == 2){
                  vb.setCantInv(cambio);
                  if(ac.getInvocacion() != 0){
                      vb.activarInv();
                  }
              }
              if(num2 == 3){
                  vb.setCantMag(cambio);
                  if(ac.getMagia() != 0){
                      vb.activarMag();
                  }
              }
              if(num2 == 4){
                  vb.setCantMov(cambio);
                  if(ac.getMovimiento() != 0){
                      vb.activarMov();
                  }
              }
              if(num2 == 5){
                  vb.setCantTram(cambio);
                  if(ac.getTrampa() != 0){
                      vb.activarTram();
                  }
              }

          }
          //Dado3:
          if(vb.getBoton3() == (JButton)e.getSource()){
              Dado Dado3 = new Dado();
              int num3 = Dado3.lanzarDado();
              String nom3 = Dado3.cara(num3);
              ImageIcon objImag3 = Dado3.ImagenesResultados(num3);
              vb.setImagen(objImag3);
              vb.setResultadoD3(nom3);
              int cambio = ac.guardar(num3);
              
              if(num3 == 1){
                  vb.setCantAtk(cambio);
                  if(ac.getAtaque() != 0){//verifica que el contador es distinto a cero.
                      vb.activarAtk();//activa el boton de accion.
                  }
              }
              if(num3 == 2){
                  vb.setCantInv(cambio);
                  if(ac.getInvocacion() != 0){
                      vb.activarInv();
                  }
              }
              if(num3 == 3){
                  vb.setCantMag(cambio);
                  if(ac.getMagia() != 0){
                      vb.activarMag();
                  }
              }
              if(num3 == 4){
                  vb.setCantMov(cambio);
                  if(ac.getMovimiento() != 0){
                      vb.activarMov();
                  }
              }
              if(num3 == 5){
                  vb.setCantTram(cambio);
                  if(ac.getTrampa() != 0){
                      vb.activarTram();
                  }
              }

          }
          //Dado4:
          if(vb.getBoton4() == (JButton)e.getSource()){
              Dado Dado4 = new Dado();
              int num4 = Dado4.lanzarDado();
              String nom4 = Dado4.cara(num4);
              ImageIcon objImag4 = Dado4.ImagenesResultados(num4);
              vb.setImagen(objImag4);
              vb.setResultadoD4(nom4);
              int cambio = ac.guardar(num4);
              
              if(num4 == 1){
                  vb.setCantAtk(cambio);
                  if(ac.getAtaque() != 0){//verifica que el contador es distinto a cero.
                      vb.activarAtk();//activa el boton de accion.
                  }
              }
              if(num4 == 2){
                  vb.setCantInv(cambio);
                  if(ac.getInvocacion() != 0){
                      vb.activarInv();
                  }
              }
              if(num4 == 3){
                  vb.setCantMag(cambio);
                  if(ac.getMagia() != 0){
                      vb.activarMag();
                  }
              }
              if(num4 == 4){
                  vb.setCantMov(cambio);
                  if(ac.getMovimiento() != 0){
                      vb.activarMov();
                  }
              }
              if(num4 == 5){
                  vb.setCantTram(cambio);
                  if(ac.getTrampa() != 0){
                      vb.activarTram();
                  }
              }   
        }
        //se restan los contadores cuando los usan.
        if(vb.getBotonAtk() == (JButton)e.getSource()){
            int cant = ac.usar(ac.getAtaque());
            vb.setCantAtk(cant);
        }
        if(vb.getBotonMov() == (JButton)e.getSource()){
            int cant = ac.usar(ac.getMovimiento());
            vb.setCantMov(cant);
        }
        if(vb.getBotonInv() == (JButton)e.getSource()){
            int cant = ac.usar(ac.getInvocacion());
            vb.setCantInv(cant);
        }
        if(vb.getBotonTam() == (JButton)e.getSource()){
            int cant = ac.usar(ac.getTrampa());
            vb.setCantTram(cant);
        }
        if(vb.getBotonMag() == (JButton)e.getSource()){
            int cant = ac.usar(ac.getMagia());
            vb.setCantMag(cant);
        }
        if(vb.getBotonInv() == (JButton)e.getSource()){ //mostrar vista invocacion
            ControladorInvocacion ci = new ControladorInvocacion();
          }
          
    }
     
}
