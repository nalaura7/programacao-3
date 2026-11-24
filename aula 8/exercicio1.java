import javax.swing.*;
import java.awt.*;

public class exercicio1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("blablabla");
        JLabel label = new JLabel("Bem-vindo!", SwingConstants.CENTER);
        JButton fechar = new JButton("fechar");

        fechar.addActionListener(e -> f.dispose());

        f.add(label, BorderLayout.CENTER);
        f.add(fechar, BorderLayout.SOUTH);
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}