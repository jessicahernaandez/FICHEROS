/**/
package Actividad_Resuelta_10_6;

import java.io.*;
import java.util.Scanner;


public class EnterosScanner {

    
    public static void main(String[] args) {
        
        FileInputStream lectura = null;
        int suma = 0;
        int contadorNum = 0;
        int num;
        
        try {
            lectura = new FileInputStream ("Enteros.txt");
            Scanner sc = new Scanner(lectura);
            System.out.println("Numeros: ");
            
            while (sc.hasNextInt()) { //Mientras hayan numeros enteros
                num = sc.nextInt();
                System.out.println( num + " ");
                suma += num;
                contadorNum++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Suma: " + suma);
        double media = (double) suma / contadorNum;
        System.out.println("Media: " + media);
        
        /*Cerramos el flujo*/
        if (lectura != null) {
            
            try {
                lectura.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
}
