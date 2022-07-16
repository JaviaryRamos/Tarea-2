/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1JaviaryRamos;

import java.util.Scanner;
/**
 *
 * @author Javiary
 */
public class Ejercicio4 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String a,b,c;
         
         System.out.println("Ingrese la primera cadena: ");
         a = scan.next();
         System.out.println("Ingrese la segunda cadena: ");
         b = scan.next();
         System.out.println("Ingrese la tercera cadena: ");
         c = scan.next();
         
         System.out.println("Las permutaciones son: " +(a+b+c) + "\n" + (c+b+a) + "\n"
         + (a+c+b) + "\n" + (c+a+b) + "\n" + (b+a+c) + "\n" + (b+c+a));
         
         
                 
     }
    
}
