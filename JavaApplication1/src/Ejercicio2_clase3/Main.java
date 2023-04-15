package Ejercicio2_clase3;

 import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero entero");        
        num2 = leer.nextInt();
        
        if(num1 > 25 && num2 > 25){
            System.out.println("Ambos numeros son mayor a 25");
        }
        
        else if(num1 > 25 && num2 < 25){
        System.out.println("El primer numero es mayor a 25");
        }
        
        else if(num1 < 25 && num2 > 25){
        System.out.println("El segundo numero es mayor a 25");
        }
        
        else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
    }
}


/**
 
 * if(<condicion>){}
 * else{}
 
 **/