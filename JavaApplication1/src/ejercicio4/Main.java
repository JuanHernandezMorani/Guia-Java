package ejercicio4;

 import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double gradoC;
     
        System.out.println("Ingrese los grados centigrados (para decimal utilizar la coma)");
        
        gradoC = leer.nextDouble();
        
        double gradoF = 32 + (9*gradoC/5);
        
        System.out.println("Valor en farenheit: "+gradoF+"°F");
        
    }
}
