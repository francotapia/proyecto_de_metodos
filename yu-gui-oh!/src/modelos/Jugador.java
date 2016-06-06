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
public class Jugador {
   
    //Atributos de la clase Jugador
    private String usuario;
    private String contraseña;
    private int movimiento;
    private int magia;
    private int trampa;
    private int puntaje;
    private int invocacion;
    
    //Constructores de la clase
    public Jugador(String jug, String cont){
        this.usuario = jug;
        this.contraseña = cont; 
    }
    public Jugador(){
        this.usuario = null;
        this.contraseña = null;
        this.movimiento = 0;
        this.magia = 0;
        this.trampa = 0;
        this.invocacion = 0;
    }
    //Metodos de la clase
    //get de los atributos
    public String getUsuario(){
        return this.usuario;
    }
    public String getContraseña(){
        return this.contraseña;
    }
    public int getPuntaje(){
        return this.puntaje;
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
    //set de los atributos
    public String setUsuario(String usuario){
        return this.usuario = usuario;
    }
    public String setContraseña(String contraseña){
        return this.contraseña = contraseña;
    }
    public int setPuntaje(int puntaje){
        return this.puntaje = puntaje;
    }
    public int setMovimiento(int movimiento){
        return this.movimiento = movimiento;
    }
    public int setMagia (int magia){
        return this.magia = magia;
    }
    public int setTrampa(int trampa){
        return this.trampa = trampa;
    }
    public int setInvocacion(int invocacion){
        return this.invocacion = invocacion;
    }
    
    public boolean ingresar (String usuario, String contraseña){
    //Condición para reconocer si el usuario y contraseña son correctos
    if(usuario.equals("antonio") && contraseña.equals("andres")){
        return true;
            
    }else{
        return false;
    }
    }
    
    public boolean existe(String usuario){
    //Verifica que el usuario esta registrado    
        if(usuario.equals(this.usuario)){
            return true;
        }else{
            return false;
        }
    }
    
}
