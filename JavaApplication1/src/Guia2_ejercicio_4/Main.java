/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2_ejercicio_4;

import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String phrase;
        
        System.out.println("Ingrese una palabra iniciada con A");
        
        phrase = leer.nextLine();
        
        if(phrase.substring(0,1).equalsIgnoreCase("A")){
            System.out.println("Correcto");
        }else{System.out.println("Incorrecto");}
    }
}
