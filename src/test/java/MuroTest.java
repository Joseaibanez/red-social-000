import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de test para el muro de la red social
 *
 *  @author DAM
 *  @version 1.0
 */
public class MuroTest {
    @Test
    public void test01() {

        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Recién llegado de mis vacaciones en Hawai!", "Nacho");
        EntradaFoto entrada02 = new EntradaFoto("https://bit.ly/2W1dO09", "Gracias", "Luis");
        EntradaTexto entrada03 = new EntradaTexto("Está lloviendo ahí fuera...", "Begoña");
        EntradaFoto entrada04 = new EntradaFoto("https://bit.ly/3cY9vtD", "Una foto de mi nevera", "Cristina");
        EntradaEvento evento01 = new EntradaEvento("Nacho se ha unido al grupo Dam1", "Nacho");
        EntradaEvento evento02 = new EntradaEvento("Cristina ha cambiado su foto de perfil", "Cristina");

        muro.addEntrada(entrada01);
        entrada01.addComentario("¡Vuelta a la rutina!");
        muro.addEntrada(entrada02);
        muro.addEntrada(entrada03);
        muro.addEntrada(entrada04);
        entrada04.addComentario("Deberías mandarla a arreglar...");
        muro.addEntrada(evento01);
        muro.addEntrada(evento02);

        assertEquals(
                "Usuario: Nacho\nLikes: 0\nMomento de publicacion: Escrito hace 10 minutos\nComentarios: ¡Vuelta a la rutina!\nRecién llegado de mis vacaciones en Hawai!\n"+
                        "Usuario: Luis\nLikes: 0\nMomento de publicacion: Escrito hace 10 minutos\nComentarios: No hay comentarios\nUrl: https://bit.ly/2W1dO09\nTitulo: Gracias\n" +
                "Usuario: Begoña\nLikes: 0\nMomento de publicacion: Escrito hace 10 minutos\nComentarios: No hay comentarios\nEstá lloviendo ahí fuera...\n" +
                "Usuario: Cristina\nLikes: 0\nMomento de publicacion: Escrito hace 10 minutos\nComentarios: Deberías mandarla a arreglar...\nUrl: https://bit.ly/3cY9vtD\nTitulo: Una foto de mi nevera\n" +
                        "Usuario: Nacho\nLikes: 0\nMomento de publicacion: Escrito hace 10 minutos\nNacho se ha unido al grupo Dam1\n" +
                        "Usuario: Cristina\nLikes: 0\nMomento de publicacion: Escrito hace 10 minutos\nCristina ha cambiado su foto de perfil"
                , muro.toString());


        System.out.println(muro);

        System.out.println("PRUEBA DEL METODO PARA MOSTRAR TODOS LOS DETALLES" + "\n");
        muro.mostrarDetallesTodasLasEntradas();

    }
}
