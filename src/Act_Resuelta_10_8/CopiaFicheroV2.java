/*Try con dos sentencias de flujos -> Uno de entrada y otro de salida*/
package Act_Resuelta_10_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CopiaFicheroV2 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero a copia: ");
        String ficheroOriginal = sc.nextLine().trim();
        
        String ficheroCopia = "copia_de_" + ficheroOriginal;
        
        /*Declaramos e inicializamos los dos flujos que ocuparemos en el bloque try
        Entrada -> Para leer el texto de la copia.
        Salida -> Para ir escribiendo lo que se lee en el fichero en el nuevo.*/
        try (BufferedReader lectura = new BufferedReader(new FileReader(ficheroOriginal));
        BufferedWriter escritura = new BufferedWriter(new FileWriter(ficheroCopia))) {
            
            int caracter = lectura.read();
            
            while (caracter != -1) {
                escritura.write(caracter);
                caracter = lectura.read();
            }
            
            System.out.println("Copia realizada correctamente");
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
