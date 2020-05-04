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

        muro.addEntradaTexto(entrada01);
        muro.addEntradaFoto(entrada02);
        muro.addEntradaTexto(entrada03);
        muro.addEntradaFoto(entrada04);

        assertEquals(
                "Usuario: Nacho\nLikes: 0\nRecién llegado de mis vacaciones en Hawai!\nEscrito hace 10 minutos\n"+
                "Usuario: Begoña\nLikes: 0\nEstá lloviendo ahí fuera...\nEscrito hace 10 minutos\n" +
                "Usuario: Luis\nLikes: 0\nUrl: https://bit.ly/2W1dO09\nTitulo: Gracias\nEscrito hace 10 minutos\n" +
                "Usuario: Cristina\nLikes: 0\nUrl: https://bit.ly/3cY9vtD\nTitulo: Una foto de mi nevera\nEscrito hace 10 minutos"
                , muro.toString());


        System.out.println(muro);

    }


}
