import java.time.LocalDateTime;

/**
 * Una entrada con texto
 *
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor y un contenido.
 *
 *  @author DAM
 *  @version 1.0
 */
public class Entrada {
    // Usuario que crea la entrada.
    private String usuario;
    // Fecha de publicacion de la entrada.
    private LocalDateTime momentoPublicacion;
    // Numero de 'me gusta' de la entrada.
    private int cantidadMeGusta;


    public Entrada (String autor) {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }

    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void meGusta() {
        cantidadMeGusta += 1;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }


    /**
     * Devuelve la fecha de publicacion.
     * @return Devuelve la fecha de publicacion.
     */
    public String getMomentoPublicacion() {
        return "Escrito hace 10 minutos";
    }

    public String toString() {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";
        aDevolver += "Momento de publicacion: " + getMomentoPublicacion()+ "\n";

        return aDevolver;
    }


    public void mostrarDetallesPorPantalla() {
    }
}