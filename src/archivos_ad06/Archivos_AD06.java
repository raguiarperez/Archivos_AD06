/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_ad06;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author dam2
 */
public class Archivos_AD06 {

    
    public static void mostrarPath () throws IOException {     
        
        File direcotrio = new File("/home/oracle/NetBeansProjects");

        System.out.println(direcotrio.getAbsolutePath());
        
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Archivos_AD06.mostrarPath();
    }
   
}
