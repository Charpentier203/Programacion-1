/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Conversiones {
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        //declaracion variables
        Scanner teclado= new Scanner(System.in);
        int pulgada=0;
        double resultadoCM=0;
        
        double kilometros=0;
        double millas=0;
        
        double fare=0;
        double celsi=0;
        
        System.out.println("Tenemos 5 Pulgadas");
        System.out.println("Cuanto es eso en CM?");
        
        pulgada=5;
        resultadoCM=pulgada*2.54;
        System.out.printf("%d pulgadas es equivalente a %.2f cm",pulgada,resultadoCM);
        
        pulgada= 12;
        resultadoCM=pulgada*2.54;
        System.out.printf("\n%.2f cm es equivalente a %d pulgadas",resultadoCM,pulgada);
        
        System.out.println("\nDime cuantos Kilometros son?");
        kilometros=teclado.nextDouble();
        
        millas=kilometros/1.6;
        System.out.printf("%.2f es = a %.3f millas",kilometros, millas);
        
        System.out.println("\n\nCuantos Celcius son?");
        celsi=teclado.nextDouble();
        fare= (celsi * 1.8) + 32;
        
        System.out.printf("%.2f celsius es igual a %.2f farenheit",celsi,fare);
    }
}
