import javax.swing.JFrame;
import java.awt.*;

public class Main extends JFrame {
    static JFrame F = new Main();
    Screen screen = new Screen();

    public Main()
    {
        add(screen);
        setUndecorated(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
    }
    public static void main(String[] args) {
        System.out.println("Running...");
    }
}