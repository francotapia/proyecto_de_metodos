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
    
    public static int sumaTurno(){
        numeroTurno = numeroTurno + 1;
        return numeroTurno;
    }
    
    public ArrayList<Jugador> setJugadores(ArrayList<Jugador> jugadores){
        this.jugadores=jugadores;
        return jugadores;
    }    
}

