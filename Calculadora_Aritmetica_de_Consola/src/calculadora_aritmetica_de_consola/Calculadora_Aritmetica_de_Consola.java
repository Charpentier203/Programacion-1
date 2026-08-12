/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_aritmetica_de_consola;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Calculadora_Aritmetica_de_Consola {

    /**
     Crear un programa que actúe como una calculadora básica. Debe solicitar
     al usuario dos números enteros y un carácter (char) que represente la operación a realizar:
•
Suma
•
Resta
•
División
•
Multiplicación
•
Módulo ‘%.
Dependiendo del carácter ingresado, el programa debe usar una estructura de selección para realizar 
* la operación aritmética correspondiente y mostrar el resultado en formato decimal (cuidar las divisiones
* entre cero). Si el usuario ingresa un carácter no válido, se debe mostrar "Operador no reconocido".
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double numero1=0;
        double numero2=0;
        double respuesta=0;
        char operacion='@';
        System.out.println("Ingrese el primer numero de su operacion");
        numero1=input.nextDouble();
        input.nextLine();//Limpieza de buffer
        System.out.println("Ingrese el segundo numero de su operacion");
        numero2=input.nextDouble();
        input.nextLine();//Limpieza de buffer
        System.out.println("Que operacion desea hacer? Suma=S  Resta=R  Division=D Multiplicacion=M  Modulo=O");
        operacion=input.nextLine().toUpperCase().charAt(0);
        
        switch (operacion) {
                case 'S':
                    respuesta=numero1+numero2;
                    System.out.printf("La suma de ambos numeros es: %.2f",respuesta);
                    break;
                case 'R':
                    respuesta=numero1-numero2;
                    System.out.printf("La resta del primer numero menos el segundo es: %.2f",respuesta);
                    break;
                case 'D':
                    if (numero2!=0) {
                     respuesta=numero1/numero2;
                    System.out.printf("La division del primer numero dividido por el segundo es: %.2f",respuesta);   
                    }else{
                        System.out.println("Ingreso 0 como divisor y eso no es valido");
                    }                    
                    break;
                case 'M':
                    respuesta=numero1*numero2;
                    System.out.printf("La multiplicacion del primer numero por el segundo es: %.2f",respuesta);
                    break;
                case 'O':
                    respuesta=numero1%numero2;
                    System.out.printf("El modulo entre la division del primer numero entre el segundo es: %.2f",respuesta);
                    break;
                default:
                    System.out.println("Operador no reconocido");
                    break;
            }
    }
    
}
