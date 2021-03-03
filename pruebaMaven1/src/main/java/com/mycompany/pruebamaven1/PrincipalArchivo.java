/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebamaven1;

import java.util.Scanner;

/**
 *
 * @author HP 8va Gen
 */
public class PrincipalArchivo {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        operaciones_archivo oper=new operaciones_archivo();
        boolean continuar=true;
        int opc;
        while(continuar==true)
        {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1.CREAR DIRECTORIO");
            System.out.println("2.CREAR ARCHIVO");
            System.out.println("3.ADICIONAR CONTENIDO");
            System.out.println("4.Mostrar Contenido");
            System.out.println("5.Salir");
            opc=leer.nextInt();
            switch(opc)
            {
                case 1:
                   oper.crearDirectorio();
                break;
                case 2:
                    oper.crearArchivo();
                break;
                case 3:
                    oper.agregarContenido();
                break;
                case 4:
                    oper.mostrarContenido();
                break;
                case 5:
                    continuar=false;
                break;
                
            }
            
        }
    }
}
