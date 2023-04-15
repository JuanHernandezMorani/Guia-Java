package Guia4_ejercicio_4;
 
 public class Main {
    public static void main(String[] args) {
        int[][] m1 = new int[4][4];
        int[][] m2 = new int[4][4];
        for(int i = 0; i < 4;i++){
        for(int j = 0; j < 4;j++){
        m1[i][j] = (int)(Math.random()*100+1);
        }
        }
        
                for(int i = 0; i < 4;i++){
        for(int j = 0; j < 4;j++){
        m2[i][j] = m1[j][i];
        }
        }
        
        for(int k = 0; k < 4;k++){
        for(int l = 0; l < 4;l++){
            
            System.out.print("["+m1[k][l]+"]");
            
        }
        System.out.println("");
        }
        System.out.println("\n");
           for(int k = 0; k < 4;k++){
        for(int l = 0; l < 4;l++){
            
            System.out.print("["+m2[k][l]+"]");
            
        }
        System.out.println("");
        }
    }
    
    
}