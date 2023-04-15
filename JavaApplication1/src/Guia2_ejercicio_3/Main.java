/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2_ejercicio_3;

import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String phrase;
        int pL;
        
        System.out.println("Ingrese una palabra con 8 caracteres");
        
        phrase = leer.nextLine();
        
        pL = phrase.length();
        
        if(pL == 8){
            System.out.println("Correcto");
        }else{System.out.println("Incorrecto");}
    }
}