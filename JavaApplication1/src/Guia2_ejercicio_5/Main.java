/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2_ejercicio_5;

import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lim,num1,num2;
        
        System.out.println("Ingrese un limite numerico");
        
        lim = leer.nextInt();
        leer.nextLine();
        num2 = 0;
        do {
            System.out.println("Ingrese un numero");
            num1 = leer.nextInt();
            
                    leer.nextLine();
                    
                    num2 = num2 + num1;
                    System.out.println("La suma de los numeros es: " + num2);
        } while (num2 < lim);
        System.out.println("La suma de los numeros supero el limite por " + (num2 - lim) + ". Finalizando programa.");
    }
}