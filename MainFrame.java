import javax.swing.JFrame;

public class MainFrame extends JFrame {
    public MainFrame(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame("Welcome", 400, 400);
    }
}