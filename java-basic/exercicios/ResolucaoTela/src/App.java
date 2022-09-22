import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tela = tk.getScreenSize();

        System.out.println("Sua tela tem resolução " + tela.width + " x " + tela.height);
    }
}
