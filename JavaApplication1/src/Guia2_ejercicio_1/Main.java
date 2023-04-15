/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2_ejercicio_1;

import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero");
        
        num = leer.nextInt();
        leer.nextLine();
        
        if (num < 0) {
            num = num * (-1);
        }
        
        if(num % 2 == 0){
            System.out.println("El numero ingresado es par");
        }
        else {
            System.out.println("El numero ingresado es impar");
        }
    }
}
