package Guia_8_ejercicio_3;


public class Main {
    public static void main(String[] args){
        
        System.out.println("Inicializando programa");
        
        
        Servicios p1 = new Servicios(),p2 = new Servicios(),p3 = new Servicios(),p4 = new Servicios();
        Integer[] imcS = new Integer[4];
        Boolean[] esMayor = new Boolean[4];
        int contI1 = 0,contI2 = 0,contI3 = 0,contM1 = 0,contM2 = 0;
        
        System.out.println("Creando personas");
        
        System.out.println("Persona 1: ");
        p1.crearPersona();
        
        System.out.println("Persona 2: ");
        p2.crearPersona();
        
        System.out.println("Persona 3: ");
        p3.crearPersona();
        
        System.out.println("Persona 4: ");
        p4.crearPersona();
        
        imcS[0] = p1.calcularIMC();
        imcS[1] = p2.calcularIMC();
        imcS[2] = p3.calcularIMC();
        imcS[3] = p4.calcularIMC();
        
       esMayor[0] = p1.esMayorDeEdad();
       esMayor[1] = p2.esMayorDeEdad();
       esMayor[2] =  p3.esMayorDeEdad();
       esMayor[3] =  p4.esMayorDeEdad();
        
for(int i = 0; i < 4; i++){
    switch(imcS[i]){
            
    case 1:
    contI1 = contI1 + 1;
   break;
   
    case 0:
    contI2 = contI2 + 1;
    break;
    
    case -1:
    contI3 = contI3 + 1;
   break;
   
   default:
   System.out.println("Error 423: El valor no esta contemplado en los parametros");
}
    if(esMayor[i]){
     contM1 = contM1 + 1;    
    }else{
        contM2 = contM2 + 1;
    }
}
       
        System.out.println("Hay "+contI1+" personas con sobrepeso. \nHay "+contI2+" personas en su peso ideal. \nHay "+contI3+" personas debajo del peso ideal\n"+"De las 4 personas, el "+(100*contM1)/4+"% ("+contM1+") es mayor de edad\n Y el "+(100*contM2)/4+"% ("+contM2+") es menor de edad");  
    }
    
}
