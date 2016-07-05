/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
/**
 *
 * @author Morris
 */
public class Turno {
    static int numeroTurno;
    String dueno;
    Accion Accion;
    private ArrayList<Jugador> jugadores;
    Jugador jugador1;
    Jugador jugador2;
    Jugador jugador3;
    Jugador jugador4;
    
    public static int sumaTurno(){
        numeroTurno = numeroTurno + 1;
        return numeroTurno;
    }
    
    public ArrayList<Jugador> setJugadores(ArrayList<Jugador> jugadores){
        this.jugadores=jugadores;
        return jugadores;
    }    
    
    public void setArray2(Jugador jugadro1, Jugador jugador2){
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>(2);
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        System.out.println("jugador1="+jugador1.getUsuario());
        System.out.println("jugador2="+jugador2.getUsuario());
    }
    public void setArray3(Jugador jugadro1, Jugador jugador2, Jugador jugador3){
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>(3);
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        System.out.println("jugador1="+jugador1.getUsuario());
        System.out.println("jugador2="+jugador2.getUsuario());
        System.out.println("jugador3="+jugador3.getUsuario());
    }
    public void setArray4(Jugador jugadro1, Jugador jugador2, Jugador jugador3, Jugador jugador4){
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>(4);
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        System.out.println("jugador1="+jugador1.getUsuario());
        System.out.println("jugador2="+jugador2.getUsuario());
        System.out.println("jugador3="+jugador3.getUsuario());
        System.out.println("jugador4="+jugador4.getUsuario());
    }
}

