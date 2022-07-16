/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1JaviaryRamos;

import java.util.Scanner;
/*import javax.swing.JOptionPane;

/**
 *
 * @author Javiary
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int SECRET = 11;
        final double RATE = 12.50;
        int num1,num2,newnum;
        String name;
        double hoursWorked,wages=0;
        
        System.out.println("Ingrese un numero");
        num1 = scan.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = scan.nextInt();
        
        System.out.println("El primer numero es " + num1 + " y el segundo numero es " + num2);
        
        newnum = num1*2 + num2;
        System.out.println("El resultado es: " + newnum);
        newnum = newnum + SECRET;
        System.out.println("El nuevo resultado es: " + newnum);
        
        System.out.println("Ingrese un apellido");
        name = scan.next();
        
        System.out.println("Ingrese un numero entre 0 y 70 ");
        hoursWorked = scan.nextDouble();
        if ((hoursWorked > 0) && (hoursWorked <= 70)){
            wages = RATE*hoursWorked;
        } else {
            System.out.println("El numero esta fuera de rango");
        } 
        
        /*wages = RATE*hoursWorked;*/
        
        System.out.println("Nombre: " + name);
        System.out.println("Tarifa de pago: " + RATE);
        System.out.println("Horas pagadas: " + hoursWorked);
        System.out.println("Salario: " + wages);
        
        
               
    }
    
}
