package Guia1_ejercicio_1;


public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int Numero_de_paginas;
    
        public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNP() {
        return Numero_de_paginas;
    }

    public void setNP(int Numero_de_paginas) {
        this.Numero_de_paginas = Numero_de_paginas;
    }
    
   public Libro(int isbn, String titulo, String autor, int nP){
       this.ISBN = isbn;
       this.Titulo = titulo;
       this.Autor = autor;
       this.Numero_de_paginas = nP;
   }

    public Libro() {
        
    }
    

 
}