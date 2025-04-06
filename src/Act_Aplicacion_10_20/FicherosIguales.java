/**/
package Act_Aplicacion_10_20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FicherosIguales {

    
    public static void main(String[] args) {
        
        int contadorLineas = 0;
        boolean sonIguales = true;
        
        try (BufferedReader lectura1 = new BufferedReader(new FileReader("Texto1.txt"));
            BufferedReader lectura2 = new BufferedReader(new FileReader("Texto3.txt"))) {
            
            String linea1 = lectura1.readLine();
            String linea2 = lectura2.readLine();
            contadorLineas++;
            
            while (linea1 != null && linea2 != null) {
                
                
                if(!linea1.equals(linea2)) {
                    sonIguales = false;
                    
                    System.out.println(linea1);
                    System.out.println(linea2);
                    
                    for (int i = 0; i < linea1.length() && i < linea2.length(); i++) {
                        if (linea1.charAt(i) != linea2.charAt(i)) {
                            System.out.println("Diferencia en la linea: " + contadorLineas + ", caracter: " + linea2.charAt(i));
                        }
                    }
                }
                
                linea1 = lectura1.readLine();
                linea2 = lectura2.readLine();
                contadorLineas++;
            }
            
            if (sonIguales) {
                System.out.println("Los archivos son iguales.");
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
