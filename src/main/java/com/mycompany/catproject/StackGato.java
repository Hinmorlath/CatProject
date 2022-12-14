/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catproject;

/**
 *
 * @author Gateway
 */
public class StackGato {
    private final Gato stack[];
    private int top = 0;
    public Gato g;
    
    public StackGato(){
        this.stack = new Gato[5];
    }
    
    public boolean stackLleno(){
        return top == 5;
    }
    
    
    public void push( Gato g ){
        if ( !stackLleno() ){
            stack[top] = g;
            top++;
        } else {
            System.out.println("La pila está llena.");
        }
    }
    
    public void mostrarGato() {
        System.out.println("Gatos en la pila: ");
        
        for(Gato g: stack) {
            System.out.println("Gato ID: " + g.getId() + "\nGato URL: " + g.getUrl());
        }
    }
    
    // Quitar gato del stack
    public void pop() {
        System.out.println("Se eliminará el siguiente Gato: ");
        Gato gatoActual = stack[top - 1];
        System.out.println("Gato ID: " + gatoActual.getId() + "Gato URL: " + gatoActual.getUrl());
        stack[top - 1] = null; 
        System.out.println("Gato eliminado");
    }
    
}
