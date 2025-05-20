import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.Border;
import java.awt.*;

public class Cadastro extends JFrame {
    // Declaração dos componentes
    private JLabel nomeLabel, tipoLabel, paisLabel, palavraLabel;
    private JTextField nomeText;
    private JComboBox<String> paisCombo;

    public Cadastro() {
        super("Cadastro de Pessoa");
        createWindow();
    }

    private void createWindow() {
        JFrame frame = new JFrame("Cadastro Pessoa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    private void createUI(JFrame frame) {
        JPanel panel = new JPanel(null);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        palavraLabel = new JLabel("Cadastro de Pessoa");
        palavraLabel.setBounds(20, 0, 400, 60); 
        palavraLabel.setFont(new Font("SansSerif", Font.PLAIN, 32)); 
        palavraLabel.setForeground(new Color(255, 102, 0)); 
        panel.add(palavraLabel);
        frame.add(panel);
        tipoLabel = new JLabel("Tipo:");
        tipoLabel.setBounds(20, 60, 100, 25);
        tipoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        tipoLabel.setVerticalAlignment(SwingConstants.CENTER);
        tipoLabel.setBorder(blackline);
        panel.add(tipoLabel);
        frame.add(panel);
        String[] paises = { "Física", "Jurídica", };
        paisCombo = new JComboBox<>(paises);
        paisCombo.setBounds(140, 60, 100, 25);
        panel.add(paisCombo);
        frame.add(panel);
        nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(20, 100, 100, 30);
        nomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nomeLabel.setVerticalAlignment(SwingConstants.CENTER);
        nomeLabel.setBorder(blackline);
        panel.add(nomeLabel);
        frame.add(panel);
        nomeText = new JTextField();
        nomeText.setBounds(140, 100, 1130, 30);
        nomeText.setBorder(blackline);
        panel.add(nomeText);
        frame.add(panel);
    }

    public static void main(String[] args) {
        new Cadastro();
    }
}
