package ejercicio2;

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre");
        
        nombre = leer.nextLine();
        
        System.out.println("Hola, " + nombre);
    }
}
