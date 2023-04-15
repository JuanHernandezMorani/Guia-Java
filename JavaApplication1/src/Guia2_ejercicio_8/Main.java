package Guia2_ejercicio_8;

import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        String let1 = "";
        String let2 = "";
        
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextInt();
        leer.nextLine();
        
        for(int i = 0;i < num1;i++){
            if (i > 0 && i < num1-1) {
                if(let2.length() < num1){
                    let2 = "* ";
                    for(int k = 1; k < num1-1;k++){
                    let2 = let2 + "  ";
                }
                    let2 = let2 + "*";
                }
                
              System.out.println(let2);
            }
            if(i == 0 || i >= num1-1){
                if(let1.length() < num1){
                                    for(int j = 0; j < num1;j++){
                    let1 = let1 + "* ";
                }
                }

            System.out.println(let1);
            }
            
        }
        
        
    }
}