import javax.swing.*;
import java.awt.*;

public class exercicio6 {
    static JLabel texto = new JLabel("Texto de exemplo", SwingConstants.CENTER);
    static JCheckBox negrito = new JCheckBox("Negrito");
    static JCheckBox italico = new JCheckBox("Itálico");
    static JRadioButton pequeno = new JRadioButton("Pequeno");
    static JRadioButton medio = new JRadioButton("Médio", true);
    static JRadioButton grande = new JRadioButton("Grande");

    static void atualizar() {
        int estilo = Font.PLAIN;
        if (negrito.isSelected()) estilo += Font.BOLD;
        if (italico.isSelected()) estilo += Font.ITALIC;

        int tamanho = 16;
        if (pequeno.isSelected()) tamanho = 12;
        if (grande.isSelected()) tamanho = 24;

        texto.setFont(new Font("Arial", estilo, tamanho));
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Preferências de Texto");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(pequeno);
        grupo.add(medio);
        grupo.add(grande);

        negrito.addActionListener(e -> atualizar());
        italico.addActionListener(e -> atualizar());
        pequeno.addActionListener(e -> atualizar());
        medio.addActionListener(e -> atualizar());
        grande.addActionListener(e -> atualizar());

        JPanel controles = new JPanel();
        controles.add(negrito);
        controles.add(italico);
        controles.add(pequeno);
        controles.add(medio);
        controles.add(grande);

        atualizar();
        f.add(texto, BorderLayout.CENTER);
        f.add(controles, BorderLayout.SOUTH);
        f.setSize(450, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}