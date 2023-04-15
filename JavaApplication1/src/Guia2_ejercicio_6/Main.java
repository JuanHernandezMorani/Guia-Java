package Guia2_ejercicio_6;

import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
                int num1, num2, opc;
        String resp="N";
         System.out.println("Ingrese 2 números: ");
        num1=leer.nextInt();
        num2=leer.nextInt();
        do {
            menu();
            opc=leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("La suma es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La suma es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La suma es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La suma es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("Desea Salir?");
                    resp=leer.next();
            }
        }while (resp.equals("N"));
    }
    
        private static void menu() {
        System.out.println("---------- MENU ----------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Ingrese una Opción: ");
    }
}

