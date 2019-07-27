
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio23 {
 public static void main(String[] args){
     Scanner dato=new Scanner(System.in);
    
     int n=0;
     int suma=0;
     int contador=0;
     int media;
     
     do{
         System.out.print("Ingrese un numero: ");
         n=dato.nextInt();
          suma=suma+n;
          contador++;
     }while(suma<=1000);
     media= suma/contador;
     System.out.println("Suma= "+suma);
     System.out.println("Media= "+media);
 }   
}
