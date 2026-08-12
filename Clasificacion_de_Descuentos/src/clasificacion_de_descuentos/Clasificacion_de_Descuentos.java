/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificacion_de_descuentos;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Clasificacion_de_Descuentos {

    /**
     * Una tienda de software ofrece descuentos basados en la edad del cliente y si tiene una membresía premium. Se tiene que solicitar la edad y si tiene membresía ('S' para sí, 'N' para no).
•
Primero, se tiene que verificar si el cliente es mayor de edad (Arriba o igual a 18 años).
o
Si es mayor de edad: Se verifica si tiene más de 65 años o si tiene membresía. Si cumple alguna de las condiciones, recibe un 20% de descuento. Si no, recibe un 10%.
o
Si es menor de edad: Verificar si tiene membresía 'S' y tiene más de 12 años. Si es así, recibe un 15% de descuento. De lo contrario, no tiene descuento (0%).
El programa debe calcular y mostrar el descuento final aplicado y también el precio de venta original y el nuevo total que se tiene que pagar por el juego.
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
        
        int edad=0;
        String membresia="";
        double descuento=50;
        double precio=0;
        double preciofinal=0;
        
        System.out.println("Ingrese su edad");
        edad=input.nextInt();
        input.nextLine();//Limpieza de buffer
        System.out.println("Tiene membresia premium?(S para si, N para no)");
        membresia=input.nextLine().toUpperCase();
        if (edad>=18) {
            if (edad>65 || membresia.equals("S")) {
                descuento=20;
            }else{//Fin IF edad 65
            descuento=10;
            }//Fin ELSE edad 65
            
        }else{//fin IF edad 18
            if (membresia.equals("S") && edad>12) {
                descuento=15;
            }else{//fin IF menor 18
                descuento=0;
            }//fin ELSE menor 18
        
        }//fin ELSE edad 18
        
        System.out.println("Ingrese el precio del producto");
        precio=input.nextDouble();
        preciofinal=precio-(precio*(descuento/100));
        
        System.out.printf("Su descuento final es de %.2f",descuento);
        System.out.print("%");
        System.out.printf(", su juego vale originalmente %.2f y con el descuento le queda en %.2f",precio, preciofinal);
    }
    
}
