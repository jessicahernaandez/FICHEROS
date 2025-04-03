/*Prueba capturando los String con Arrays*/
package Act_Propuesta_10_3;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class JugadorScannerV2 {

    public static void main(String[] args) {

        BufferedReader lectura = null;
        int sumaEdad = 0;
        int sumaEstatura = 0;
        int contEdad = 0;
        int contEstatura = 0;
        String[] lineas = null;

        try {
            lectura = new BufferedReader(new FileReader("Jugadores.txt"));
            String linea = lectura.readLine();

            while (linea != null) {
                Scanner sc = new Scanner(linea).useLocale(Locale.US);
                if (sc.hasNext()) {                   
                    lineas = sc.next().split(" ");
                    System.out.println("Nombre: " + Arrays.toString(lineas));
                    int edad = sc.nextInt();
                    System.out.println("Edad : " + edad);
                    sumaEdad += edad;
                    contEdad++;
                    double estatura = sc.nextDouble();
                    System.out.println("Estatura: " + estatura);
                    sumaEstatura += estatura;
                    contEstatura++;
                }
                
                linea = lectura.readLine();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (lectura != null) {
                try {
                    lectura.close();

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
        System.out.println("Suma Edades: " + sumaEdad);
        double mediaEdades = (double) sumaEdad / contEdad;
        System.out.println("Media Edades: " + mediaEdades);

        System.out.println("Suma Estaturas: " + sumaEstatura);
        double mediaEstatura = sumaEstatura / contEstatura;
        System.out.println("Media Estatura: " + mediaEstatura);
    }

}
