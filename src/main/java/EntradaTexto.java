
/**
 * Una entrada con texto
 *
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor y un contenido.
 *
 *  @author DAM
 *  @version 1.0
 */

public class EntradaTexto extends EntradaConComentario
{

    // Contenido de la entrada.
    private String mensaje;


    /**
     * Constructor - Construye entradas a partir de un autor y un contenido.
     * Las entradas se crean sin ningun ' me gusta'.
     * La fecha de publicacion coincide con el momento en el que se crea la entrada.
     */
    public EntradaTexto (String texto, String autor) {
        super(autor);
        mensaje = texto;

    }





    /**
     * Devuelve el contenido de la entrada.
     * @return Devuelve el contenido de la entrada.
     */
    public String getMensaje() {
        return mensaje;
    }

    public void mostrarAutorYMensaje() {
        System.out.println("Usuario: " + getUsuario() + "\n" + "Mensaje: " + mensaje);
    }

    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {
        String aDevolver = super.toString();;

        aDevolver += mensaje + "\n";
        return aDevolver.substring(0, aDevolver.length() - 1);
    }

    public void mostrarDetallesPorPantalla() {
        System.out.println("Mensaje: " + mensaje);
    }
}