import java.util.ArrayList;

/**
 * El muro de nuestra red social.
 *
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author DAM
 * @version 1.0
 */
public class Muro
{
    // Entradas de texto
    private ArrayList <Entrada> entradas;

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro() {
        //Inicializa mensajes y fotos.
        entradas = new ArrayList<>();
    }

    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }



    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString() {
        String aDevolver = "";

        // Buscamos todas las entradas de texto.
        for (Entrada entrada : entradas) {
            aDevolver += entrada + "\n";
        }

        return aDevolver.substring(0, aDevolver.length() - 1);
    }

    public void mostrarDetallesTodasLasEntradas() {
        for (Entrada entradaActual : entradas) {
            entradaActual.mostrarDetallesPorPantalla();
        }
    }
}

