package Guia_8_ejercicio_1;

import java.math.BigInteger;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    CuentaBancaria nuevaCuenta = new CuentaBancaria();
     
         public void crearCuenta (){
             BigInteger dni;
             Integer nroC;
             double saldo;
             System.out.println("0%\n");
                 System.out.println("Ingrese DNI del cliente");
                     dni = leer.nextBigInteger();
                     leer.nextLine();
                     nuevaCuenta.setDniCliente(dni);
                     System.out.println("33%\n");
         
                 System.out.println("Ingrese el numero de cuenta");
                     nroC = leer.nextInt();
                     leer.nextLine();
                     nuevaCuenta.setNumeroCuenta(nroC);
                     System.out.println("66%\n");
         
                 System.out.println("Ingrese el saldo actual");
                     saldo = leer.nextDouble();
                     leer.nextLine();
                     nuevaCuenta.setSaldoActual(saldo);
                     System.out.println("99%\n");
         }
         
         public void ingresar(Double valor){
             Double saldo = nuevaCuenta.getSaldoActual() + valor;
             nuevaCuenta.setSaldoActual(saldo);
             System.out.println("Monto ingresado correctamente.\nSaldo actual: "+nuevaCuenta.getSaldoActual()+"\n");
         }
         
         public void retirar(Double valor){
             Double saldo = nuevaCuenta.getSaldoActual();
             if(saldo > 0 && saldo > valor){
                 nuevaCuenta.setSaldoActual(saldo - valor);
                 System.out.println("Se ha retirado: $"+valor+" de su cuenta"+"\nSaldo restante: $"+(saldo-valor)+"\n");
             } else if(saldo > 0 && saldo < valor){
                 System.out.println("Saldo actual: $"+saldo+", retirando: $"+saldo+" de su cuenta.\nSaldo restante: 0.00\n");
                nuevaCuenta.setSaldoActual(0.00);
             } else{
                 System.out.println("Saldo insuficiente\n");
             }
             
         }
         
         public void extraccionRapida(Double valor){
         Double saldo = nuevaCuenta.getSaldoActual();
         Double limit = saldo * 0.2;
         
         if(valor > limit){
             System.out.println("Limite superado, maximo retiro por este metodo: $"+limit+"\n");
         }else{
         nuevaCuenta.setSaldoActual(saldo-valor);
             System.out.println("Transaccion exitosa.\nSaldo restante: $"+(saldo-valor)+"\n");
         }
         
         }
         
         public void consultarSaldo(){
             System.out.println("Su saldo actual es de: $"+nuevaCuenta.getSaldoActual()+"\n");
         }
         
         public void consultarDatos(){
            System.out.println("Numero de cuenta: "+nuevaCuenta.getNumeroCuenta()+"\nDni Cliente:"+nuevaCuenta.getDniCliente()+"\nSaldo actual: $"+nuevaCuenta.getSaldoActual()+"\n");
         }
}
