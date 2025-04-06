/**/
package Act_Aplicacion_10_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerCarta {

    public static void main(String[] args) {

        int contadorLineas = 0;
        int contadorCaracteres = 0;
        int contadorPalabras = 0;
        
        try (BufferedReader lectura = new BufferedReader(new FileReader("carta.txt"))){
            String linea = lectura.readLine();
            
            while (linea != null) {
                contadorLineas++;
                
                //Contamos la longitud de la linea para saber los caracteres (contando los blancos).
                contadorCaracteres += linea.length();
                
                if (!linea.trim().isEmpty()) {
                    String [] palabras = linea.split(" ");
                    //Bucle for para recorrer el array.
                    for (String palabra : palabras) {
                        if (palabra != null) {
                            contadorPalabras++;
                            /*
                            //Si quisieramos solo contar los caracteres sin los blancos:
                            contadorCaracteres += palabra.length();
                            */
                        }
                    }
                }
                
                System.out.println(linea);
                linea = lectura.readLine();
                
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Lineas: " + contadorLineas);
        System.out.println("Palabras: " + contadorPalabras);
        System.out.println("Caracteres: " + contadorCaracteres);

    }
}