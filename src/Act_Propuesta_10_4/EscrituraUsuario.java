/**/
package Act_Propuesta_10_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabraFinal = "fin";
        String lineaUsuario = null;

        try (BufferedWriter escritura = new BufferedWriter(new FileWriter("Archivo_Usuario.txt"))) {

            System.out.println("Introduce una linea de texto: ");

            while (!palabraFinal.equalsIgnoreCase(lineaUsuario)) {
                lineaUsuario = sc.nextLine().trim();

                if (!lineaUsuario.equalsIgnoreCase("fin")) {
                    escritura.write(lineaUsuario);
                    escritura.newLine();
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
