package geekbrains.calculator.gui_core;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 300, 400, 500);
        CalcPanel panel = new CalcPanel();
        add(panel);



        setVisible(true);
    }


}
