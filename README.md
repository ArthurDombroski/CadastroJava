# Cadastro de Pessoa - Java Swing

Este é um projeto em Java utilizando a biblioteca **Swing** para criar uma interface gráfica de **cadastro de pessoas físicas ou jurídicas**. A aplicação permite preencher, exibir e limpar dados de um formulário detalhado com diversos campos de informação pessoal e endereço.

## 🖼️ Interface

A interface do sistema é construída com componentes do `javax.swing`, incluindo:

- **JLabels** para rótulos
- **JTextFields** para entradas de texto
- **JCheckBox**, **JRadioButton**, **JComboBox**
- **JButtons** para ações
- **JOptionPane** para mensagens

## ⚙️ Funcionalidades

- Cadastro de pessoas físicas ou jurídicas
- Marcação de fornecedor
- Indicação da situação: *Ativo* ou *Inativo*
- Preenchimento de dados como CPF/CNPJ, endereço, email, telefone, etc.
- Campos desabilitados para informações fixas, como país e município
- Botões para:
  - **Cadastrar**: Exibe um resumo dos dados preenchidos
  - **Excluir**: Limpa todos os campos e mostra mensagem de exclusão
  - **Limpar**: Apenas limpa os campos preenchidos

## 🛠️ Tecnologias Utilizadas

- Java 8 ou superior
- Swing (javax.swing)
- AWT (java.awt)

## 🏁 Como Executar

1. Clone ou baixe o repositório.
    ```bash
    git clone https://github.com/ArthurDombroski/CadastroJava.git
2. Compile o arquivo:

   ```bash
   javac Cadastro.java

