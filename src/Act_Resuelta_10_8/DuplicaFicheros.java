/**/
package Act_Resuelta_10_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class DuplicaFicheros {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero: ");
        String fichOriginal = sc.nextLine().trim();
        String fichCopia = "copia_de_" + fichOriginal;
        
        /*Declaramos en la sentencia de try el buffer para lectura y escritura*/
        try (BufferedReader lectura = new BufferedReader(new FileReader(fichOriginal));
            BufferedWriter escritura = new BufferedWriter (new FileWriter(fichCopia))) {
            
            int caracter = lectura.read(); //leemos del original
            
            while (caracter != -1) {
                escritura.write(caracter);
                caracter = lectura.read();
            }
            
            System.out.println("Copia creada con exito");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex ) {
            System.out.println(ex.getMessage());
        }     
    }
    
}
