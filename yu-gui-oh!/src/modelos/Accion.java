/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


/**
 *
 * @author franc
 */
public class Accion {
    private int movimiento;
    private int magia;
    private int trampa;
    private int invocacion;
    private int ataque;

    public Accion(int mov, int atac, int inv, int mag, int tramp){
        this.movimiento = mov;
        this.magia = mag;
        this.trampa = tramp;
        this.invocacion = inv;
        this.ataque = atac;
    }
    public int getMovimiento(){
        return this.movimiento;
    }
    public int getMagia(){
        return this.magia;
    }
    public int getTrampa(){
        return this.trampa;
    }
    public int getInvocacion(){
        return this.invocacion;  
    }
    public int getAtaque(){
        return this.ataque;
        
    }
     public void setMovimiento(int movimiento){
        this.movimiento = movimiento;
    }
    public void setMagia (int magia){
        this.magia = magia;
    }
    public void setTrampa(int trampa){
        this.trampa = trampa;
    }
    public void setInvocacion(int invocacion){
        this.invocacion = invocacion;
    }
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    public int guardar (int num){
        if(num == 1){
            return this.ataque = ataque +1;  
        }
        if(num == 2){
            return this.invocacion = invocacion +1;
        }
        if(num == 3){
            return this.magia = magia +1;
        }
        if(num == 4){
            return this.movimiento = movimiento +1;
        }
        if(num == 5){
            return this.trampa = trampa +1;
        }
        else{
            return -1;
        }
    }
    public int usar(int num){
        int numero = num - 1;
        return numero;
    }
}
