package Guia4_ejercicio_2;

import java.util.Arrays;
 import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int random = (int) (Math.random()*100+1);
        int contador = 0;
        String aux = "";
        int num;
        int[] v1 = new int[random];
        
        v1 = Completar(v1,random);
        
        System.out.println("Ingrese un numero para buscar en el vector");
        num = leer.nextInt();
        
        for(int j = 0; j < random; j++){
        if(v1[j] == num){
            contador = contador + 1;
            aux = aux + "Indice: " +v1[j]+ "\n";
        }
        }
        if(contador > 1){
        System.out.println("Veces repetidas: " + contador + "\n" + "El valor esta en los indices: " + aux);
        }
        if(contador == 1){
        System.out.println("El valor ingresado no se encuentra repetido "+ "\n" + "El valor esta en el indice: " + aux);
        }
        if(contador == 0){
            System.out.println("El valor ingresado no se encuentra en el vector");
        }
        System.out.println("El vector era: " + Arrays.toString(v1));
    }
    public static int[] Completar (int[] v1,int num){
    int[] resp = new int[num];
    
    for(int i = 0; i < num;i++){
    resp[i] = (int) (Math.random()*100+1);
    }
    return resp;
    }
}
