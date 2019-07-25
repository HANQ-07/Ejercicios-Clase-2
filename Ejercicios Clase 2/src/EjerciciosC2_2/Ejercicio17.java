
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio17 {
   public static void main(String[] args){
       Scanner dato=new Scanner(System.in);
      int sig=0, n=0;
      
      System.out.print("Ingrese un numero: ");
      n=dato.nextInt();
     
      int suma=n;
      for (int i=1;i<100;i++){
       suma=suma+sig;
       sig=n+i;
   }
      
    System.out.println("La suma de los 100 numeros es: "+suma);
   } 
}
