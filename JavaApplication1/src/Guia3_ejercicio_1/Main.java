package Guia3_ejercicio_1;
 import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opt;
        double num1,num2,r1,r2,r3,r4;
        boolean flag = true;
        String resp;
        
        System.out.println("Ingrese dos numeros \n");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        leer.nextLine();
        
        do {
            System.out.println("\n Elija una accion: \n 1: Sumar \n 2: Restar \n 3: Multiplicar \n 4: Dividir (Si el segundo numero es igual o menor a 0 entonces el resultado sera 0) \n 5: Terminar la ejecucion \n");
            
            opt = leer.nextInt();
            leer.nextLine();
            
                    switch(opt){
            case 1:
                r1 = Sumar(num1,num2);
                System.out.println("\n El resultado de la suma es: " + r1 + "\n");
                break;
                
            case 2:
                r2 = Restar(num1,num2);
                System.out.println("\n El resultado de la resta es: " + r2 + "\n");
                break;
                
            case 3:
                r3 = Multiplicar(num1,num2);
                System.out.println("\n El resultado de la multiplicacion es: " + r3 + "\n");
                break;
                
            case 4: 
                if(num2 <= 0){
                    num1 = 0;
                    num2 = 0;
                }
                r4 = Dividir(num1,num2);
                System.out.println("\n El resultado de la division es: " + r4 + "\n");
                break;
            case 5:
                System.out.println("\n ¿Desea terminar la ejecucion? S/N \n");
                resp = leer.nextLine();
                if(resp.equalsIgnoreCase("S")){
                flag = false;
                    System.out.println("\n Ejecucion terminada exitosamente \n");
                    break;
                }
                if(resp.equalsIgnoreCase("N")){
                    System.out.println("\n Continuando con la ejecucion \n");
                    break;
                }
            default:
                System.out.println("\n La opcion ingresada no es valida, porfavor vuelva a intentarlo \n");
        }
        } while (flag);
        

    }
    
    public static double Sumar(double num1, double num2){
    double suma;
    
    suma = num1 + num2;
    
    return suma;
    }
    
        
    public static double Restar(double num1, double num2){
    double resta;
    
    resta = num1 - num2;
    
    return resta;
    }
        
    public static double Multiplicar(double num1, double num2){
    double mult;
    
    mult = num1 * num2;
    
    return mult;
    }
        
    public static double Dividir(double num1, double num2){
    double div;
    
     div = num1 / num2;
 
    return div;
    }
    
}
