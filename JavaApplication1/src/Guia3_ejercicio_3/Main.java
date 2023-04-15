package Guia3_ejercicio_3;

 import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1;
        String cambio;
        
                System.out.println("Ingrese un valor cuantos euros desea convertir");
        num1 = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingrese a que moneda desea cambiar (dolar,yen,libra)");
        cambio = leer.nextLine();
        

        Convertir(num1,cambio);
    }
    
    public static void Convertir(double num1, String cambio){
    switch  (cambio){
        case "dolar":
            System.out.println(num1 * 1.28611);
            break;
            
        case "yen": 
            System.out.println(num1 * 129.852);
            break;
        
        case "libras": 
            System.out.println(num1 * 0.86);
            break;
        
    }
    

    }
}