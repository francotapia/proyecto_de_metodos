package controladores;

import java.awt.event.ActionEvent;
import vistas.vistaBatalla;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import modelos.Tablero;
import modelos.Accion;
import modelos.Dado;
import modelos.Jugador;
import modelos.Turno;
import modelos.Espacio;

/**
 *
 * @author franc
 */
public class ControladorBatalla implements ActionListener{
    
    private vistaBatalla vb;
    private Tablero tab;
    private Espacio espacio;
    Accion ac;
    Turno turno;
    Jugador jugadorActual;
    Jugador jugador1;
    Jugador jugador2;
    Jugador jugador3;
    Jugador jugador4;
    
    public ControladorBatalla(int n, Jugador jugador1Log1, String usuario2, String contraseña2) {
        this.vb = new vistaBatalla();
        this.jugador1 = jugador1Log1;
        this.jugador2 = new Jugador(usuario2, contraseña2, 1);
        System.out.println(jugador1.getUsuario());
        System.out.println(jugador2.getUsuario());
        this.ac = new Accion(0, 0, 0 , 0, 0);
        this.verVista();
        vb.desactivar();
        
        if(n == 2){
            Turno turno = new Turno();
            vb.setJefeDTerreno1("1");
            vb.setJefeDTerreno2("2");
            turno.setArray2(jugador1, jugador2);//agrega jugadores a arreglo del turno
            Espacio espacioJT1 = new Espacio(7,0); //crea nuevo espacio con coordenadas del JT1
            espacioJT1.setDueno(jugador1.getUsuario()); //da dueño al jefe de terreno
            Espacio espacioJT2 = new Espacio(7,14);
            espacioJT2.setDueno(jugador2.getUsuario());
            System.out.println("El dueño del jefe1 es " + espacioJT1.getDueno() + " y El dueño del jefe2 es " + espacioJT2.getDueno());
            Jugador jugadorActual = jugador1;
            vb.setTurnoJugadorLabel(jugadorActual.getUsuario());
        }
        else if(n == 3){
            vb.setJefeDTerreno1("1");
            vb.setJefeDTerreno2("2");
            vb.setJefeDTerreno3("3");
            Jugador jugador1 = new Jugador();
            Jugador jugador2 = new Jugador();
            Jugador jugador3 = new Jugador();
            Turno turno = new Turno();
            turno.setArray3(jugador1, jugador2, jugador3);//agrega jugadores a arreglo del turno
            Espacio espacioJT1 = new Espacio(7,0); //crea nuevo espacio con coordenadas del JT1
            espacioJT1.setDueno(jugador1.getUsuario()); //da dueño al jefe de terreno
            Espacio espacioJT2 = new Espacio(7,14);
            espacioJT2.setDueno(jugador2.getUsuario());
            Espacio espacioJT3 = new Espacio(14,7);
            espacioJT3.setDueno(jugador3.getUsuario());
        }
        else {
            vb.setJefeDTerreno1("1");
            vb.setJefeDTerreno2("2");
            vb.setJefeDTerreno3("3");
            vb.setJefeDTerreno4("4");
            Jugador jugador1 = new Jugador();
            Jugador jugador2 = new Jugador();
            Jugador jugador3 = new Jugador();
            Jugador jugador4 = new Jugador();
            Turno turno = new Turno();
            turno.setArray4(jugador1, jugador2, jugador3, jugador4);//agrega jugadores a arreglo del turno
            Espacio espacioJT1 = new Espacio(7,0); //crea nuevo espacio con coordenadas del JT1
            espacioJT1.setDueno(jugador1.getUsuario()); //da dueño al jefe de terreno
            Espacio espacioJT2 = new Espacio(7,14);
            espacioJT2.setDueno(jugador2.getUsuario());
            Espacio espacioJT3 = new Espacio(14,7);
            espacioJT3.setDueno(jugador3.getUsuario());
            Espacio espacioJT4 = new Espacio(0,7);
            espacioJT4.setDueno(jugador4.getUsuario());
        }
    }
    
