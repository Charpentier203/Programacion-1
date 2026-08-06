/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meteorologia;

import java.util.Scanner;

/**
 *
 * @author rafac
 * Objetivo
 * 1. Conocer las diferentes estructuras de repeticion
 * 2. Componentes de todo ciclo de repeticion
 * 3. Construir un algoritmo con un ciclo de repeticion
 */
public class Meteorologia {

    /**
     * Desarrollar un algoritmo que me permita simular una estacion
     * metereologica, que va registrando las temperaturas a lo largo de una semana:
     * 1. Registrar el dia en general
     * 2. Registrar en dos jornadas (dia y noche)
     * 
     * Mostrando el promedio general y un mensaje de caliente o frio para
     * cada jornada.
     * 
     * 
     * Ciclos de repeticion
     * 1. While
     * 2. Do while
     * 3. For
     * 4. Foreach
     * 
     * Componentes de los ciclos de repeticion
     * 1. valor de inicio                       -> Variable de control
     * 2. Condicion                             -> Establece el limite
     * 3. Modificque el estado de la condicion  -> Incrementa/Decrementa el valor inicio
     * 
     * El ciclo de repeticion se ejecuta y repite siempre y cuendo
     * la condicion se mantenga VERDADERO!!!!
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int temperatura=0;
        int dia=1;
        int tempAcum=0;
        double promedio=0;
        
        while(dia<=7){
            System.out.printf("Ingrese la temperatura: ");
            temperatura =sc.nextInt();
            tempAcum+=temperatura;
            System.out.println("");
            System.out.printf("Dia %d:\tTemperatura: %d\t TempAcumulado %d\n",dia,temperatura,tempAcum);
            
            
            
            
            
            
            dia++;
            
            /*
            dia+=1;
            
            
            dia++;
            */
        }
        dia--;
        System.out.printf("Dia Fibal: %d\n",dia);
        promedio=tempAcum/dia;
        System.out.printf("Promedio: %.2f",promedio);
    }
    
}
