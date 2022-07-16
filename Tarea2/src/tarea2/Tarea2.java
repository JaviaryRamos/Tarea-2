/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author Javiary
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String cadena;
        String num1,num2;
        char operador;
        double numero1,numero2;
        double resultado;
        char suma = '+';
        char resta = '-';
        char mult = '*';
        char div = '/';
        
        System.out.println("Ingrese los numeros y el operador, todo junto sin espacios.");
        System.out.println("La cadena acepta numero de dos digitos ( ejm: 21+01)");
        cadena = scan.next();
        
        num1 = cadena.substring(0,2);
        operador  = cadena.charAt(2);
        num2 = cadena.substring(3);
        
        System.out.println("El primer numero es: "+num1);
        System.out.println("El segundo numero es: " +num2);
        System.out.println("El operador es: "+operador);
        
        numero1 = Integer.parseInt(num1);
        numero2 = Integer.parseInt(num2);
        
        if(operador == suma){
            resultado = numero1 + numero2;
            System.out.println(resultado);
        }
        else if(operador == resta){
            resultado = numero1 - numero2;
            System.out.println(resultado);                     
        }
        else if(operador == mult){
             resultado = numero1 * numero2;
            System.out.println(resultado);
        }else if(operador == div){
             resultado = numero1 / numero2;
            System.out.println(resultado);
        }      
    }

}
