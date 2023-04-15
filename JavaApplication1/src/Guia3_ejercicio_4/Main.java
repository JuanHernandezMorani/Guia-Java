package Guia3_ejercicio_4;

 import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        
        
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextInt();
        if(DetectarPrimo(num1)){
            System.out.println("El valor ingresado es un numero primo");
        } else{
            System.out.println("El valor ingresado no es un numero primo");
        }
        
        
    }
    
    public static boolean DetectarPrimo(int num1){
    if(num1 == 2 || num1 == 3 || num1 == 5){
        return true;
     }
    
    if((num1 % 2) == 0 || (num1 % 3) == 0 || (num1 % 5) == 0){

    return false;
    }
    else{
        return true;
    }
    }
}