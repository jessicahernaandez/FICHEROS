/**/
package Act_Aplicacion_10_12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DatosUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine().trim();

        int edad = 0;
        boolean datosValidos = false;

        try {
            System.out.println("Introduce tu edad: ");
            edad = sc.nextInt();
            if (edad < 0) {
                throw new ExcepcionEdadNegativa();
            }

            datosValidos = true;

        } catch (ExcepcionEdadNegativa e) {
            System.out.println(e);
            sc.nextLine(); //Limpiar el bufer
        }

        if (datosValidos) {
            try (BufferedWriter escritura = new BufferedWriter(new FileWriter("datos.txt", true))) {

                String UsuarioDatos = nombre + " " + edad;
                escritura.write(UsuarioDatos);
                escritura.newLine();
                System.out.println("Datos introducidos correctamente.");

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } finally {
                sc.close();
            }

        }
        
        System.out.println("Error al introducir datos");
    }

}