    public vistaBatalla getvistaBatalla(){
        return this.vb;
    }
    public void verVista (){
        this.vb = new vistaBatalla();
        this.vb.setVisible(true);
        this.vb.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //accede y printea la coordenada
        if(vb.getBotonTurn() == (JButton)e.getSource()){
     
        for(int y = 0; y<15; y++){
            for(int x=0; x<15; x++){
                if(vb.getMatriz()[x][y]==e.getSource()){
                    System.out.println("x="+x+",y="+y);
                    vb.colorear(x, y, Dado.getForma1());
                }
            }
        }   
        }
        
        //Cambio de imagen del dado con su resultado.
          //Dado1:
          if(vb.getBoton1() == (JButton)e.getSource()){
              Dado Dado1 = new Dado(); //instanciación de objeto dado con constructor vacío
              Dado1 = Dado1.sacarDeBD(Dado1.sacarDadoRandom());//sacar dado random de base de datos
              int num1 = Dado1.lanzarDado(); //se llama a metodo del dado que da int al azar (de 1 a 6)
              System.out.println(Dado1.getCara6());
              String nom1 = Dado1.cara(num1); //se llama a metodo que da nombre a la cara
              vb.setResultadoD1(nom1); //se inserta en textfield el resultado
              int cambio = ac.guardar(num1); //se guarda acción en contadro de acciones
              
              if(nom1 == "Ataque"){
                  vb.setCantAtk(cambio);
                  if(ac.getAtaque() != 0){//verifica que el contador es distinto a cero.
                      vb.activarAtk();//activa el boton de accion.
                  }
              }
              if(nom1 == "Invocacion"){
                  vb.setCantInv(cambio);
                  if(ac.getInvocacion() != 0){
                      vb.activarInv();
                  }
              }
              if(nom1 == "Magia"){
                  vb.setCantMag(cambio);
                  if(ac.getMagia() != 0){
                      vb.activarMag();
                  }
              }
              if(nom1 == "Movimiento"){
                  vb.setCantMov(cambio);
                  if(ac.getMovimiento() != 0){
                      vb.activarMov();
                  }
              }
              if(nom1 == "Trampa"){
                  vb.setCantTram(cambio);
                  if(ac.getTrampa() != 0){
                      vb.activarTram();
                  }
              }
          }
          //Dado2:
          if(vb.getBoton2() == (JButton)e.getSource()){
              Dado Dado2 = new Dado();
              Dado2 = Dado2.sacarDeBD(Dado2.sacarDadoRandom());
              int num2 = Dado2.lanzarDado();
              System.out.println(Dado2.getCara6());
              String nom2 = Dado2.cara(num2);
              ImageIcon objImag2 = Dado2.ImagenesResultados(num2);
              vb.setImagen(objImag2);
              vb.setResultadoD2(nom2);
              int cambio = ac.guardar(num2);
              
              if(nom2 == "Ataque"){
                  vb.setCantAtk(cambio);
                  if(ac.getAtaque() != 0){//verifica que el contador es distinto a cero.
                      vb.activarAtk();//activa el boton de accion.
                  }
              }
              if(nom2 == "Invocacion"){
                  vb.setCantInv(cambio);
                  if(ac.getInvocacion() != 0){
                      vb.activarInv();
                  }
              }
              if(nom2 == "Magia"){
                  vb.setCantMag(cambio);
                  if(ac.getMagia() != 0){
                      vb.activarMag();
                  }
              }
              if(nom2 == "Movimiento"){
                  vb.setCantMov(cambio);
                  if(ac.getMovimiento() != 0){
                      vb.activarMov();
                  }
              }
              if(nom2 == "Trampa"){
                  vb.setCantTram(cambio);
                  if(ac.getTrampa() != 0){
                      vb.activarTram();
                  }
              }
          }
          //Dado3:
          if(vb.getBoton3() == (JButton)e.getSource()){
              Dado Dado3 = new Dado();
              Dado3 = Dado3.sacarDeBD(Dado3.sacarDadoRandom());
              System.out.println(Dado3.getCara6());
              int num3 = Dado3.lanzarDado();
              String nom3 = Dado3.cara(num3);
              ImageIcon objImag3 = Dado3.ImagenesResultados(num3);
              vb.setImagen(objImag3);
              vb.setResultadoD3(nom3);
              int cambio = ac.guardar(num3);
              
              if(nom3 == "Ataque"){
                  vb.setCantAtk(cambio);
                  if(ac.getAtaque() != 0){//verifica que el contador es distinto a cero.
                      vb.activarAtk();//activa el boton de accion.
                  }
              }
              if(nom3 == "Invocacion"){
                  vb.setCantInv(cambio);
                  if(ac.getInvocacion() != 0){
                      vb.activarInv();
                  }
              }
              if(nom3 == "Magia"){
                  vb.setCantMag(cambio);
                  if(ac.getMagia() != 0){
                      vb.activarMag();
                  }
              }
              if(nom3 == "Movimiento"){
                  vb.setCantMov(cambio);
                  if(ac.getMovimiento() != 0){
                      vb.activarMov();
                  }
              }
              if(nom3 == "Trampa"){
                  vb.setCantTram(cambio);
                  if(ac.getTrampa() != 0){
                      vb.activarTram();
                  }
              }

          }
          //Dado4:
          if(vb.getBoton4() == (JButton)e.getSource()){
              Dado Dado4 = new Dado();
              Dado4 = Dado4.sacarDeBD(Dado4.sacarDadoRandom());
              System.out.println(Dado4.getCara6());
              int num4 = Dado4.lanzarDado();
              String nom4 = Dado4.cara(num4);
              ImageIcon objImag4 = Dado4.ImagenesResultados(num4);
              vb.setImagen(objImag4);
              vb.setResultadoD4(nom4);
              int cambio = ac.guardar(num4);
              
              if(nom4 == "Ataque"){
                  vb.setCantAtk(cambio);
                  if(ac.getAtaque() != 0){//verifica que el contador es distinto a cero.
                      vb.activarAtk();//activa el boton de accion.
                  }
              }
              if(nom4 == "Invocacion"){
                  vb.setCantInv(cambio);
                  if(ac.getInvocacion() != 0){
                      vb.activarInv();
                  }
              }
              if(nom4 == "Magia"){
                  vb.setCantMag(cambio);
                  if(ac.getMagia() != 0){
                      vb.activarMag();
                  }
              }
              if(nom4 == "Movimiento"){
                  vb.setCantMov(cambio);
                  if(ac.getMovimiento() != 0){
                      vb.activarMov();
                  }
              }
              if(nom4 == "Trampa"){
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
        if(vb.getBotonTurn() == (JButton)e.getSource()){
           if (vb.getBotonTurn() == e.getSource()){
               System.out.println(ac.getMovimiento() + ac.getAtaque() + 0 + ac.getMagia() + ac.getTrampa());
               //jugadorActual.setAcciones(ac.getMovimiento(), ac.getAtaque(), 0, ac.getMagia(), ac.getTrampa());
               turno.empezarTurno(2, turno.getJugadores());
               System.out.println(jugadorActual.getUsuario()); 
               vb.setTurnoJugadorLabel(jugadorActual.getUsuario());
               //hay problemas con el jugadorActual
           }
        } 
    }    
}