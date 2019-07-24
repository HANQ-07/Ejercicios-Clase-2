
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String [] args){
      Scanner dato=new Scanner(System.in);
      
      int base, expo;
      int temp, resul=1;
      
      System.out.print("Ingrese la base: ");
      base=dato.nextInt();
      
      System.out.print("Ingrese el exponente: ");
      expo=dato.nextInt();
      
      for(int i=0; i<expo;i++){
     temp=resul*base;
     resul=temp;
     int j=i+1;
     System.out.println("potencia del "+j+"="+resul);
 }
      
  }  
}
