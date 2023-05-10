package Guia_8_ejercicio_2;

import java.util.Scanner;

public class Main {
            
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        

        
        System.out.println("Iniciando programa cafetera v2.1.4");
        int azar = (int) Math.floor(Math.random()*100);
        int tiempo = (int) Math.floor(Math.random()*azar);
        Boolean flag = true;
        String resp;
        int opc,valor;
        CafeteraServicio cafetera = new CafeteraServicio();
        
        for(int i = 1; i <= tiempo;i++){
             System.out.println("Cargando... ("+((i*100)/tiempo)+"%)");
         }
        
        System.out.println("Ingrese cantidad maxima de la cafetera (en mililitros)");
        valor = leer.nextInt();
          leer.nextLine();
             cafetera.crearCafetera(valor);
             
        System.out.println("Ingresando al menu");
        
        do {
            menu();
            opc = leer.nextInt();
            leer.nextLine();
            
            switch(opc){
                case 1: 
                    cafetera.llenarCafetera();
                    break;
                
                case 2: 
                    int cant;
                    System.out.println("¿Cuál es la capacidad de la taza?");
                    cant = leer.nextInt();
                    leer.nextLine();
                    cafetera.servirTaza(cant);
                    break;
                
                case 3: 
                    cafetera.vaciarCafetera();
                    break;
                
                case 4:
                    int cant2;
                    System.out.println("¿Cuanto cafe desea cargar?");
                    cant2 = leer.nextInt();
                    leer.nextLine();
                    cafetera.agregarCafe(cant2);
                    break;
                    
                case 5:
                    Boolean flag2 = true;
                    System.out.println("\nDesea Salir? S / N");
                    resp=leer.nextLine();
                    if(resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("N")){
                        System.out.println("\nFinalizando proceso\n");
                        flag = false;
                    }else{
                        do {
                          System.out.println("\nValor ingresado invalido, use S para si y N para no.\nDesea Salir?");
                          resp=leer.nextLine();
                            if(resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("N")){
                                flag = false;
                                flag2 = false;
                            }   
                        } while (flag2);
                    }
                    break;
                    
                default: System.out.println("Opcion invalida, vuelva a intentarlo");
            }
        } while (flag);
        
        
    }
    
         private static void menu() {
        System.out.println("---------- MENU ----------\n\n1. Llenar cafetera totalmente\n2. Servir taza\n3. Vaciar Cafetera\n4. Agregar cafe\n5. Salir\n\n--------------------------\n");
    }
}
