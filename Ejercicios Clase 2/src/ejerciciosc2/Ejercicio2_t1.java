
package ejerciciosc2;

import java.util.Scanner;

public class Ejercicio2_t1 {
   public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    double eur,convert;
    double peseta= 166.386;
    
     System.out.print("Ingrese los euros que desea convetir: ");
     eur=dato.nextDouble();
     
     convert= eur*peseta;
     
     System.out.println(eur+" euros equivale a "+convert+" pesetas");
    } 
}
