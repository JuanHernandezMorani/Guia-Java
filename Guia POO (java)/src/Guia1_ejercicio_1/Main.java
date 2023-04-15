
package Guia1_ejercicio_1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Libro libro;
        
        System.out.println("Iniciando agredado\n");
       libro = agregarLibro();
       
        System.out.println("Desplegando datos\n");
        
        Mostrar(libro);
    }
    
    public static Libro agregarLibro(){
        Scanner leer = new Scanner(System.in);
    int isbn,nP;
    String titulo,autor;
    Libro libro;
   
        System.out.println("\nIngrese el titulo del libro");
        titulo = leer.nextLine();
        
        System.out.println("\nIngrese el autor/a del libro");
        autor = leer.nextLine();
        
        System.out.println("\nIngrese la cantidad de paginas del libro");
        nP = leer.nextInt();
        leer.nextLine();
        
        isbn = (int) (Math.round(((Math.random()+15611) * (Math.random()+156) * (Math.random()+100) * (Math.random()+5)) + ((Math.random()+1) * (Math.random()+19) * (Math.random()+21) * (Math.random()+61))) * (Math.random()+12));
        
        libro = new Libro(isbn,titulo,autor,nP);
        
   return libro;
    }
    
   public static void Mostrar(Libro obj){
       
   Libro book; 
   book = obj;
   
   String titulo,autor;
   int isbn,nP;
   
   titulo = book.getTitulo();
   autor = book.getAutor();
   isbn = book.getISBN();
   nP = book.getNP();
   
   System.out.println("\nISBN: Jh"+isbn+"\nTitulo: "+titulo +"\nAutor: "+autor+"\nCantida de paginas: "+nP+"\n");
   }

}
