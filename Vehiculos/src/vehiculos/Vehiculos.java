/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Vehiculos {

    /**
     * Desarrollar un algoritmo que perimta seleccionar una marca de vehiculo
     * que mejor se situe a nuestros gustos. Siendo entomces, cumplir
     * el gusto de escoger un modelo particular.
     * Mostrar en pantalla un mensaje alusivo.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        int seleccionMenu = 0;
        char seleccionSubMenu =  '@';
        
        System.out.println("Catalogo de Vehiculos Importados");
        System.out.printf("|%-25s|  |%15s|\n","Rafael's shop!!","Importadora");
        System.out.println("---------------");
        System.out.println("1. Toyota");
        System.out.println("2. Honda");
        System.out.println("3. Mitsubishi");
        System.out.println("4. Ferrari");
        System.out.println("5. Volkswagen");
        System.out.print("Respuesta: ");
        seleccionMenu= sc.nextInt();
        
        //if else ->Rango un valores
        //switch -> Al mismo nivel - un solo valor puntual
        
       /* 
        if (seleccionMenu == 1) {
            
        }else if (seleccionMenu ==2) {
            
        }else if (seleccionMenu == 3) {
            
        }
        */
        sc.nextLine();//Limpieza de buffer
        switch(seleccionMenu){
            case 1:
                System.out.println("Catalogo de Toyota");
                System.out.println("A. Yaris");
                System.out.println("B. 22R");
                System.out.println("C. Tacoma");
                 sc.nextLine();//Limpieza de buffer
                seleccionSubMenu =sc.nextLine().toUpperCase().charAt(0);
                
                
            switch (seleccionSubMenu) {
                case 'A':
                    System.out.printf("%s Carro de Trabajo%s\n","\u001B[31m","\u001B[0m");
                    break;
                case 'B':
                    System.out.printf("%s Carro de Lujo%s\n","\u001B[32m","\u001B[0m");
                    break;
                case 'C':
                    System.out.printf("%s Carro Deportivo%s\n","\u001B[34m","\u001B[0m");
                    break;
                default:
                    System.out.println("Esa opcion no tenemos");
                    break;
            }
                
                break;

            case 2:
                System.out.println("Catalogo de Honda");
                System.out.println("A. CRV");
                System.out.println("B. Civic");
                System.out.println("C. Accord");
                 sc.nextLine();//Limpieza de buffer
                seleccionSubMenu =sc.nextLine().toUpperCase().charAt(0);
                
            switch (seleccionSubMenu) {
                case 'A':
                    System.out.printf("%s Carro de Trabajo%s\n","\u001B[31m","\u001B[0m");
                    break;
                case 'B':
                    System.out.printf("%s Carro de Lujo%s\n","\u001B[32m","\u001B[0m");
                    break;
                case 'C':
                    System.out.printf("%s Carro Deportivo%s\n","\u001B[34m","\u001B[0m");
                    break;
                default:
                    System.out.println("Esa opcion no tenemos");
                    break;
            }
                
                
                break;

            case 3:
                System.out.println("Catalogo de Mitsubishi");
                System.out.println("A. Mirage");
                System.out.println("B. L200");
                System.out.println("C. Outlander");
                 sc.nextLine();//Limpieza de buffer
                seleccionSubMenu =sc.nextLine().toUpperCase().charAt(0);
                
                if(seleccionSubMenu == 'A'){
                    System.out.printf("%s Carro de Trabajo%s\n","\u001B[31m","\u001B[0m");
                }else if(seleccionSubMenu == 'B'){
                    System.out.printf("%s Carro de Lujo%s\n","\u001B[32m","\u001B[0m");
                }else if(seleccionSubMenu == 'C'){
                    System.out.printf("%s Carro Deportivo%s\n","\u001B[34m","\u001B[0m");
                }else{
                    System.out.println("Esa opcion no tenemos");
                }
                
                break;
            case 4:
                System.out.println("Catalogo de Ferrari");
                break;
            case 5:
                System.out.println("Catalogo de Volkswagen");
                break;
            default:
                System.out.println("Solo valores del 1 al 5");
                break;
              
        }//Fin switch
        
        
        
    }//Fin main
    
}//Fin class
