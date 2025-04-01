/**/
package Act_Resuelta_10_2;

import java.io.FileReader;
import java.io.IOException;


public class FileReaderPrueba {

    
    public static void main(String[] args) {
        
        String texto = "";
        //Objeto de la clase FileReader
        //Lo leo caracter a caracter y devuelve '-1' cuando ya no tiene caracters por leer
        FileReader leeFichero = null;
        
        try {
            leeFichero = new FileReader("Luna.txt");
            int caracter = leeFichero.read();
            
            while (caracter != -1) {
                texto = texto + (char) caracter;
                caracter = leeFichero.read();
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
