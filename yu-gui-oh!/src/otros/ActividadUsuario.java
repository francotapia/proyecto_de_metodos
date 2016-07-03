/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;

import java.io.BufferedWriter;
import java.io.File;

/**
 *
 * @author sebastian
 */
//tiene metodo static, que es llamado despues de cada accion del usuario
//crea un txt y agregar el print de la accion
public class ActividadUsuario {
    String ruta = ""; //url de archivo
    File archivo = new File(ruta); //instancia archivo
    BufferedWriter bw; //escribe el archivo
 //   if(archivo.exists()){
   //     bw = new BufferedWriter(new FileWriter(archivo));
     //   bw.write("el archivo txt ya esta creado");
   // }else{
     //   bw = new BufferedWriter(new FileWriter(archivo));
       // bw.write("se acaba de crear txt");

    //}
    
}
