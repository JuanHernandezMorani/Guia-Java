/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2_ejercicio_2;

import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String word;
        
        System.out.println("Ingrese una palabra");
        
        word = leer.nextLine();
        
        if(word.equals("eureka")){
            System.out.println("Respuesta correcta");
        }
        else{
            System.out.println("Respuesta incorrecta");
        }
        
    }
}
