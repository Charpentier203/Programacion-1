/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensor_temperatura;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Sensor_Temperatura {

    /**
     Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados) registradas por un sensor industrial.
     * El programa debe detenerse cuando el usuario ingrese el valor centinela −999.
•
Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). Si el usuario ingresa un valor menor a este
* (que no sea el centinela), el programa debe mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos.
•
Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas ingresadas y la diferencia térmica entre 
* la temperatura más alta y la más baja leída.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double temperatura=0;
        double sumatoria=0;
        int contador=0;
        double promedio=0;
        double temperaturaMax=0;
        double temperaturaMin=999999999;
        double diferencia=0;
        
        System.out.println("Este programa da el promedio de temperatura y la diferencia termica entre la mas alta y mas baja");
        while (temperatura!=-999){
            System.out.println("Ingrese la siguiente temperatura:");
            temperatura=sc.nextDouble();
            if (temperatura<-273.15 && temperatura!=-999) {
                System.out.println("Numero no valido, ingrese otro:\n");
            }else if (temperatura!=-999){
                
                sumatoria+=temperatura;
                contador++;
                if (temperaturaMax<temperatura){
                    temperaturaMax=temperatura;
                }
                if (temperaturaMin>temperatura){
                    temperaturaMin=temperatura;
                }
            }
        }
        diferencia=temperaturaMax-temperaturaMin;
        promedio=sumatoria/contador;
        System.out.printf("El promedio final es: %.2f y la diferencia entre la maxima y minima fue de %.2f",promedio,diferencia);
        
    }
    
}
