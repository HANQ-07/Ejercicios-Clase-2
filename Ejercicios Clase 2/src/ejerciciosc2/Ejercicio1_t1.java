
package ejerciciosc2;

import java.util.Scanner;

public class Ejercicio1_t1 {
public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    int n1,n2,resul;
    
     System.out.print("Ingrese un numero: ");
     n1=dato.nextInt();
     
     System.out.print("Ingrese otro numero: ");
     n2=dato.nextInt();
     
     resul= n1*n2;
     
     System.out.println("La multiplicacion de "+n1+"*"+n2+" es: "+resul);
    }
}
