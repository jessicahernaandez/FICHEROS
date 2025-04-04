/**/
package Act_Aplicacion_10_17;

import java.io.*;
import java.util.Scanner;


public class LinuxProgram {

    
    public static void main(String[] args) {
        
        BufferedReader lectura = null;  
        int contadorLineas = 0;
        Scanner sc = new Scanner(System.in);
        
        try {
            lectura = new BufferedReader(new FileReader("SuperCola.java"));
            String linea = lectura.readLine();
            
            
            while (linea != null) {
                    System.out.println(linea);
                    contadorLineas++;
               
                    if (contadorLineas == 24) {
                        System.out.println("Introduce una letra para continuar: ");
                        sc.nextLine();
                        contadorLineas = 0;
                    }
                
                    linea = lectura.readLine();
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
        sc.close();
    }
    
}
