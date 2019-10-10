import java.time.chrono.MinguoChronology;

import javax.swing.*;

public class GUI{
    public static Main app;
    public static JFrame mainWindow;
    public static void main(String[] args) {
        app = new Main();
        mainWindow = new JFrame("Quick Commands and Presets");
        mainWindow.setSize(750, 500);
        mainWindow.setVisible(true);
    }
}