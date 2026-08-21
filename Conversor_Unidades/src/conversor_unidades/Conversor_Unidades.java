/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor_unidades;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Conversor_Unidades {

    /**
     Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú debe mostrar las opciones:
     * 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y 4) Salir.
•
Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden ser negativos. Si el usuario ingresa
* un valor menor a cero, debe mostrarse un mensaje de error y volver a pedir el dato.
•
Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la operación aritmética correspondiente.
* El menú debe repetirse usando do-while hasta que el usuario elija la opción 4.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double unidadInicial=0;
        double unidadFinal=0;
        int accion=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Que quiere convertir? 1)Metros a pies 2)Kilos a libras 3)Centimetros a pulgadas 4)salir");
            accion=sc.nextInt();
            
           switch (accion) {
                case 1:
                    do {
                        System.out.println("Metros a pies");
                        System.out.println("Ingrese el valor de metros a convertir a pies");
                        unidadInicial=sc.nextDouble();
                        if (unidadInicial>0) {
                            unidadFinal=unidadInicial*3.28084;
                        System.out.printf("\nEl valor en pies es %.3f\n",unidadFinal);
                        }else {
                            System.out.println("Valor no valido. Debe ser mayor a 0");
                        }
                        
                    } while (unidadInicial<0);
                    
                    break;
                case 2:
                    do {
                        System.out.println("Kilogramos a libras");
                        System.out.println("Ingrese el valor de Kilogramos a convertir a libras");
                        unidadInicial=sc.nextDouble();
                        if (unidadInicial>0) {
                            unidadFinal=unidadInicial*2.20462;
                        System.out.printf("\nEl valor en libtas es %.3f\n",unidadFinal);
                        }else {
                            System.out.println("Valor no valido. Debe ser mayor a 0");
                        }
                        
                    } while (unidadInicial<0);
                    break;
                case 3:
                    do {
                        System.out.println("Centimetros a pulgadas");
                        System.out.println("Ingrese el valor de centimetros a convertir a pulgadas");
                        unidadInicial=sc.nextDouble();
                        if (unidadInicial>0) {
                            unidadFinal=unidadInicial*0.3937;
                        System.out.printf("\nEl valor en pulgadas es %.3f\n",unidadFinal);
                        }else {
                            System.out.println("Valor no valido. Debe ser mayor a 0");
                        }
                        
                    } while (unidadInicial<0);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }//Fin de Switch 
                    
        } while (accion!=4);
    }
    
}
