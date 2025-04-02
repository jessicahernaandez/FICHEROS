/**/
package Act_Propuesta_10_3;

import java.io.*;
import java.util.Scanner;

public class JugadoresScanner {

    public static void main(String[] args) {

        FileInputStream flujo = null;

        try {
            flujo = new FileInputStream("Jugadores.txt");
            Scanner objetoScanner = new Scanner(flujo);
            String[] nombres;
            int edad;
            double sumaEdad = 0;
            int contador = 0;
            double sumaEstatura = 0;
            double estaturas;
            while (objetoScanner.hasNextLine()) {
                String linea = objetoScanner.nextLine();
                String[] partes = linea.split(" ");
                String nombre = partes[0];
                edad = Integer.parseInt(partes[1]);
                estaturas = Double.parseDouble(partes[2]);

                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println("Estatura: " + estaturas);
                System.out.println();

                sumaEdad = sumaEdad + edad;
                sumaEstatura = sumaEstatura + estaturas;
                contador++;

                double mediaEdad = sumaEdad / contador;
                double mediaEstatura = sumaEstatura / contador;

                System.out.println("Media de edades: " + mediaEdad);
                System.out.println("Media de estaturas: " + mediaEstatura);
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}