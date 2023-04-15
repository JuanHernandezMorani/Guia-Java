package Guia1_ejercicio_3;


public class Operacion {
    private final double num1;
    private final double num2;

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    
    
    public Operacion (double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public Operacion CrearOperacion(double num1, double num2){
        Operacion nuevo = new Operacion(num1,num2);
        return nuevo;
    }
    
    public double Sumar(){
        double res;
        double numero1 = getNum1();
        double numero2 = getNum2();
        
        res = numero1 + numero2;
        
        return res;
    }
    
    public double Restar(){
                double res;
        double numero1 = getNum1();
        double numero2 = getNum2();
        
        res = numero1 - numero2;
        
        return res;
    }
    
    public double Multiplicar(){
                double res;
        double numero1 = getNum1();
        double numero2 = getNum2();
        
        if(numero1 == 0 || numero2 == 0){
            res = 0;
            System.out.println("\nError: se multiplico por 0");
        }else{
             res = numero1 * numero2;
        }
       
        
        return res;
    }
    
    public double Dividir(){
        double res;
        double numero1 = getNum1();
        double numero2 = getNum2();
        
        if(numero2 == 0){
        res = 0;
            System.out.println("\nError: no se puede dividir por 0");
        } else {
            res = numero1 / numero2;
        }
        
        
        return res;
    }
    
}
