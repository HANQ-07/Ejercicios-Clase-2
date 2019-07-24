
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio9 {
   public static void main(String[] args) {
    
     Scanner dato=new Scanner(System.in);
     
     int num;
     int resul=0;
     System.out.print("Ingrese un numero: ");
     num=dato.nextInt();
     
     while(num!=0){
         num=num/10;
         resul++;
     }
     System.out.println("el numero tiene "+resul+" cifras");
     } 
}
