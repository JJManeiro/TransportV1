package org.example;

/**
 * Bici usa la interfaz común, la cual llamará a los 3 métodos comunes que usa.
 */
public class Bici implements Comun {
    /**
     * @param mensaje es el mensaje que pondremos en la main.
     */
    private String mensaje;
    /**
     *Constructor por defecto.
     * @param mensaje es requerido.
     */
    public Bici(String mensaje) {
        this.mensaje = mensaje;
    }
    /**
     * Embalaje pide 5 parámetros:
     * @param X indica que tan ancho es el paquete.
     * @param Y indica que tan alto es.
     * @param Z indica que tan grueso es.
     * @param W dice cuanto pesa en kilos.
     * @param op es la opción que pondremos para el tipo de embalaje que queremos que venga.
     * Si op vale 0,será un pallet.Si op vale 1,será un cartón. Si op vale 2,será una caja de madera.
     * @return nada.
     */
    public Comun embalaje(Float X, Float Y, Float Z, Float W, int op) {
        System.out.print("Acá esta tu paquete de "+X+" de ancho,"+Y+" cm de alto y "+Z+" de grueso.\nCuyo peso es "+W+" kilos y fue traído en ");
        if (op==0)
            System.out.print("pallet");
        else if (op==1)
            System.out.print("carton");
        else if (op==2)
            System.out.print("caja de madera");
        return null;
    }
    /**
     * Coste requiere del Integer CP.
     * @param CP es tu código postal, este se usará para calcular los costes de entrega.
     * En el caso del barco,este se calcula dividiendo el CP en 0,6.
     */
    @Override
    public void coste(Integer CP) {
        System.out.println("\nEl precio total es de "+(CP/1.8)+" €");
    }
    /**
     * dirá el @param mensaje por pantalla.
     */
    @Override
    public void muestra() {
        System.out.println(mensaje);
    }
}
