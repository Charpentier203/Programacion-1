/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estado_de_clase;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Estado_de_clase {

    /**
     * conocer las estrcuturas de seleccion
     * a. toma de decision simple
     * b. Toma de decision doble
     * c. Decisiones numericos y caracteristicas/cadenas
     * 
     * 
     * 
     * Se necita un algotitymo que determine si un bote de agua de 500ml
     * a. esta rriba de la mitad    (Dato numerico)
     * b. contine agua o no         (Dato de caracter)
     * c. Es amigable con el ambinete (Dato de cadena)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        /*conociendo la estructura
        //palabra clave "if" y/o "else"
        //El grupo de instrucciones se encierra entre {}
        // no se usa ";" para los bloques
        //la condicion es una comparacion bajo los siguientes elementos
        a. <    menor
        b. >    mayor
        c. <=   menor igual
        d. >=   mayor igual
        e. ==   igual 
        d.  !=  Dsitinto
        */
        int cantidadagua=0;
        char respuesta= '@';
        String respuestaAmbiente = "John Doe";
        System.out.println("El bote es de 500mL");
        System.out.print("Cuanto liquido dices que contiene? ");
        cantidadagua=input.nextInt();
        
        if (cantidadagua >= 250) {
            System.out.println("Si, tiene mas de la mitad");
            System.out.println("Te lo puedes beber!!!");
            System.out.println("No nos quedamos sin nada... hay suficiente");
            
        }
        input.nextLine();//limpieza de buffer
        System.out.println("");
        
        System.out.println("El liquido que contiene es H2O? (a=SI B=NO");
        respuesta=input.nextLine().charAt(0);
        if(respuesta == 'a'){
            System.out.println("""
                               Si es agua lo que contine
                               No es otra cosa... nada embriagante.!!
                               """);
        }
        else{
            System.out.println("""
                               UY UY UY
                               Que sera?...
                               """);
        }
        System.out.printf("\nEse bote que contiene %d mL",cantidadagua);
        System.out.println("\nEs amigable ncon el ambiente?");
        respuestaAmbiente=input.nextLine();
        System.out.printf("Dato de Variable: %s",respuestaAmbiente);
    }//fin main
    ;
}//fin class
