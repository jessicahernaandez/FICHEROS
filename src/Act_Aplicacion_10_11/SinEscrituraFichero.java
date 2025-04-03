/**/
package Act_Aplicacion_10_11;


public class SinEscrituraFichero extends Exception {
    
    @Override
    public String toString() {
        return "No has introducido ningun nombre de fichero.";
    }
}
