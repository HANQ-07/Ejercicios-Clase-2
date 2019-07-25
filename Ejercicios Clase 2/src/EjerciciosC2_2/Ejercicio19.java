
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio19 {
   public static void main(String[] arsg){
   Scanner dato=new Scanner(System.in);
   Scanner dato2=new Scanner(System.in);
   
   int tama;
   String simbol;
   
   System.out.print("Ingrese el tamños de la altura de la piramide: ");
   tama=dato.nextInt();
   
   System.out.print("Ingrese el simbolo el que desea dibujar la piramide: ");
   simbol=dato2.nextLine();
   
   for(int i=0;i<tama;i++){
    for(int j=tama-i;j>0;j--){
        System.out.print(" ");
    }
    for(int j=0;j<i;j++){
        System.out.print(simbol);
    }
    System.out.println("");
   } 
}
}