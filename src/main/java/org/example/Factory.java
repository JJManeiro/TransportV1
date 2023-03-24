package org.example;

import java.util.Scanner;

/**
 * Factory llamará a los transportes en su debido tiempo.
 */
public class Factory {
    /**
     * CAMION y BICI son int constantes los cuales se usarán para llamar a las clases después.
     */
public static final int CAMION = 1;
public static final int BICI = 2;

    /**
     * Producto es el método con el cual llamaremos a las 3 clases, este requiere 2 parámetros:
     * @param transporte usará las constantes ya dichas para llamar a las clases.
     * @param mensaje será el mensaje que aparecerá en muestra, método común de las 3 clases.
     * @return nada.
     */
public static Comun Producto (int transporte,String mensaje){
    /**
     * Una vez hayamos puesto los parámetros pedidos, pedirá 6 scanners.
     * @param sc será lo que llamará la clase @Class Scanner para usar sus métodos.
     * @param X indica que tan ancho es el paquete.
     * @param Y indica que tan alto es.
     * @param Z indica que tan grueso es.
     * @param W dice cuanto pesa en kilos.
     * @param op es la opción que pondremos para el tipo de embalaje que queremos que venga.
     * @param CP es tu código postal, este se usará para calcular los costes de entrega.
     * @return nada en verdad.
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("Como quieres que lo traigan?");
    int op = sc.nextInt();
    System.out.println("Cual es tu codigo postal?");
    int cp = sc.nextInt();
    System.out.println("Como fue el paquete de ancho?");
    float x = sc.nextFloat();
    System.out.println("de alto?");
    float y = sc.nextFloat();
    System.out.println("de grueso?");
    float z = sc.nextFloat();
    System.out.println("Cuanto pesa?");
    float w = sc.nextFloat();
    /**
     * A través de ifs llamaremos a los métodos.
     * @param transporte es el condicional que pondremos para llamar a cada método.
     * Si es Camión, llama a clase camión como objeto C y llama a los métodos que tiene camión.
     * Si es Bici, llama a clase bici como objeto B y llama a los métodos que tiene bici.
     */
            if (transporte==CAMION) {
                Camion C = new Camion(mensaje);
                C.muestra();
                C.embalaje(x,y,z,w,op);
                C.coste(cp);
            }
            else if(transporte==BICI) {
                Bici B = new Bici(mensaje);
                B.muestra();
                B.embalaje(x,y,z,w,op);
                B.coste(cp);
            }
            return null;
    }
}
