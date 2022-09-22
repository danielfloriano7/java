import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale idioma = Locale.getDefault();

        System.out.println("Seu sistema está em " + idioma.getDisplayLanguage());
        System.out.println(idioma.getLanguage());
    }
}
