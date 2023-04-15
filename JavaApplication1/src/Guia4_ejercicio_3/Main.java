package Guia4_ejercicio_3;

import java.util.Arrays;
 
 public class Main {
    public static void main(String[] args) {
        int lim = (int) (Math.random()*100+1);
        int[] v1 = new int[lim];
        int cont1 = 0,cont2 = 0,cont3 = 0,cont4 = 0,cont5 = 0;
        
        for(int i = 0; i<lim;i++){
        v1[i] = (int)(Math.random()*99999+1);
        
        if(v1[i] < 100){
        cont1 = cont1 + 1;
        }
        
        if(v1[i] > 9 && v1[i] < 100){
        cont2 = cont2 + 1;
        }
        
        if(v1[i] > 99 && v1[i] < 1000){
        cont3 = cont3 + 1;
        }
        
        if(v1[i] > 999 && v1[i] < 10000){
        cont4 = cont4 + 1;
        }
        
        if(v1[i] > 9999 && v1[i] < 100000){
        cont5 = cont5 + 1;
        }
        }
        System.out.println("Vertice: " + Arrays.toString(v1));
        System.out.println("De los "+ (cont1+cont2+cont3+cont4+cont5) + " numeros" + "\n Hay " + cont1 + " numeros de 1 digito" + "\n Hay " + cont2+ " numeros de 2 digitos" + "\n Hay " + cont3+ " numeros de 3 digitos" + "\n Hay " + cont4+ " numeros de 4 digitos" + "\n Y " + cont5 + " numeros de 5 digitos.");
    }
}