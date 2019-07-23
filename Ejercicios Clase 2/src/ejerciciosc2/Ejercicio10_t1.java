
package ejerciciosc2;

import java.util.Scanner;

public class Ejercicio10_t1 {
    public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    
    double mb,kb;
    
    System.out.print("la cantidad de mb que desea convertir: ");
    mb=dato.nextDouble();
    
    
    kb= mb*1024;
    
    System.out.println(mb+" MB equivale a: "+kb+" KB");
      
}   
}
