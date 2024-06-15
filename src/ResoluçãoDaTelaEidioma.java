import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class ResoluçãoDaTelaEidioma {

    public static void main(String[] args) {
        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();

        System.out.println("A hora do sistema é ");
        System.out.println(relogio.toString());
        System.out.println("O idioma do sistema é ");
        System.out.println(idioma.getDisplayLanguage());
        System.out.println("A resolução da tela é ");
        System.out.println(resolucao.width + " x " + resolucao.height);
    }
}
