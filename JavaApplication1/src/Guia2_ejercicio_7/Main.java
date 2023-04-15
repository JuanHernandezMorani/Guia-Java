/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2_ejercicio_7;

import java.util.Scanner;
 
 
 public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int good = 0;
        int bad = 0;
        String phrase;
        boolean flag = true;
        


        do {
        
        System.out.println("Ingrese una cadena de 5 caracteres como maximo, debe empezar con la letra X y terminar con la letra O" + "\n");
        phrase = leer.nextLine()+"";
        
        if(phrase.length() < 1){
        phrase = "0";
        }
        
        if(phrase.length() == 5 && phrase.equals("&&&&&")){
            flag = false;
        }
        
            if (phrase.length() < 2 || phrase.length() > 5) {
                bad = bad + 1;
                System.out.println("La cadena debe tener un minimo de 2 caracteres y un maximo de 5 caracteres."+"\n");
            }
            
            if ((phrase.substring(0,1).equals("X") && phrase.substring(phrase.length()-1,phrase.length()).equals("O")) && (phrase.length() >= 2 && phrase.length() <= 5)) {
                good = good + 1;
                System.out.println("Lectura correcta"+"\n");
            }
            
            if((phrase.length() >= 2 && phrase.length() <= 5) && !(phrase.substring(0,1).equals("X") && phrase.substring(phrase.length()-1,phrase.length()).equals("O"))){
            bad = bad + 1;
                System.out.println("La cadena debe empezar con X y terminar con O" + "\n");
            }
            
            
        } while (flag);

        System.out.println("\n" + "Ejecucion finalizada, hubo " + good + "(" + + ((good * 100)/(good + bad)) + "%)" + " lecturas correctas. "  + "\n Y " + bad + "(" + + ((bad * 100)/(good + bad)) + "%)" + " lecturas incorrectas." );
        
        
        
    }
}