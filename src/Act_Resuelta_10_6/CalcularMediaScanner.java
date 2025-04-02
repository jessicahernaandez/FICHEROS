/**/
package Act_Resuelta_10_6;

import java.io.*;
import java.util.Scanner;


public class CalcularMediaScanner {

    
    public static void main(String[] args) {
       
        FileInputStream flujo = null;
        
        try {
            flujo = new FileInputStream("Enteros.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        Scanner objetoScanner = new Scanner (flujo);
        double suma = 0;
        double contador = 0;
        
        while (objetoScanner.hasNext()) {
            int numeros = objetoScanner.nextInt();
            System.out.println(numeros + " "); 
            suma += numeros;
            contador++;
        }
        
        double media = (double) suma / contador;
        System.out.println("Suma: " + suma + "\n" + "Media: " + media);
    }  
}
