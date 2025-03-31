/**/
package Excepciones_Usuario;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) throws ExcepcionEdadNegativa {
        
        try {
            System.out.println("Introducir edad: ");
            int edad = new Scanner(System.in).nextInt();
            if (edad < 0) {
                throw new ExcepcionEdadNegativa();
            } else {
                System.out.println("Edad correcta: " + edad);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Datos Incorrectos");
        } catch (ExcepcionEdadNegativa ex) {
            System.out.println(ex);
        }
    }
    
    
}
