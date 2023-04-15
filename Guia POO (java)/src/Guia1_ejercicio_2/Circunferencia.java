package Guia1_ejercicio_2;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio) {
    Circunferencia nuevo = new Circunferencia(radio);
        System.out.println("Creando nueva circunferencia con radio: "+nuevo);
    }
    
    public double area(double radio){
    double area = Math.pow((Math.PI * radio),2);
    return area;
    }
    
    public double perimetro(double radio){
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }
}
