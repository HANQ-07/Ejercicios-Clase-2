
package ejerciciosc2;

import java.util.Scanner;

public class Ejercicio9_t1 {
     public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    
    double h,r,vol;
    double pi=3.1416;
    
    System.out.print("Ingrese la altura del cono: ");
    h=dato.nextDouble();
    
     System.out.print("Ingrese el radio del cono: ");
     r=dato.nextDouble();
    
    
    vol= (pi*(r*r)*h)/3;
    
    System.out.println("El volumen del cono es: "+vol);
      
}  
}
