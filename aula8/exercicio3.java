import javax.swing.*;
import java.awt.*;

public class exercicio3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculadora");
        f.setLayout(new FlowLayout());

        JTextField n1 = new JTextField(6);
        JTextField n2 = new JTextField(6);
        JComboBox<String> op = new JComboBox<>(
            new String[]{"somar", "subtrair", "multiplicar", "dividir"});
        JCheckBox popup = new JCheckBox("Mostrar em JOptionPane");
        JButton calcular = new JButton("Calcular");
        JLabel resultado = new JLabel("Resultado: ");

        calcular.addActionListener(e -> {
            try {
                double a = Double.parseDouble(n1.getText());
                double b = Double.parseDouble(n2.getText());
                double r = 0;
                String o = (String) op.getSelectedItem();

                if (o.equals("somar")) r = a + b;
                else if (o.equals("subtrair")) r = a - b;
                else if (o.equals("multiplicar")) r = a * b;
                else {
                    if (b == 0) {
                        JOptionPane.showMessageDialog(f, "Divisão por zero!");
                        return;
                    }
                    r = a / b;
                }

                if (popup.isSelected())
                    JOptionPane.showMessageDialog(f, "Resultado: " + r);
                else
                    resultado.setText("Resultado: " + r);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(f, "Digite números válidos!");
            }
        });

        f.add(n1);
        f.add(op);
        f.add(n2);
        f.add(popup);
        f.add(calcular);
        f.add(resultado);
        f.setSize(350, 160);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}