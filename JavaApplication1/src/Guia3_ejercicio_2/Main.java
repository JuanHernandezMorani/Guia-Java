package Guia3_ejercicio_2;

 import java.util.Scanner;
 
 
 public class Main {
     
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        String nombre;
        
        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad de la persona");
        edad = leer.nextInt();
        leer.nextLine();
        
        System.out.println(Lista(nombre,edad));
    }
    
    public static String Lista(String nombre, int edad){
    Scanner leer = new Scanner(System.in);
    String mayores = "";
    String menores = "";
    String resp;

    boolean flag = true;
    
        do {
if(edad >= 18){
mayores = mayores + "\n Nombre: " + nombre + ", Edad: " + edad;
}

if(edad < 18 && edad > 0){
menores = menores + "\n Nombre: " + nombre + ", Edad: " + edad;
}

            System.out.println("¿Desea continuar agregando personas? S/N");
            resp = leer.nextLine();
            if(resp.equalsIgnoreCase("S")){
                    System.out.println("Ingrese el nombre de la persona");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad de la persona");
        edad = leer.nextInt();
        leer.nextLine();
            }
            if(resp.equalsIgnoreCase("N")){
            flag = false;
            }

        } while (flag);
        
    
    return (mayores + "\n" + menores);
    }
}