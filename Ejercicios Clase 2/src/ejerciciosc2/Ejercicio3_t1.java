
package ejerciciosc2;

import java.util.Scanner;

public class Ejercicio3_t1 {
     public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    double peseta,convert;
    double eur= 0.006;
    
     System.out.print("Ingrese las pesetas que desea convetir: ");
     peseta=dato.nextDouble();
     
     convert= eur*peseta;
     
     System.out.println(peseta+" pesetas equivale a "+convert+" euros");
    }  
}
