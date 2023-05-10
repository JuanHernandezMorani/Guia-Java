package Guia_8_ejercicio_2;

public class CafeteraServicio {
    Cafetera cafetera = new Cafetera();
    
    public void crearCafetera(int valor){
        cafetera.setCantidadMaxima(valor);
        cafetera.setCantidadActual(0);
    }
    
    public void llenarCafetera(){
        System.out.println("Llenando cafetera, agregando "+(cafetera.getCantidadMaxima()-cafetera.getCantidadActual())+" ml");
                cafetera.setCantidadActual(cafetera.getCantidadMaxima());
    }
    
    public void servirTaza(int cantidad){
        int contenido = cafetera.getCantidadActual();
        int azar = (int) Math.floor(Math.random()*20);
        int tiempo = (int) Math.floor(Math.random()*azar);
        
     if(cantidad <= contenido){

        cafetera.setCantidadActual(contenido-cantidad);
         System.out.println("Llenando la taza...");
         
         for(int i = 1; i <= tiempo;i++){
             System.out.println(((i*100)/tiempo)+"%");
         }
         
         System.out.println("Taza llenada correctamente, cantidad restante en la cafetera: "+cafetera.getCantidadActual()+"ml");
         
     }else{
         cafetera.setCantidadActual(0);
                  
                  System.out.println("Llenando la taza...");
         
         for(int i = 1; i <= tiempo;i++){
             System.out.println(((i*100)/tiempo)+"%");
         }
         
         System.out.println("La cantidad solicitada era mayor a la poseida, la taza se lleno un "+((contenido*100)/cantidad)+"%");

     }
    }
    
    public void vaciarCafetera(){
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(int cantidad){
        int actual = cafetera.getCantidadActual();
        int limite = cafetera.getCantidadMaxima();
        if((cantidad + actual) > limite){
            System.out.println("La cantidad ingresada supera el limite, llenando cafetera completamente.");
            for(int i = 1; i <= 8;i++){
             System.out.println(((i*100)/8)+"%");
         }
            cafetera.setCantidadActual(limite);
        }else{
            int azar = (int) Math.floor(Math.random()*20);
            int tiempo = (int) Math.floor(Math.random()*azar);
            
            cafetera.setCantidadActual(cantidad+actual);
            System.out.println("Llenando cafetera");
            for(int i = 1; i <= tiempo;i++){
             System.out.println(((i*100)/tiempo)+"%");
         }
            System.out.println("Proceso completado, la cafetera posee "+cafetera.getCantidadActual()+"ml");
        }
    }
    
}
