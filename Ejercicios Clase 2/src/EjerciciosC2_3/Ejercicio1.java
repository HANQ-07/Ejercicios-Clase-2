
package EjerciciosC2_3;

import java.util.Scanner;

public class Ejercicio1 {
 public static void main(String[] args){
     Scanner dato=new Scanner(System.in);
     
     String dia="";
     String materia;
     System.out.print("Introduce un dia de la semana en minusculas: ");
     dia=dato.nextLine();
    if(dia=="lunes"){
       System.out.println("Calculo II");
 }if(dia=="martes"){
     System.out.println("Programacion II");
 }if(dia=="miercoles"){
     System.out.println("Estadistica I");
 }if(dia=="jueves"){
     System.out.println("Microeconomia");
 }if(dia=="viernes"){
     System.out.println("Fisica I");
 }
 }   
}
