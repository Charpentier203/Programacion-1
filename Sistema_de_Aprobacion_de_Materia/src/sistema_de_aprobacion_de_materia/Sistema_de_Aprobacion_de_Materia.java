/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_de_aprobacion_de_materia;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Sistema_de_Aprobacion_de_Materia {

    /**
     Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string)
     * y las calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular
     * el promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando
     * que el estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado".

*       Requisito estricto: Solo puedes usar una estructura if/else simple.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String nombreES="";
        double ex1=0;
        double ex2=0;
        double prom=0;
        
        System.out.println("Este programa le dice si aprobo o reprobo su materia");
        System.out.println("Ingrese Su nombre");
        nombreES=input.nextLine().toUpperCase();
        System.out.println("Ingrese la nota de su primer examen");
        ex1=input.nextDouble();
        System.out.println("Ingrese la nota de su segundo examen");
        ex2=input.nextDouble();
        prom=(ex1+ex2)/2;
        if (prom>=65) {
            System.out.println("Aprobado");
            }else{
            System.out.println("Reprobado");
        }
    }
    
}
