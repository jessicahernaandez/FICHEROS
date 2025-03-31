/*Ejercicio para practicar el try-catch*/
package Act_Resuelta_10_1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class PruebaTryCatch {
    
    static Integer leerEntero() {
        Integer resultado;
        
        while (true) {
            try {
                System.out.println("Introduce un numero entero: ");
                resultado = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erroneo");
            }
        }
        
        return resultado;
    }
    
    public static void main (String[] args) {
        
        leerEntero();
        
    }
    
}
