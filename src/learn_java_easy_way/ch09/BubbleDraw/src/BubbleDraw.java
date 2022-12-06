package learn_java_easy_way.ch09.BubbleDraw.src;

import javax.swing.*;
import java.awt.*;

public class BubbleDraw extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BubbleDraw App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BubblePanel());
        frame.setSize(new Dimension(600, 400));
        frame.setVisible(true);
    }
}
