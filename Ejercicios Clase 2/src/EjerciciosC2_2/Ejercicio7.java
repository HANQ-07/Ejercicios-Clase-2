
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio7 {
   public static void main(String[] args) {
    
     Scanner dato=new Scanner(System.in);
     
     int pass=0;
     int contador=1;
     
     while(contador<5){
      System.out.print("Ingresa la clave para continuar: ");
      pass=dato.nextInt();
      if(pass==1999){
          System.out.println("Felicidades acertaste");
          contador=4;
      }else
          System.out.println("intenta nuevamente");
      contador++;
     }
     if(pass!=1999){System.out.println("Ups... Has llegado al limite de intentos");}
     
}     
}
