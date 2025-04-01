/*Ejercicio para practicar el try-catch*/
package Act_Resuelta_10_1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class PruebaTryCatch {
    
    static Integer leerEntero() {
        Integer resultado;
        
        Scanner sc = new Scanner(System.in);
        
            try {
                System.out.println("Introduce un numero entero: ");
                resultado = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erroneo");
                resultado = leerEntero();
            }
        
        
        return resultado;
    }
    
    public static void main (String[] args) {
        
        leerEntero();
        
    }
    
}
