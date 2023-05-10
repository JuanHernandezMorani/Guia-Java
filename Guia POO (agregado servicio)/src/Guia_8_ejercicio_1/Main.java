package Guia_8_ejercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String resp="N";
        Integer opc;
        System.out.println("Inicializando programa\n");
        
        CuentaBancariaServicio cta = new CuentaBancariaServicio();
        
        System.out.println("Creando nueva cuenta...\n");

        cta.crearCuenta();
        System.out.println("Cuenta creada correctamente, ingresando al menu\n");
        do {
            menu();
            opc=leer.nextInt();
            leer.nextLine();
            switch (opc){
                case 1:
                    double valor1;
                    System.out.println("¿Monto a ingresar?");
                    valor1 = leer.nextDouble();
                    leer.nextLine();
                    cta.ingresar(valor1);
                    break;
                case 2:
                    double valor2;
                    System.out.println("¿Monto a retirar?");
                    valor2 = leer.nextDouble();
                    leer.nextLine();
                    cta.retirar(valor2);
                    break;
                case 3:
                    double valor3;
                    System.out.println("¿Monto a retirar?(Limite: 20% del salario disponible)");
                    valor3 = leer.nextDouble();
                    leer.nextLine();
                    cta.extraccionRapida(valor3);
                    break;
                case 4:
                    cta.consultarSaldo();
                    break;
                case 5:
                    cta.consultarDatos();
                    break;
                case 6:
                    Boolean flag = true;
                    System.out.println("\nDesea Salir? S / N");
                    resp=leer.nextLine();
                    if(resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("N")){
                        System.out.println("\nFinalizando proceso\n");
                    }else{
                        do {
                          System.out.println("\nValor ingresado invalido, use S para si y N para no.\nDesea Salir?");
                          resp=leer.nextLine();
                            if(resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("N")){
                                flag = false;
                            }   
                        } while (flag);
                    }
                    break;
                default:
                    System.out.println("\nOpcion ingresada no valida\n");
            }
        }while(resp.equalsIgnoreCase("N"));
        System.out.println("Proceso finalizado correctamente");
    }
    
     private static void menu() {
        System.out.println("---------- MENU ----------\n\n1. Ingresar Dinero\n2. Retirar Dinero\n3. Extraccion Rapida(20%)\n4. Consultar Saldo\n5. Mostrar Datos\n6. Salir\n\n--------------------------\n");
    }
    
}
