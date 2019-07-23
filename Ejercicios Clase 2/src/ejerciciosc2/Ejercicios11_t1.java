
package ejerciciosc2;

import java.util.Scanner;

public class Ejercicios11_t1 {
  public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    
    double mb,kb;
    
    System.out.print("la cantidad de kb que desea convertir: ");
    kb=dato.nextDouble();
    
    
    mb= kb/1024;
    
    System.out.println(kb+" KB equivale a: "+mb+" MB");
      
}      
}
