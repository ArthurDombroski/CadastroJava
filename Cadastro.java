import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Cadastro extends JFrame {
    // Declaração dos componentes
    private JLabel nomeLabel, tipoLabel, paisLabel, palavraLabel, rgLabel, orgaoLabel, cpfLabel, fornecedorLabel, emailLabel;
    private JTextField nomeText, rgText, orgaoText, cpfText;
    private JComboBox<String> paisCombo;
    private JCheckBox fornecedorCheck;

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
        tipoLabel.setBounds(20, 60, 100, 30);
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
        rgLabel = new JLabel("RG/Inscrição Estadual:");
        rgLabel.setBounds(20, 140, 100, 30);
        rgLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rgLabel.setVerticalAlignment(SwingConstants.CENTER);
        rgLabel.setBorder(blackline);
        panel.add(rgLabel);
        frame.add(panel);
        rgText = new JTextField();
        rgText.setBounds(140, 140, 500, 30);
        rgText.setBorder(blackline);
        panel.add(rgText);
        frame.add(panel);
        orgaoLabel = new JLabel("Orgão Expeditor:");
        orgaoLabel.setBounds(650, 140, 100, 30);
        orgaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        orgaoLabel.setVerticalAlignment(SwingConstants.CENTER);
        orgaoLabel.setBorder(blackline);
        panel.add(orgaoLabel);
        frame.add(panel);
        orgaoText = new JTextField();
        orgaoText.setBounds(760, 140, 500, 30);
        panel.add(orgaoText);
        frame.add(panel);
        cpfLabel = new JLabel("CPF/CNPJ:");
        cpfLabel.setBounds(260, 60, 100, 30);
        cpfLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cpfLabel.setVerticalAlignment(SwingConstants.CENTER);
        cpfLabel.setBorder(blackline);
        panel.add(cpfLabel);
        frame.add(panel);
        cpfText = new JTextField();
        cpfText.setBounds(380, 60, 500, 30);
        panel.add(cpfText);
        frame.add(panel);
        fornecedorLabel = new JLabel("Fornecedor");
        fornecedorLabel.setBounds(900, 60, 100, 30);
        fornecedorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        fornecedorLabel.setVerticalAlignment(SwingConstants.CENTER);
        fornecedorLabel.setBorder(blackline);
        panel.add(fornecedorLabel);
        frame.add(panel);
        fornecedorCheck = new JCheckBox();
        fornecedorCheck.setBounds(1020, 60, 100, 30);
        panel.add(fornecedorCheck);
        frame.add(panel);
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(20, 140, 100, 30);
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setVerticalAlignment(SwingConstants.CENTER);
        emailLabel.setBorder(blackline);
        panel.add(emailLabel);
        frame.add(panel);

        
    }

    public static void main(String[] args) {
        new Cadastro();
    }
}
