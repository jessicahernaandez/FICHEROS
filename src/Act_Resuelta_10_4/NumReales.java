/*Version del libro: Utilizando BufferedReader y readLine() */
package Act_Resuelta_10_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NumReales {

    
    public static void main(String[] args) {
        
        BufferedReader leeNumeros = null;
        
        try {
            leeNumeros = new BufferedReader (new FileReader("NumerosReales.txt"));
            String texto = leeNumeros.readLine();
            String [] cadenasNumeros = texto.split(" ");
            double suma = 0;
            
            for (int i = 0; i < cadenasNumeros.length; i++) {
                suma += Double.valueOf(cadenasNumeros[i]);
                
            }
            
            System.out.println("Suma: " + suma + "\tmedia: " + suma / cadenasNumeros.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            
            if (leeNumeros != null) {
                try {
                    leeNumeros.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
    
}
