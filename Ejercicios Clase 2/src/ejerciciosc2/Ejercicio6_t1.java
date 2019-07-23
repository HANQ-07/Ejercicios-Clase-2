
package ejerciciosc2;

import java.util.Scanner;


public class Ejercicio6_t1 {
   public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    
    double b,h,area;
    
    System.out.print("Ingrese la base del triangulo: ");
    b=dato.nextDouble();
    
    System.out.print("Ingrese la altura del triangulo: ");
    h=dato.nextDouble();
    
    area=(b*h)/2;
    
    System.out.println("El area del rectangulo es: "+area);
    
}  
}
