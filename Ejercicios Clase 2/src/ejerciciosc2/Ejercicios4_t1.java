
package ejerciciosc2;

import java.util.Scanner;

public class Ejercicios4_t1 {
public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    
    double n1,n2,sum,res,mult,div;
    
    System.out.print("Ingrese un numero: ");
    n1=dato.nextDouble();
    
    System.out.print("Ingrese otro numero: ");
    n2=dato.nextDouble();
    
    sum=n1+n2;
    res=n1-n2;
    mult=n1*n2;
    div=n1/n2;
    
    System.out.println("La suma de "+n1+"+"+n2+" es: "+sum);
    System.out.println("La resta de "+n1+"-"+n2+" es: "+res);
    System.out.println("La multiplicacion de "+n1+"*"+n2+" es: "+mult);
    System.out.println("La division de "+n1+"/"+n2+" es: "+div);
}
}