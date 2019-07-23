
package ejerciciosc2;

import java.util.Scanner;

public class Ejercicio8_t1 {
   public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    
    double horas,eur,sal;
    eur=12;
    
    System.out.print("Ingrese el total de horas trabajadas: ");
    horas=dato.nextDouble();
    
    sal=horas*eur;
    
    System.out.println("El salario del empleado es de: "+sal);
    
    
    
}   
}
