
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio13 {
   public static void main(String[] args) {
       Scanner dato=new Scanner(System.in);
       int n;
       int posi=0, nega=0;
       for(int i=0;i<10;i++){
           System.out.print("Ingrese un numero: ");
           n=dato.nextInt();
           if(n<0){
               nega++;
           }else{
               posi++;
           }
       }
       System.out.println("la cantidad de nuemros positivos es: "+posi);
       System.out.println("la cantidad de nuemros negativos es: "+nega);
   }
}
