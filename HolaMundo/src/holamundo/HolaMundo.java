/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author rafac
 */
public class HolaMundo {
    
    //Comentario de una sola linea
    /*
        Pleca asterisco -> para abrir bloque
        Asterisco pleca -> para cerrar bloque
        Todo lo qu esta entre ello, se toma como comentario.
    
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //Sensible a mayusculas y minusculas
        /*
        objetivo
        1. Imprimir en la pantalla
            a. Diferentes formas para poder imprimir en pantalla
            b. Caracteres de escape
        2. Captura de datos por parte del usuario
        */
        
        System.out.println("Hola.... como estas");
        System.out.println("Este es mi primer programa");
        System.out.println("Yujuuu. estpy con Java");
        
        System.out.println("");
        System.out.println("");
        System.out.print("Rafael Charpentier");
        System.out.print("Spy alumno de Programacion");
        System.out.print("Mucho Gusto");
        
        System.out.println("");
        System.out.printf("Esta es la clase de %S","Programacion");
        System.out.println("");
        
        System.out.printf("Esta es %S la \n clase de \n","Programacion");
        System.out.println("");
        
        System.out.printf("%s Esta es la clase de \n","Programacion");
       // System.out.println("");
       System.out.printf("%s Esta \t es la \t clase de \t","Programacion");
       // System.out.println("");
       
       //variables
       int tiempo; // tipo entero
       double promedio; //tipo decimal
       String nombre; //Tipo cadena
       char inicial;// Tipo cracter -> letra, digitonumerico, simbolo especial
       boolean estado; //tipo booleano -> tru (verdadero) / false (falso)
       
       tiempo = 3;
       nombre = "Rafael";
       inicial = 'A';
       
        System.out.printf("Tu nombre es: %s\n",nombre);
        System.out.printf("%d veces a la semana recibes la clase\n",tiempo);
        System.out.printf("Te llamare %c inical",inicial);
       
    }// Fin de la funcion MAIN
    
}// Fin de la clase Hola Mundo
