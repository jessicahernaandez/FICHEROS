/*Copiar el texto de 'Texto1.txt' para el ejercicio de la Act_Aplicacio_10_20 y
comprobar si son iguales*/
package Act_Aplicacion_10_20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopiaArchivo {

    
    public static void main(String[] args) {
        
        try (BufferedReader lectura = new BufferedReader(new FileReader("Texto1.txt"));
            BufferedWriter escritura = new BufferedWriter(new FileWriter("Texto2.txt"))) {
            
            String linea = lectura.readLine();
            
            while (linea != null) {
                escritura.write(linea);
                escritura.newLine();
                linea = lectura.readLine();
            }
            
            System.out.println("Fichero creado y copiado correctamente");
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
