package Guia4_ejercicio_1;
 
 public class Main {
    public static void main(String[] args) {
        int[] v1 = new int[100];
        v1 = Completar(v1);
        
       for(int j = 100; j > 0; j--){
       System.out.println(v1[j-1]);
       }
        
    }
    
    public static int[] Completar(int[] v1){
        int[] resp = new int[100];
        for(int i = 0; i < 100;i++){
        resp[i] = i + 1;
        }
        
    return resp;
    }
}