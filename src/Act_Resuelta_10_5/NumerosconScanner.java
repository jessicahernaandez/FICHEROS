/**/
package Act_Resuelta_10_5;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;


public class NumerosconScanner {
    
    public static void main (String [] args) {
        
        BufferedReader lectura = null;
        
        try {
            lectura = new BufferedReader(new FileReader("NumerosReales.txt"));
            /*Creamos el objeto de Scanner*/
            Scanner objetoScanner;
            double numero;
            double suma = 0;
            String linea = lectura.readLine();
            
            while (linea != null) {
                objetoScanner = new Scanner(linea).useLocale(Locale.US);
                if (objetoScanner.hasNextDouble()) { //Si es un double
                    numero = objetoScanner.nextDouble();
                    suma += numero;
                }
                
                linea = lectura.readLine();
            }
            
            System.out.println("Suma: " + suma);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            
            if (lectura != null) {
                try {
                    lectura.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            
        }
    }
    
}
