/* */
package Act_Resuelta_10_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderPrueba {

    
    public static void main(String[] args) {
        
        String texto = "";
        BufferedReader leeFichero = null;
        
        try {
            leeFichero = new BufferedReader (new FileReader("Luna.txt"));
            String linea = leeFichero.readLine();
            
            while (linea != null) {
                texto = texto + linea + "\n";
                linea = leeFichero.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (leeFichero != null) {
                
                try {
                    leeFichero.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
        System.out.println(texto);
    }
    
}
