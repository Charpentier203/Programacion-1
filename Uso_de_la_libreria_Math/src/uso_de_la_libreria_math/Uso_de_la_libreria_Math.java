/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uso_de_la_libreria_math;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Uso_de_la_libreria_Math {

    /**
    2. Uso de la librería Math Desarrolle un programa que pida al usuario el radio de un círculo.
Utilizando la constante Math.PI y la función Math.pow() de la librería matemática de Java, calcule
el área y circunferencia de dicho círculo y muestre el resultado al usuario.
     */
    public static void main(String[] args) {
         // TODO code application logic here
        double radio=0;
        double area=0;
        double circunferencia;
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Este programa le calcula el area y circunferencia de un circulo");
        System.out.println("Ingrese el radio del circulo");
        radio= sc.nextInt();
        area=Math.PI*Math.pow(radio,2);
        circunferencia=2*Math.PI*radio;
        System.out.printf("El area del circulo es %.2f y su circunferencia es %.2f",area,circunferencia);
    }
    
}
