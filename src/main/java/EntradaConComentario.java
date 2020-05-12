import java.util.ArrayList;

public class EntradaConComentario extends Entrada {
    // Comentarios de la entrada.
    private ArrayList<String> comentarios;
    public EntradaConComentario(String autor) {
        super(autor);
        comentarios = new ArrayList<>();
    }
    /**
     * Anade un comentario a a la entrada.
     * @param text El comentario a anadir.
     */
    public void addComentario(String text) {
        comentarios.add(text);
    }

    public String getComentarios() {
        String listaComentarios = "";
        if(!comentarios.isEmpty()) {
            for(String comentario : comentarios) {
                listaComentarios += comentario;
            }
        }
        else {
            listaComentarios= "No hay comentarios";
        }
        return listaComentarios;
    }

    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString() {
        String aDevolver = super.toString();;

        aDevolver += "Comentarios: " + getComentarios() + "\n";
        return aDevolver;
    }
}
