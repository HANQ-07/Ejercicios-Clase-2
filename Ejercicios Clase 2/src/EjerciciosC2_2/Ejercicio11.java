
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio11 {
 public static void main(String[] args) {
   Scanner dato=new Scanner(System.in);
     int n,cuad,cub;
 System.out.print("ingrese un numero: ");
 n=dato.nextInt();
 n=n-1;
 for(int i=0;i<5;i++){
     n++;
     cuad=n*n;
     cub=n*n*n;
     System.out.println(n+"\t"+cuad+"\t"+cub);
 }
 }   
}
