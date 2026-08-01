/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donaciondesangre;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class DonacionDeSangre {

    /**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
        int edad=0;
        int peso=0;
        char comio ='@';
        char genero ='@';
        int emoglobina=0;
        
        System.out.println("Cual es su edad?");
        edad=input.nextInt();
        System.out.println("Cual es su peso?");
        peso=input.nextInt();
        System.out.println("Ya comio?(a=si b=no)");
        input.nextLine();
        comio=input.nextLine().charAt(0);
        if (comio=='a') {
            
        
        if (edad>17 & edad<66 & peso >=110) {
            System.out.println("Cual es su genero? (h=Hombre m=Mujer)");
            genero=input.nextLine().charAt(0);
            if (genero == 'h') {
                System.out.println("Cual es u nivel de hierro/hemoglobina? H");
                
                emoglobina=input.nextInt();
                if (emoglobina >14) {
                    System.out.println("Si puede donar H");
                }else{
                    System.out.println("No tiene hemoglobina H");
                }
                
            }else {
              System.out.println("Cual es u nivel de hierro/hemoglobina? M");
               
                emoglobina=input.nextInt();
                if (emoglobina >12) {
                    System.out.println("Si puede donar M");
                }else{
                    System.out.println("No tiene hemoglobina M");
                }
                
            }
        }
        else{
            System.out.println("No cumple los requisitos de edad y peso");
        }
        }else   {
            System.out.println("Debe comer");
        }    
        
    }//FinMain
    
}
