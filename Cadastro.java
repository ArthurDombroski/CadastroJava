import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Cadastro extends JFrame {
    // Declaração dos componentes
    private JLabel situacaoLabel, telefoneLabel, bairroLabel, complementoLabel, numeroLabel, logradouroLabel, nomeLabel,
            ufLabel, tipoLabel, palavraLabel, rgLabel, orgaoLabel, cpfLabel, fornecedorLabel, emailLabel, cepLabel,
            paisLabel, municipioLabel;
    private JTextField telefoneText, bairroText, complementoText, numeroText, logradouroText, ufText, municipioText,
            paisText, nomeText, rgText, orgaoText, cpfText, emailText, cepText, siglaText;
    private JComboBox<String> paisCombo;
    private JCheckBox fornecedorCheck;
    private JRadioButton ativoRadio, inativoRadio;
    private ButtonGroup situacaoGroup;
    private JButton cadastrarButton, excluirButton, limparButton;

    public Cadastro() {
        super("Cadastro de Pessoa");
        createWindow();
    }

    // Método para limpar os campos preenchidos
    private void limparCampos() {
        nomeText.setText("");
        rgText.setText("");
        orgaoText.setText("");
        cpfText.setText("");
        emailText.setText("");
        cepText.setText("");
        paisText.setText("BRASIL");
        ufText.setText("");
        municipioText.setText("");
        municipioText.setEnabled(false);
        logradouroText.setText("");
        numeroText.setText("");
        complementoText.setText("");
        bairroText.setText("");
        telefoneText.setText("");
        paisCombo.setSelectedIndex(0);
        fornecedorCheck.setSelected(false);
        situacaoGroup.clearSelection();
    }

    private void createWindow() {
        JFrame frame = new JFrame("Cadastro Pessoa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //Abre a tela maximizada
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
        emailLabel.setBounds(20, 180, 100, 30);
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setVerticalAlignment(SwingConstants.CENTER);
        emailLabel.setBorder(blackline);
        panel.add(emailLabel);
        frame.add(panel);
        emailText = new JTextField();
        emailText.setBounds(140, 180, 500, 30);
        emailText.setBorder(blackline);
        panel.add(emailText);
        frame.add(panel);
        cepLabel = new JLabel("CEP");
        cepLabel.setBounds(650, 180, 100, 30);
        cepLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cepLabel.setVerticalAlignment(SwingConstants.CENTER);
        cepLabel.setBorder(blackline);
        panel.add(cepLabel);
        frame.add(panel);
        cepText = new JTextField();
        cepText.setBounds(760, 180, 500, 30);
        panel.add(cepText);
        frame.add(panel);
        paisLabel = new JLabel("País");
        paisLabel.setBounds(20, 220, 100, 30);
        paisLabel.setHorizontalAlignment(SwingConstants.CENTER);
        paisLabel.setVerticalAlignment(SwingConstants.CENTER);
        paisLabel.setBorder(blackline);
        panel.add(paisLabel);
        frame.add(panel);
        paisText = new JTextField();
        paisText.setBounds(140, 220, 500, 30);
        paisText.setBorder(blackline);
        panel.add(paisText);
        frame.add(panel);
        paisText.setText("BRASIL");
        //paisText.setEnabled(false);
        paisText.setBackground(Color.LIGHT_GRAY);
        paisText.setHorizontalAlignment(SwingConstants.CENTER);
        paisText.setForeground(Color.BLACK);
        ufLabel = new JLabel("UF");
        ufLabel.setBounds(650, 220, 100, 30);
        ufLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ufLabel.setVerticalAlignment(SwingConstants.CENTER);
        ufLabel.setBorder(blackline);
        panel.add(ufLabel);
        frame.add(panel);
        ufText = new JTextField();
        ufText.setBounds(760, 220, 150, 30);
        panel.add(ufText);
        frame.add(panel);
        siglaText = new JTextField();
        siglaText.setBounds(920, 220, 340, 30);
        siglaText.setEnabled(false);
        siglaText.setBackground(Color.LIGHT_GRAY);
        panel.add(siglaText);
        frame.add(panel);
        municipioLabel = new JLabel("Município");
        municipioLabel.setBounds(20, 260, 100, 30);
        municipioLabel.setHorizontalAlignment(SwingConstants.CENTER);
        municipioLabel.setVerticalAlignment(SwingConstants.CENTER);
        municipioLabel.setBorder(blackline);
        panel.add(municipioLabel);
        frame.add(panel);
        municipioText = new JTextField();
        municipioText.setBounds(140, 260, 1130, 30);
        municipioText.setBorder(blackline);
        municipioText.setBackground(Color.LIGHT_GRAY);
        panel.add(municipioText);
        frame.add(panel);
        municipioText.setEnabled(false); // Não permite interagir com o campo
        logradouroLabel = new JLabel("Logradouro");
        logradouroLabel.setBounds(20, 300, 100, 30);
        logradouroLabel.setHorizontalAlignment(SwingConstants.CENTER);
        logradouroLabel.setVerticalAlignment(SwingConstants.CENTER);
        logradouroLabel.setBorder(blackline);
        panel.add(logradouroLabel);
        frame.add(panel);
        logradouroText = new JTextField();
        logradouroText.setBounds(140, 300, 1130, 30);
        logradouroText.setBorder(blackline);
        panel.add(logradouroText);
        frame.add(panel);
        numeroLabel = new JLabel("Número");
        numeroLabel.setBounds(20, 340, 100, 30);
        numeroLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numeroLabel.setVerticalAlignment(SwingConstants.CENTER);
        numeroLabel.setBorder(blackline);
        panel.add(numeroLabel);
        frame.add(panel);
        numeroText = new JTextField();
        numeroText.setBounds(140, 340, 500, 30);
        numeroText.setBorder(blackline);
        panel.add(numeroText);
        frame.add(panel);
        complementoLabel = new JLabel("Complemento");
        complementoLabel.setBounds(650, 340, 100, 30);
        complementoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        complementoLabel.setVerticalAlignment(SwingConstants.CENTER);
        complementoLabel.setBorder(blackline);
        panel.add(complementoLabel);
        frame.add(panel);
        complementoText = new JTextField();
        complementoText.setBounds(760, 340, 500, 30);
        panel.add(complementoText);
        frame.add(panel);
        bairroLabel = new JLabel("Bairro");
        bairroLabel.setBounds(20, 380, 100, 30);
        bairroLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bairroLabel.setVerticalAlignment(SwingConstants.CENTER);
        bairroLabel.setBorder(blackline);
        panel.add(bairroLabel);
        frame.add(panel);
        bairroText = new JTextField();
        bairroText.setBounds(140, 380, 300, 30);
        panel.add(bairroText);
        frame.add(panel);
        telefoneLabel = new JLabel("Telefone");
        telefoneLabel.setBounds(450, 380, 100, 30);
        telefoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
        telefoneLabel.setVerticalAlignment(SwingConstants.CENTER);
        telefoneLabel.setBorder(blackline);
        panel.add(telefoneLabel);
        frame.add(panel);
        telefoneText = new JTextField();
        telefoneText.setBounds(570, 380, 300, 30);
        panel.add(telefoneText);
        frame.add(panel);
        situacaoLabel = new JLabel("Situação");
        situacaoLabel.setBounds(880, 380, 100, 30);
        situacaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        situacaoLabel.setVerticalAlignment(SwingConstants.CENTER);
        situacaoLabel.setBorder(blackline);
        panel.add(situacaoLabel);
        frame.add(panel);
        ativoRadio = new JRadioButton("Ativo");
        ativoRadio.setBounds(1000, 380, 70, 30);
        inativoRadio = new JRadioButton("Inativo");
        inativoRadio.setBounds(1080, 380, 70, 30);
        situacaoGroup = new ButtonGroup();
        situacaoGroup.add(ativoRadio);
        situacaoGroup.add(inativoRadio);
        panel.add(ativoRadio);
        frame.add(panel);
        panel.add(inativoRadio);
        frame.add(panel);
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(20, 440, 100, 30);
        cadastrarButton.setBackground(Color.ORANGE);
        panel.add(cadastrarButton);
        frame.add(panel);
        excluirButton = new JButton("Excluir");
        excluirButton.setBounds(140, 440, 100, 30);
        excluirButton.setBackground(Color.ORANGE);
        panel.add(excluirButton);
        frame.add(panel);
        limparButton = new JButton("limpar");
        limparButton.setBounds(260, 440, 100, 30);
        panel.add(limparButton);
        frame.add(panel);
        cadastrarButton.addActionListener(e -> {
            String nome = nomeText.getText();
            String tipo = (String) paisCombo.getSelectedItem();
            String situacao = ativoRadio.isSelected() ? "Ativo"
                    : (inativoRadio.isSelected() ? "Inativo" : "Não selecionado");
            boolean fornecedor = fornecedorCheck.isSelected();
            String email = emailText.getText();

            JOptionPane.showMessageDialog(this,
                    "Cadastro realizado:\n" +
                            "Nome: " + nome + "\n" +
                            "Tipo: " + tipo + "\n" +
                            "Situação: " + situacao + "\n" +
                            "Fornecedor: " + fornecedor + "\n" +
                            "Email: " + email,
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        excluirButton.addActionListener(e -> {
            limparCampos();
            JOptionPane.showMessageDialog(this, "Dados excluídos.", "Excluir", JOptionPane.WARNING_MESSAGE);
        });

        limparButton.addActionListener(e -> limparCampos());

    }

    public static void main(String[] args) {
        new Cadastro();
    }
}