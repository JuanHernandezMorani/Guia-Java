package Guia1_ejercicio_4;


public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase(){
    return this.base;
    }
    
    public void setBase(double num){
        this.base = num;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double num){
        this.altura = num;
    }
    
    public double Superficie(){
        double num1 = this.base;
        double num2 = this.altura;
        
            double superficie = num1 * num2;
                    
                    return superficie;
        
    }
    
    public double Perimetro(){
        double num1 = this.base;
        double num2 = this.altura;
        
        double perimetro = (num1 + num2)*2;
        
        return perimetro;
    }
    
    public void Dibujar(){
        int num1 = (int)(Math.round(this.base));
        int num2 = (int)(Math.round(this.altura));
        
        for(int i = 0; i < num1; i++){
           for(int j = 1; j < num2; j++){
               if((j > 1 && j < num2) && (i > 0 && i < num1-1)){
               System.out.print("  ");
               }else{
               System.out.print("* ");
               }
               
           }
           System.out.println("*");
        }

    }
}
