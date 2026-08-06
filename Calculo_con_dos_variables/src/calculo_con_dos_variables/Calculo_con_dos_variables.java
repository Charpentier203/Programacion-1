/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo_con_dos_variables;

import java.util.Scanner;

/**
 1. Cálculo con dos variables Escribir un programa que solicite al usuario la base y la altura de un
rectángulo. Utilice estas dos variables para calcular el área del rectángulo (Base X Altura) y el
perímetro (suma de todos sus lados). Imprimir ambos resultados en pantalla.
 * @author rafac
 */
public class Calculo_con_dos_variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int altura=0;
        int base=0;
        int area=0;
        int perimetro=0;
        
        System.out.println("Este programa le calcula el area y perimetro de un rectandulo");
        System.out.println("Ingrese la Altura del Rectangulo");
        altura= sc.nextInt();
        System.out.println("Ingrese la Base del Rectangulo");
        base= sc.nextInt();
        area=base*altura;
        perimetro=(2*base)+(2*altura);
        System.out.printf("El area del rectangulo es %d y el perimetro es de %d",area,perimetro);
    }
    
}
