
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio10 {
 public static void main(String[] args) {
    
     Scanner dato=new Scanner(System.in);
     
     int num=0;
     int cant=0;
     int suma=0;
     int media;
  
     
     while(num>=0){
         System.out.print("Ingrese un numero: ");
         num=dato.nextInt();
         suma=suma+num;
         cant++;
     }
     media=(suma/cant)+1;
     System.out.println("La media de los numeros ingresados es: "+media);   
}
}