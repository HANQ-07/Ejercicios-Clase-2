
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio8 {
 public static void main(String[] args) {
    
     Scanner dato=new Scanner(System.in);
     
     int num;
     int resul;
     System.out.print("Ingrese un numero: ");
     num=dato.nextInt();
     
     for(int i=1;i<=10;i++){
        resul=num*i;
        System.out.println(num+"x"+i+"="+resul);
     }
}   
}
