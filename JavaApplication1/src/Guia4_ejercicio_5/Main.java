package Guia4_ejercicio_5;

 import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        int[][] matriz;
        boolean res;
        
        System.out.println("Iniciando proceso, porfavor ingrese los valores de la matriz.\n Los espacios dentro de la matriz son:  \n\n             [1] [2] [3] \n\n             [4] [5] [6] \n\n             [7] [8] [9] \n\n");
        matriz = NuevaMatriz();
        
        res = Comparacion(matriz);
      if(res){
          System.out.println("\nLa matriz ingresada es Antisimetrica\n");
      } else{
      System.out.println("\nLa matriz ingresada no es Antisimetrica\n");
      }
    }
    
    public static int[][] NuevaMatriz(){
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int cont = 1;
        
        for(int i = 0; i < 3; i++ ){
            for(int j = 0; j < 3; j++){
                System.out.println("Ingrese el valor de la ranuna " + cont);
                matriz[i][j] = leer.nextInt();
                leer.nextLine();
                cont = cont + 1;
            }
            
        }
        
        
    return matriz;
    }
    
    public static boolean Comparacion (int[][] Matriz) {
        
     int[][] matriz1 = Matriz;
     int[][] matriz2 = new int[3][3];
     int cont = 0;
     boolean res = false;

    for(int a = 0; a < 3; a++){
    for(int b = 0; b < 3; b++){
        matriz2[a][b] = matriz1[b][a];
    }
    }
     
     
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matriz2[i][j] == (matriz1[i][j] * (-1))){
                    cont = cont + 1;
                }
            }
        }
        
        if(cont == 9){
            res = true;
        }
        
        if(cont < 9 && cont > 0){
            res = false;
        }
        
     return res;
    }
    
    
    
}