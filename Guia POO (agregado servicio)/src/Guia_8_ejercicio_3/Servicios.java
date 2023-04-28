package Guia_8_ejercicio_3;

import java.util.Scanner;



public class Servicios {
    Scanner leer = new Scanner(System.in);
       Persona persona = new Persona();
       
    public void crearPersona(){
    boolean flag = true;
        System.out.println("Ingrese nombre");
   
 persona.setNombre(leer.nextLine());
 
        System.out.print("Ingrese el Apellido: ");
        persona.setApellido(leer.nextLine());
        
        
        System.out.print("Ingrese el DNI: ");
        persona.setDni(leer.nextInt());
        leer.nextLine();
        
        
        System.out.print("Ingrese la Edad: ");
        persona.setEdad(leer.nextInt());
        leer.nextLine();
        
        
        System.out.print("Ingrese el nacionalidad: ");
        persona.setNacionalidad(leer.nextLine());
        
        
        System.out.print("Ingrese el altura: ");
        persona.setAltura(leer.nextDouble());
        leer.nextLine();
        
        
        System.out.print("Ingrese el sexo (H,M,O): ");
        do {
             persona.setSexo(leer.next());
            if(persona.getSexo().equalsIgnoreCase("H") || persona.getSexo().equalsIgnoreCase("M") || persona.getSexo().equalsIgnoreCase("O")){
            flag = false;
            }
            else {
                System.out.println("El dato ingresado no es valido, porfavor ingrese \nH para sexo masculino \nM para sexo femenino \nO para otro genero \n\nIngrese nuevamente el valor");
            }
        } while (flag);
        
        
        
        
        System.out.print("Ingrese el Peso: ");
        persona.setPeso(leer.nextDouble());
        leer.nextLine();
        
    }
    
    public int calcularIMC(){
        double imc;
        
        imc = persona.getPeso() / Math.pow(persona.getAltura(),2);
        
    if(imc > 25){
        return 1;
    } else if(imc >= 20 && imc <=25){
        return 0;
    }else {
        return -1;
    }
        
    }
    
    public boolean esMayorDeEdad (){
    boolean res;
    int edad;


    edad = persona.getEdad();
    if(edad < 18){
    res = false;
    }else {
        res = true;
    }
    
    
    return res;
    }
}
