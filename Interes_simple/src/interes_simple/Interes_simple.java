/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes_simple;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Interes_simple {

    /**
     3. Interés simple Escriba un programa que calcule el interés simple de un préstamo. El sistema
debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        double interes=0;
        double capital=0;
        int tasa=0;
        int tiempo=0;
        System.out.println("Este programa le esntrega el interes simple de su capital");
        System.out.println("Ingrese Cual es su capital inicial");
        capital=sc.nextDouble();
        System.out.println("Ingrese su tasa de interes anual como numero entero");
        tasa= sc.nextInt();
        System.out.println("Ingrese el tiempo en anos");
        tiempo=sc.nextInt();
        interes=(capital*tasa*tiempo)/100;
        System.out.printf("El interes generado por su cuenta con capital %.2f a tasa de interes simple de %d en un tiempo de %d ano(s) es %.2f\n",capital,tasa,tiempo,interes);
        
        
    }
    
}
