
package ejerciciosc2;

import java.util.Scanner;

public class Ejercicio5_t1 {
   public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    
    double b,h,area;
    
    System.out.print("Ingrese la base del rectangulo: ");
    b=dato.nextDouble();
    
    System.out.print("Ingrese la altura del triangulo: ");
    h=dato.nextDouble();
    
    area=b*h;
    
    System.out.println("El area del rectangulo es: "+area);
    
} 
}
