package org.example;

/**
 * Común es una interfaz, en ella habrá 3 métodos comunes para las clases de barco,bici y camión.
 */
public interface Comun {
    /**
     * Embalaje es un método abstracto que requiere 5 parámetros.
     * @param X indica que tan ancho es el paquete.
     * @param Y indica que tan alto es.
     * @param Z indica que tan grueso es.
     * @param W dice cuanto pesa en kilos.
     * @param op es la opción que pondremos para el tipo de embalaje que queremos que venga.
     * @return nada en verdad, bien a gusto podría ser void como los otros.
     */
    Comun embalaje(Float X, Float Y, Float Z, Float W, int op);

    /**
     * Coste indica cuanto costó la entrega.
     * @param CP es tu código postal, este se usará para calcular los costes de entrega.
     */
    void coste(Integer CP);

    /**
     * Muestra mostrará en primera línea el mensaje que hayamos dejado en el metodo main a la hora de llamarlo.
     */
    void muestra();
}
