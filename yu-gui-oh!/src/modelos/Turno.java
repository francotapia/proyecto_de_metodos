/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Morris
 */
public class Turno {
    static int numeroTurno;
    String dueno;
    Accion Accion;
    
    public static int sumaTurno(){
        numeroTurno = numeroTurno + 1;
        return numeroTurno;
    }
    
}

