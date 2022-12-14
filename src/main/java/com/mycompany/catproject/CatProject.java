/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catproject;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gateway
 */
public class CatProject {
    public static void main(String[] args) throws IOException {
        StackGato stackGatos = new StackGato();
        
        int opcionMenu = -1;
        String[]opciones = {
            "1. Ver gato",
            "2. Mostrar Gatos",
            "3. Checar si el stack está lleno",
            "4. Eliminar último gato",
            "5. Salir"
        };
        
        
        do{
            String opcion = (String)JOptionPane.showInputDialog(null, "Gatitos java",
                    "Menú Principal", JOptionPane.INFORMATION_MESSAGE, null, opciones,
                    opciones[0]);
            
            for(int i = 0; i < opciones.length; i++){
                if(opcion.equals(opciones[i]))
                    opcionMenu = i;
            }
            GatosService service = new GatosService();
            
            switch(opcionMenu){
                case 0:{
                    System.out.println("Vas a ver a un gato");
                    Gato g = service.getGatos();
                    stackGatos.push(g);
                }
                    break;
                case 1:{
                    stackGatos.mostrarGato();
                }
                    break;
                case 2:{
                    if(stackGatos.stackLleno())
                        System.out.println("El stack está lleno");
                    else
                        System.out.println("El stack no está lleno");
                }
                    break;
                case 3:{
                    stackGatos.pop();
                }
                    break;
                case 4:
                    System.out.println("Vas a salir del sistema");
            }
            
        }while(opcionMenu != 4);
    }
    
}
