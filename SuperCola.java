/*FIFO*/
package Act_Aplicacion_12_20;

import java.util.ArrayList;

public class SuperCola<T> {

    //Objetos de la Cola
    ArrayList<T> colaUno = new ArrayList<>();
    ArrayList<T> colaDos = new ArrayList<>();

    /*Metodo de encolar para COLAUNO
    -> Añade un elemento al final de la lista*/
    public void encolarUNO(T elemento) {
        colaUno.add(elemento);
    }

    /*Metodo de encolar para COLADOS
    -> Añade un elemento al final de la lista*/
    public void encolarDOS(T elemento) {
        colaDos.add(elemento);
    }

    /*Metodo de desencolar para COLAUNO
    -> Saca elementos al principio de la lista*/
    public T desencolarUNO() {
        T elementoDevolver = null;
        
        if (colaUno.size() > 0) {
            elementoDevolver = colaUno.remove(0);
        } else {
            System.out.println("No hay elementos a desencolar en Cola1 \n Desencolando cola Dos...");
            elementoDevolver = colaDos.remove(0);
        }

        return elementoDevolver;
    }

    /*Metodo de desencolar para COLADOS
    -> Saca elementos al principio de la lista*/
    public T desencolarDOS() {
        T elementoDevolver = null;

        if (colaDos.size() > 0) {
            elementoDevolver = colaDos.remove(0);
        } else {
            System.out.println("No hay elementos a desencolar en Cola2 \n Desencolando cola Uno...");
            elementoDevolver = colaUno.remove(0);
        }

        return elementoDevolver;
    }

    /*Metodo toString*/
    @Override
    public String toString() {
        return "Cola 1: " + colaUno + "\n" + "Cola 2: " + colaDos;
    }
}
