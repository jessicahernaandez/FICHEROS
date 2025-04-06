/*PRUEBA -> Para crear propias excepciones */
package Act_Aplicacion_10_11;

import java.io.*;
import java.util.Scanner;


public class FicheroUsuarioExcepcion {

    
    public static void main(String[] args) {
        
        BufferedReader lectura = null;
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Introduce un nombre de un fichero de texto: ");
            String fichero = sc.nextLine().trim();
            lectura = new BufferedReader (new FileReader(fichero));
            String linea = lectura.readLine();
            
            if (fichero.isEmpty()) {
                throw new SinEscrituraFichero();
            }
            
            while (linea != null) {
                System.out.println(linea);
                linea = lectura.readLine();
            }
            
                        
        } catch (SinEscrituraFichero ex) {
            System.out.println(ex);
        }  catch (FileNotFoundException ex) { 
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            
            if (lectura != null) {
                
                try {
                    lectura.close();
                    sc.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            
        }
    }
    
}
