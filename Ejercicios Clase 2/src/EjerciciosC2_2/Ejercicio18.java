
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio18 {
 public static void main(String[] args){
     Scanner dato=new Scanner(System.in);
     
     int n1, n2, men, may;
     
     System.out.print("Ingrese un numero entero positivo: ");
     n1=dato.nextInt();
     System.out.print("Ingrese otro numero entero positivo: ");
     n2=dato.nextInt();
     
      if(n1>n2){
          may=n1;
          men=n2;
      }else{
          may=n2;
          men=n1;
      }
      for(int i=0; i<may;i++){
          men=men+7;
          
          if(men<=may){
          System.out.println(men);}
      }
 }   
}
