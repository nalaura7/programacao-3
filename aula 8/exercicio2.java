import javax.swing.*;
import java.awt.*;

public class exercicio2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login");
        f.setLayout(new FlowLayout());

        JTextField usuario = new JTextField(15);
        JPasswordField senha = new JPasswordField(15);
        JButton entrar = new JButton("Entrar");

        entrar.addActionListener(e ->
            JOptionPane.showMessageDialog(f, "Bem-vindo, " + usuario.getText() + "!"));

        f.add(new JLabel("Usuário:"));
        f.add(usuario);
        f.add(new JLabel("Senha:"));
        f.add(senha);
        f.add(entrar);
        f.setSize(280, 180);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}