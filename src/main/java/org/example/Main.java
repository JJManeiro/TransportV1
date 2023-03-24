package org.example;
import javax.swing.JOptionPane;

/**
 * @author juan
 * @version 17.3.2023
 * Main es la clase principal que llamará al patrón Factory.
 */
public class Main {
    /**
     * @param Salida viene de la interfaz Común,este será usado para llamar a los métodos de la clase Factory sin problemas.
     * Factory tiene un método llamado producto,este requiere un int y un string como mensaje para ser llamado.
     */
    static Comun salida;
    public static void main (String[]args){
        salida = Factory.Producto(Factory.BICI,"cogiste la bici.");
        salida = Factory.Producto(Factory.CAMION,"cogiste el camión.");
        }
    }