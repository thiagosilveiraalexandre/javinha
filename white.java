import javax.swing.*;
import java.awt.Color;

public class white {

    public static void main(String[] args) {
        // Cria um frame
        JFrame frame = new JFrame("Olá, mundo!");

        // Define o tamanho da janela
        frame.setSize(300, 250);

        // Define a cor de fundo da janela
        frame.getContentPane().setBackground(Color.BLACK);

        // Cria um label
        JLabel label = new JLabel("Olá, mundo!");

        // Centraliza o label na janela
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        // Torna a mensagem opaca
        label.setOpaque(true);

        // Adiciona o label à janela
        frame.add(label);

        // Exibe a janela
        frame.setVisible(true);
    }
}
