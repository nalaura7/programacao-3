import javax.swing.*;
import java.awt.*;

public class exercicio7 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu de Aplicação");
        JTextField campo = new JTextField();
        campo.setEditable(false);

        JMenuBar barra = new JMenuBar();

        JMenu arquivo = new JMenu("Arquivo");
        JMenuItem novo = new JMenuItem("Novo");
        JMenu abrir = new JMenu("Abrir");
        JMenuItem recente = new JMenuItem("Recente");
        JMenuItem disco = new JMenuItem("Do disco");
        JMenuItem sair = new JMenuItem("Sair");

        abrir.add(recente);
        abrir.add(disco);
        arquivo.add(novo);
        arquivo.add(abrir);
        arquivo.add(sair);

        JMenu ajuda = new JMenu("Ajuda");
        JMenuItem sobre = new JMenuItem("Sobre");
        ajuda.add(sobre);

        barra.add(arquivo);
        barra.add(ajuda);

        novo.addActionListener(e -> campo.setText("Novo"));
        recente.addActionListener(e -> campo.setText("Abrir > Recente"));
        disco.addActionListener(e -> campo.setText("Abrir > Do disco"));
        sobre.addActionListener(e -> campo.setText("Sobre"));
        sair.addActionListener(e -> {
            int r = JOptionPane.showConfirmDialog(f, "Deseja sair?", "Sair",
                JOptionPane.YES_NO_OPTION);
            if (r == JOptionPane.YES_OPTION) System.exit(0);
        });

        f.setJMenuBar(barra);
        f.add(campo, BorderLayout.NORTH);
        f.setSize(350, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}