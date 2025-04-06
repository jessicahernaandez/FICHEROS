/**/
package Act_Aplicacion_10_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class ListasNumeros {

    public static void main(String[] args) {

        ArrayList<Integer> numerosIntro = new ArrayList<>();

        /*Flujos de Entrada que leeran los dos archivos y los guardara en una lista*/
        try (BufferedReader lectura1 = new BufferedReader(new FileReader("Numeros1.txt")); 
            BufferedReader lectura2 = new BufferedReader(new FileReader("Numeros2.txt"))) {

            String LeeNumeros = lectura1.readLine();
            while (LeeNumeros != null) {
                numerosIntro.add(Integer.valueOf(LeeNumeros));
                LeeNumeros = lectura1.readLine();
            }

            LeeNumeros = lectura2.readLine();
            while (LeeNumeros != null) {
                numerosIntro.add(Integer.valueOf(LeeNumeros));
                LeeNumeros = lectura2.readLine();
            }
            
            Comparator ordenNatural = Comparator.naturalOrder();
            numerosIntro.sort(ordenNatural);
            System.out.println("Numeros leidos y ordenados correctamente");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        /*Ahora que tenemos los numeros ordenamos, los introducimos a un nuevo archivo*/
        try (BufferedWriter escritura = new BufferedWriter(new FileWriter("ResultadoNumeros"))) {
            /*Bucle for-each para recorrer la lista*/
            for (Integer n : numerosIntro) {
                /*El metodo toString() de la clase Integer, convierte el entero a String*/
                escritura.write(n.toString());
                escritura.newLine();
            }
            
            System.out.println("Numeros guardados correctamente.");
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
