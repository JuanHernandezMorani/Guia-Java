package testing;

public class test {
     public static void main(String[] args) {
      
      int A,B,C,D,X,N,i;
      
A = 1;
B = 1;
C = 1;
D = 1;
N = 100;
i = 0;
System.out.println("Iniciando proceso");
         do {
             
             if(i == N/4){
                 System.out.println("25% complete");
             }
                          if(i == N/2){
                              System.out.println("50% complete");
             }
                                       if(i == N - 1){
                                           System.out.println("99% complete");
             }

             X = D + 2*C + 3*B + 4*A;
             A = B;
             B =C;
             C = D;
             D = X;
             i = i + 1;
         } while (i < N);
         System.out.println(D % 100000000);
    }
}
