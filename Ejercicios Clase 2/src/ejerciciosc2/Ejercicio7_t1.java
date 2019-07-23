
package ejerciciosc2;

import java.util.Scanner;

public class Ejercicio7_t1 {
   public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    
    double stot,iva,tot;
    
    System.out.print("Ingrese el total de la factura para calcular el total con IVA: ");
    stot=dato.nextDouble();
    
    iva=(stot*12)/100;
    tot=stot+iva;
    
    System.out.println("El total de la factura con IVA incluido es: "+tot);
    
    
    
}   
}
