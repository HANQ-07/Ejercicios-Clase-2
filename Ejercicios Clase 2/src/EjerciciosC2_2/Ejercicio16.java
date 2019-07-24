
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args){
       Scanner dato=new Scanner(System.in);
       
      int n, cont=0;
      
     System.out.print("Ingrese un numero: ");
     n=dato.nextInt();
     
     for(int i=1;i<=n;i++){
         if(n%i==0){
            cont++; 
         }
     }
     if(cont<=2){
         System.out.println("El numero es primo");
     }else{
     System.out.println("El numero es compuesto");
     }
  }
}
