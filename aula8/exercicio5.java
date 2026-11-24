import javax.swing.*;
import java.awt.*;

public class exercicio5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Cadastro");

        JTextField nome = new JTextField();
        JTextField email = new JTextField();
        JTextField telefone = new JTextField();

        JPanel campos = new JPanel(new GridLayout(3, 2));
        campos.add(new JLabel("Nome:"));
        campos.add(nome);
        campos.add(new JLabel("E-mail:"));
        campos.add(email);
        campos.add(new JLabel("Telefone:"));
        campos.add(telefone);

        JButton salvar = new JButton("Salvar");
        JButton limpar = new JButton("Limpar");

        salvar.addActionListener(e -> JOptionPane.showMessageDialog(f,
            "Nome: " + nome.getText() + "\nE-mail: " + email.getText()
            + "\nTelefone: " + telefone.getText()));

        limpar.addActionListener(e -> {
            nome.setText("");
            email.setText("");
            telefone.setText("");
        });

        JPanel botoes = new JPanel(new FlowLayout());
        botoes.add(salvar);
        botoes.add(limpar);

        f.add(campos, BorderLayout.CENTER);
        f.add(botoes, BorderLayout.SOUTH);
        f.setSize(300, 180);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}