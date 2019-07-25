
package EjerciciosC2_2;

import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args){
      Scanner dato=new Scanner(System.in);
      
    int n=0;
    int contn=0;
    int sumaimpar=0;
    int contimpar=0;
    int parmayor=0;
    int mediaimpar;
    
    do{
        System.out.print("Introduzca un numero: ");
        n=dato.nextInt();
        
        contn++;
      
        if(n%2==0){
          if(n>parmayor){
              parmayor=n;
          }  
        }else{
            contimpar++;
            sumaimpar=sumaimpar+n;
        }
    }while(n>=0);
    mediaimpar=sumaimpar/contimpar;
    System.out.println("El total de numeros ingresados es: "+contn);
    System.out.println("la media de los numeros impares es: "+mediaimpar);
    System.out.println("el numero par mayo es: "+parmayor);
    
  }  
}
