import javax.swing.*;
import java.awt.*;

public class exercicio4 {
    static int valor = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame("Contador");
        f.setLayout(new FlowLayout());

        JLabel label = new JLabel("0");
        JButton mais = new JButton("+1");
        JButton menos = new JButton("-1");
        JButton zerar = new JButton("Zerar");
        menos.setEnabled(false);

        mais.addActionListener(e -> {
            valor++;
            label.setText("" + valor);
            menos.setEnabled(valor > 0);
        });
        menos.addActionListener(e -> {
            valor--;
            label.setText("" + valor);
            menos.setEnabled(valor > 0);
        });
        zerar.addActionListener(e -> {
            valor = 0;
            label.setText("0");
            menos.setEnabled(false);
        });

        f.add(label);
        f.add(mais);
        f.add(menos);
        f.add(zerar);
        f.setSize(250, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}