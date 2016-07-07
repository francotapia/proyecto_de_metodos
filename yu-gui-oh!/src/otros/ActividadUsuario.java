/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sebastian
 */
//tiene metodo static, que es llamado despues de cada accion del usuario
//crea un txt y agregar el print de la accion
public class ActividadUsuario{
    public static void actividadUsuario(String actividad){
        Date fecha = new Date();
        DateFormat formatoHoraFecha = new SimpleDateFormat("yyyy/MM/dd :: HH:mm:ss =");
        String actividadUsuario = formatoHoraFecha.format(fecha) + actividad;
        File ActividadUsuario = new File("log.txt");
            try{
                if(ActividadUsuario.exists()==false){
                    System.out.println("El archivo no existe, se creara uno...");
                    ActividadUsuario.createNewFile();
                }
                PrintWriter salidaDeArchivo = new PrintWriter(new FileWriter(ActividadUsuario, true));
                salidaDeArchivo.append(actividadUsuario);
                salidaDeArchivo.append(System.lineSeparator());
                salidaDeArchivo.close();
            }catch(IOException e){
                System.out.println("No se puede escribir en el archivo");
            }
    }
}
