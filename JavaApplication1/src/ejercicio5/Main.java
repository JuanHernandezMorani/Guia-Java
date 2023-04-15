/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

 import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double num;
        
        System.out.println("Ingrese un numero");
        
        num = leer.nextDouble();
        
        System.out.println("El doble de "+num+" es " +(num*2)+"\n"+"El triple de "+num+" es " +(num*3)+"\n"+"la raiz de "+num+" es " +Math.sqrt(num));
    }
}
