
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
      
        int p1=0,p2=1;
        int suma=0;
        int n;
        System.out.print("Ingrese el valor de n: ");
        n=dato.nextInt();
        System.out.println("0");
        for(int i=0;i<n-1;i++){
      suma=p1+p2;
      p1=p2;
      p2=suma;
      System.out.println(suma);
    }
    }
}
