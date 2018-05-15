/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectorarchivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jhon
 */
public class LectorArchivo {
    private String[] valores;
    public LectorArchivo() {
        
    }

    public void leerArchivo(){
        FileReader lectorArchivo=null;
        String lineaTexto="";
      
        BufferedReader textoArchivo;
        
        boolean lineaEncontrada=true;
        try{
            lectorArchivo=new FileReader("D:/Ingenieria de sistemas/estructura de datos/Estadisticas/archivos/vendedores.txt");
        }catch(FileNotFoundException err){
            System.out.println("Archivo no encontrado "+err.getMessage());
            
        }
        
        textoArchivo= new BufferedReader(lectorArchivo);
        int i=0;
        while(lineaEncontrada){
            try{
                lineaTexto=textoArchivo.readLine();
            }catch(IOException err){
                System.out.println("Archivo no encontrado\n"+err.getMessage());
            }
            
            if(lineaTexto==null){
                lineaEncontrada=false;
            }
            else{
                valores=lineaTexto.split("\n");
            
                
            
            i++;
            }
            
        }
        
        
    
    }
    public static void main(String[] args) {
        
    }
    
}
