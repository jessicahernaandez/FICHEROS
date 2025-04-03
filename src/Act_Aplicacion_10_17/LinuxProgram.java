/**/
package Act_Aplicacion_10_17;

import java.io.*;
import java.util.Scanner;


public class LinuxProgram {

    
    public static void main(String[] args) {
        
        BufferedReader lectura = null;  
        int contadorLineas = 0;
        
        try {
            lectura = new BufferedReader(new FileReader("SuperCola.java"));
            String linea = lectura.readLine();
            
            
            while (linea != null) {
                if (contadorLineas <= 24) {
                    System.out.println(linea);
                    linea = lectura.readLine();
                    contadorLineas++;
                } else {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Introduce una letra para continuar: ");
                    linea = lectura.readLine();
                    contadorLineas = 0;
                }
            }
             

        } catch (IOException ex ) {
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
        
        System.out.println("Fin de la lectura del archivo");
    }
    
}
