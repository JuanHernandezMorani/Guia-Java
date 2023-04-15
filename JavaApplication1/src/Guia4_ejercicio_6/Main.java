package Guia4_ejercicio_6;

 import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        int[][] matriz;
        int res;
        
        matriz = CrearMatriz();
        
        System.out.println("\nLa matriz ingresada es:\n");
        for(int i = 0; i < 3; i++){
            for(int j =0; j < 3; j++){
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("\n");
        }
        res = EsMagico(matriz);
        
        switch(res){
         case 1 :
          System.out.println("Es una matriz magica\n");
          break;
          
         case 0:
          System.out.println("No es una matriz magica\n");
          break;
          
         default:
          System.out.println("\nEl valor de respuesta es incorrecto.\nRespuesta = "+res+"\n");
    }
               
    }
    
    public static int[][] CrearMatriz(){
        int[][] matriz = new int[3][3];
        int cont = 1;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("El formato de la matriz es:\n [1] [2] [3] \n [4] [5] [6] \n [7] [8] [9]");
        
        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j < 3; j++){
                System.out.println("Ingrese el valor n° "+cont);
                matriz[i][j] = leer.nextInt();
                leer.nextLine();
                while(matriz[i][j] < 1 || matriz[i][j] > 9){
                    System.out.println("\nEl valor ingresado es incorrecto, ingrese un valor entre 1 y 9.\n");
                    
                System.out.println("Ingrese el valor n° "+cont);
                matriz[i][j] = leer.nextInt();
                leer.nextLine();
                }
                cont = cont + 1;
            }
        }
        
    return matriz;
    }
    
    public static int EsMagico(int[][] arg){
     int[][] matriz = arg;
     int res;
     int fila01,fila02,fila03,colum01,colum02,colum03,diag01,diag02;
     
     fila01 = matriz[0][0] + matriz[0][1] + matriz[0][2];
     fila02 = matriz[1][0] + matriz[1][1] + matriz[1][2];
     fila03 = matriz[2][0] + matriz[2][1] + matriz[2][2];
     
     colum01 = matriz[0][0] + matriz[1][0] + matriz[2][0];
     colum02 = matriz[0][1] + matriz[1][1] + matriz[2][1];
     colum03 = matriz[0][2] + matriz[1][2] + matriz[2][2];
    
     diag01 = matriz[0][0] + matriz[1][1] + matriz[2][2];
     diag02 = matriz[0][2] + matriz[1][1] + matriz[2][0];
    
    
     
     if( fila01 == 15 && fila02 == 15 && fila03 == 15 && colum01 == 15 && colum02 == 15 && colum03 == 15 && diag01 == 15 && diag02 == 15){
     res = 1;
     } else {
     res = 0;
     }
    return res;
    }
}