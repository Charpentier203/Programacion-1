/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trayectoria_balistica;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Trayectoria_Balistica {

    /**
     Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la velocidad inicial (en m/s) 
     * y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula correspondiente a la trayectoria.
•
Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente entre 1 y 89 grados.
•
Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del proyectil (en metros) para cada 
* segundo transcurrido, desde el segundo 𝑡=1 hasta el segundo 𝑡=10.
•
Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el proyectil alcanza su altura 
* máxima estimada y en qué momento su altura empieza a ser negativa (lo que significa que ya impactó el suelo, momento 
* en el cual el ciclo debe romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double velocidad=0;
        double angulo=0;
        double altura=0;
        double alturaanterior=0;
        boolean maximaEncontrada = false;
         
        System.out.println("Este programa le calcula la trayectoria de un proyectil");
        
        do{
        
        System.out.println("Ingrese la velocidad inical en m/s:");
        velocidad= sc.nextDouble();
        System.out.println("Ingrese el angulo de lanzamiento");
        angulo=sc.nextDouble();
        if (!(velocidad>0 && angulo>0 &&angulo<90)){
            System.out.println("Valor no valido");  
            System.out.println("La velocidad debe ser mayor a 0 y el angulo debe estar entre 1 y 89");
        }
        }while (!(velocidad>0 && angulo>0 &&angulo<90));
        
        for (double t = 1; t <= 10; t++) {

    altura = (velocidad * Math.sin(Math.toRadians(angulo)) * t)- (0.5 * 9.81 * Math.pow(t, 2));

    if (altura < 0) {
        System.out.printf("\nEn el segundo %.0f la altura seria %.2f metros.", t, altura);
        System.out.println("\nEl proyectil ya impacto el suelo.");
        break;

    }else{
        System.out.printf("\nEn el segundo %.0f la altura es de %.2f metros.",t, altura);

        if (t>1 && altura<alturaanterior && maximaEncontrada == false) {
            System.out.printf("\nLa altura maxima estimada se alcanzo aproximadamente en el segundo %.0f.",t -1);

            maximaEncontrada = true;
        }
    }

    alturaanterior = altura;
}
        
    }
    
}
