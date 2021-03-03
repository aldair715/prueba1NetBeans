/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebamaven1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP 8va Gen
 */
public class operaciones_archivo {
    public void crearDirectorio()
    {
        Path path=Paths.get("D:\\progamacionIII");
        try{
            if(!Files.exists(path))
            {
                Files.createDirectory(path);
                System.out.println("DIRECTORIO CREADO");
            }
            else
            {
                System.out.println("EL DIRECTORIO YA ESTA CREADO");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void crearArchivo()
    {
        Path path=Paths.get("D:\\progamacionIII\\miArchivo.txt");
        try{
            if(!Files.exists(path))
            {
                Files.createFile(path);
                System.out.println("ARCHIVO CREADo");
            }
            else
            {
                System.out.println("ARCHIVO YA EXISTE");
                //Files.write(path, "hola que tal".getBytes(), StandardOpenOption.APPEND);
                
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void agregarContenido()
    {
       Path path=Paths.get("D:\\progamacionIII\\miArchivo.txt");
        
        
        try{
            String res;
            Scanner leer=new Scanner(System.in);
            System.out.println("DESEA AGREGAR CONTENIDO AL ARCHIVO S/N");
            res=leer.nextLine();
            while(res.equalsIgnoreCase("S"))
            {
                System.out.println("ESCRIBA UNA ORACION");
                String texto=leer.nextLine();
                texto+="\n";
                leer.nextLine();
                Files.write(path, texto.getBytes(),StandardOpenOption.APPEND);
                System.out.println("*********************************");
                System.out.println(texto);
                System.out.println("DESEA AGREGAR CONTENIDO AL ARCHIVO S/N");
                res=leer.next();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void mostrarContenido()
    {
        Path path=Paths.get("D:\\progamacionIII\\miArchivo.txt");
        try{
            List<String> lineas=Files.readAllLines(path);
            System.out.println("----------------------CONTENIDO DEL ARCHIVO------");
             
                for(String linea:lineas)
                {
                    System.out.println(linea);
                }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}
