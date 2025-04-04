/**/
package Act_Aplicacion_10_11;

import java.io.*;
import java.util.Scanner;


public class FicheroUsuarioV1 {

    
    public static void main(String[] args) {
        
        BufferedReader lectura = null;
        Scanner sc = new Scanner(System.in);
        
        try {
            
            System.out.println("Introduce un fichero para leer: ");
            String fichero = sc.nextLine().trim();
            
            if (fichero.isEmpty()) {
                System.out.println("No has proporcionado un nombre de archivo.");
                System.out.println("Leyendo el fichero por defecto...");
                System.out.println("");
                fichero ="prueba.txt";
            }
            
            lectura = new BufferedReader(new FileReader(fichero));
            String linea = lectura.readLine();
            
            while (linea != null) {
                System.out.println(linea);
                linea = lectura.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally { //Cerrar fichero y scanner.
            
            if (lectura != null) {
                
                try {
                    lectura.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
        sc.close();
    }
    
}
