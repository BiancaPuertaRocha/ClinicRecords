/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Utilidades.LimitedTextField;
import controle.ControleFuncionario;
import controle.ControleMedico;
import controle.ControleSetor;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Funcionario;
import modelo.Setor;

/**
 *
 * @author Bianca
 */
public class TelaEditarPerfilFuncionario extends javax.swing.JDialog {

    private Funcionario funcionario;
    private ControleFuncionario controle;
    private ControleSetor controleSetor;

    public TelaEditarPerfilFuncionario(java.awt.Frame parent, boolean modal, Funcionario funcionarioSelected) {
        super(parent, modal);
        initComponents();
        controleSetor = new ControleSetor();
        controle = new ControleFuncionario();
        funcionario = funcionarioSelected;
        for (Setor f : controleSetor.listaSetor()) {
            setorFunc.addItem(f);
        }
        nomeFunc.setText(funcionarioSelected.getNome());
        nomeUserFunc.setText(funcionarioSelected.getNomeuser());
        cpfFunc.setText(funcionarioSelected.getCpf());
        cidadeFunc.setText(funcionarioSelected.getCidade());
        int x = 0;
        setorFunc.setSelectedItem(funcionarioSelected.getSetor());
        for (int y = 0; y < ufFunc.getItemCount(); y++) {
            if (ufFunc.getItemAt(y).equals(funcionarioSelected.getUf())) {
                x = y;
            }
        }
        setorFunc.setSelectedItem(funcionarioSelected.getSetor());
        for (int y = 0; y < ufFunc.getItemCount(); y++) {
            if (ufFunc.getItemAt(y).equals(funcionarioSelected.getUf())) {
                x = y;
            }
        }
        senhaFunc.setText("");
        confirm.setText("");
        ufFunc.setSelectedIndex(x);
        endFunc.setText(funcionarioSelected.getEndereco());
        emailFunc.setText(funcionarioSelected.getEmail());
        dataFunc.setDate(funcionarioSelected.getDatanasc());
        rgFunc.setText(funcionarioSelected.getRg());
        telFunc.setText(funcionarioSelected.getTelefone());
        bairroFunc.setText(funcionarioSelected.getBairro());
        profissao.setText(funcionarioSelected.getProfissao());
        cartSus.setText(funcionarioSelected.getCartsus());
        nomeMae.setText(funcionarioSelected.getNomemae());
        nomePai.setText(funcionarioSelected.getNomepai());
        senhaFunc.setText(funcionarioSelected.getSenha());
        tiposang.setSelectedItem(funcionarioSelected.getTiposang());
        int s = 0;
        for (int y = 0; y < sexFunc.getItemCount(); y++) {
            if (sexFunc.getItemAt(y).equals(funcionarioSelected.getSexo())) {
                s = y;
            }
        }
        sexFunc.setSelectedIndex(s);
        int est = 0;
        for (int y = 0; y < estCivil.getItemCount(); y++) {
            if (estCivil.getItemAt(y).equals(funcionarioSelected.getEstcivil())) {
                est = y;
            }
        }
        estCivil.setSelectedIndex(est);

    }

    public Funcionario getSelecionado() {
        return funcionario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        nomeFunc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cidadeFunc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeUserFunc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        endFunc = new javax.swing.JTextField();
        rgFunc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ufFunc = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        setorFunc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emailFunc = new javax.swing.JTextField();
        senhaFunc = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        dataFunc = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        bairroFunc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        confirm = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        profissao = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        estCivil = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cartSus = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nomePai = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        nomeMae = new javax.swing.JTextField();
        sexFunc = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        telFunc = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        tiposang = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cpfFunc = new javax.swing.JFormattedTextField();
        fecharFuncCad = new javax.swing.JButton();
        botFuncionarioConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ficha de Cadastro de Funcionários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeFunc.setDocument(new LimitedTextField(50));
        nomeFunc.setBackground(new java.awt.Color(240, 240, 240));
        nomeFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeFunc.setBorder(null);
        nomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFuncActionPerformed(evt);
            }
        });
        jPanel3.add(nomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 65, 331, 28));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Nome ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 34, -1, -1));

        cidadeFunc.setDocument(new LimitedTextField(30));
        cidadeFunc.setBackground(new java.awt.Color(240, 240, 240));
        cidadeFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cidadeFunc.setBorder(null);
        jPanel3.add(cidadeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 65, 224, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Cidade");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 39, -1, -1));

        nomeUserFunc.setDocument(new LimitedTextField(10));
        nomeUserFunc.setBackground(new java.awt.Color(240, 240, 240));
        nomeUserFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeUserFunc.setBorder(null);
        nomeUserFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUserFuncActionPerformed(evt);
            }
        });
        jPanel3.add(nomeUserFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 213, 331, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Nome de Usuário");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 187, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Senha");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 187, -1, -1));

        endFunc.setDocument(new LimitedTextField(100));
        endFunc.setBackground(new java.awt.Color(240, 240, 240));
        endFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        endFunc.setBorder(null);
        jPanel3.add(endFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 137, 331, 28));

        rgFunc.setDocument(new LimitedTextField(9));
        rgFunc.setBackground(new java.awt.Color(240, 240, 240));
        rgFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rgFunc.setBorder(null);
        rgFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgFuncActionPerformed(evt);
            }
        });
        jPanel3.add(rgFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 281, 177, 33));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("RG");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 255, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("CPF");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 255, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Endereço");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 111, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("UF");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 39, -1, -1));

        ufFunc.setBackground(new java.awt.Color(240, 240, 240));
        ufFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ufFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        ufFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufFuncActionPerformed(evt);
            }
        });
        jPanel3.add(ufFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 65, 65, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Setor");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 255, -1, -1));

        setorFunc.setBackground(new java.awt.Color(240, 240, 240));
        setorFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        setorFunc.setBorder(null);
        setorFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorFuncActionPerformed(evt);
            }
        });
        jPanel3.add(setorFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 281, 157, 33));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Telefone");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 336, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("E-mail");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 410, -1, -1));

        emailFunc.setDocument(new LimitedTextField(50));
        emailFunc.setBackground(new java.awt.Color(240, 240, 240));
        emailFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailFunc.setBorder(null);
        emailFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFuncActionPerformed(evt);
            }
        });
        jPanel3.add(emailFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 434, 240, -1));

        senhaFunc.setDocument(new LimitedTextField(20));
        senhaFunc.setBackground(new java.awt.Color(240, 240, 240));
        senhaFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        senhaFunc.setBorder(null);
        jPanel3.add(senhaFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 213, 157, 28));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Data de Nascimento");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 255, -1, -1));

        dataFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(dataFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 281, 141, 33));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Bairro");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 116, -1, -1));

        bairroFunc.setDocument(new LimitedTextField(50));
        bairroFunc.setBackground(new java.awt.Color(240, 240, 240));
        bairroFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bairroFunc.setBorder(null);
        jPanel3.add(bairroFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 137, 309, 28));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Confirmação");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 187, -1, -1));

        confirm.setDocument(new LimitedTextField(50));
        confirm.setBackground(new java.awt.Color(240, 240, 240));
        confirm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        confirm.setBorder(null);
        jPanel3.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 213, 134, 28));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Profissão");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 332, -1, -1));

        profissao.setDocument(new LimitedTextField(40));
        profissao.setBackground(new java.awt.Color(240, 240, 240));
        profissao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        profissao.setBorder(null);
        jPanel3.add(profissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 358, 157, 23));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setText("Estado Civil");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 403, -1, -1));

        estCivil.setBackground(new java.awt.Color(240, 240, 240));
        estCivil.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        estCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Divorciado(a)" }));
        jPanel3.add(estCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 429, 157, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("Cartão SUS");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 336, -1, -1));

        cartSus.setDocument(new LimitedTextField(20));
        cartSus.setBackground(new java.awt.Color(240, 240, 240));
        cartSus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cartSus.setBorder(null);
        jPanel3.add(cartSus, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 367, 177, 26));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("Nome do Pai");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 474, -1, -1));

        nomePai.setDocument(new LimitedTextField(50));
        nomePai.setBackground(new java.awt.Color(240, 240, 240));
        nomePai.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        nomePai.setBorder(null);
        jPanel3.add(nomePai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 494, 331, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("Nome da Mãe");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 463, -1, -1));

        nomeMae.setDocument(new LimitedTextField(50));
        nomeMae.setBackground(new java.awt.Color(240, 240, 240));
        nomeMae.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        nomeMae.setBorder(null);
        nomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeMaeActionPerformed(evt);
            }
        });
        jPanel3.add(nomeMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 494, 298, -1));

        sexFunc.setBackground(new java.awt.Color(240, 240, 240));
        sexFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sexFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));
        sexFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexFuncActionPerformed(evt);
            }
        });
        jPanel3.add(sexFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 348, 133, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setText("Sexo");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 322, -1, -1));

        telFunc.setBackground(new java.awt.Color(240, 240, 240));
        telFunc.setBorder(null);
        try {
            telFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(telFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 367, 144, 26));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 99, 331, 3));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 99, 224, 6));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 171, 331, 10));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 171, 309, 10));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 247, 157, -1));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 247, 133, -1));

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 247, 331, -1));

        jSeparator8.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 320, 144, -1));

        jSeparator9.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator9.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 320, 177, -1));

        jSeparator10.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator10.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 387, 157, 10));

        jSeparator11.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator11.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 399, 144, 10));

        jSeparator12.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator12.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 399, 177, 10));

        jSeparator13.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator13.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 240, 10));

        jSeparator14.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator14.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 522, 331, 4));

        jSeparator15.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator15.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 522, 298, 3));

        tiposang.setBackground(new java.awt.Color(240, 240, 240));
        tiposang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tiposang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        tiposang.setBorder(null);
        jPanel3.add(tiposang, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 432, 72, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setText("Tipo Sanguíneo");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 410, -1, -1));

        cpfFunc.setBackground(new java.awt.Color(240, 240, 240));
        cpfFunc.setBorder(null);
        try {
            cpfFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(cpfFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 281, 144, 33));

        fecharFuncCad.setBackground(new java.awt.Color(255, 204, 204));
        fecharFuncCad.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fecharFuncCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        fecharFuncCad.setText("Fechar");
        fecharFuncCad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fecharFuncCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharFuncCadActionPerformed(evt);
            }
        });

        botFuncionarioConfirmar.setBackground(new java.awt.Color(204, 255, 204));
        botFuncionarioConfirmar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botFuncionarioConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/confirm.png"))); // NOI18N
        botFuncionarioConfirmar.setText("Confirmar");
        botFuncionarioConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botFuncionarioConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFuncionarioConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(botFuncionarioConfirmar)
                .addGap(18, 18, 18)
                .addComponent(fecharFuncCad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecharFuncCad)
                    .addComponent(botFuncionarioConfirmar))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 61, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 62, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncActionPerformed

    private void nomeUserFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUserFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUserFuncActionPerformed

    private void rgFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgFuncActionPerformed

    private void ufFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufFuncActionPerformed

    private void setorFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setorFuncActionPerformed

    private void emailFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFuncActionPerformed

    private void nomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeMaeActionPerformed

    private void sexFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexFuncActionPerformed

    private void fecharFuncCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharFuncCadActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_fecharFuncCadActionPerformed

    private void botFuncionarioConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioConfirmarActionPerformed
        if (senhaFunc.getText().equals(confirm.getText()) && !senhaFunc.getText().equals("") && !confirm.getText().equals("")) {
            if (!nomeUserFunc.getText().isEmpty() && !nomeFunc.getText().isEmpty() && !cartSus.getText().isEmpty() && !cidadeFunc.getText().isEmpty() && !cpfFunc.getText().isEmpty()
                    && !emailFunc.getText().isEmpty()
                    && !endFunc.getText().isEmpty() && !nomeMae.getText().isEmpty() && !nomePai.getText().isEmpty()
                    && !profissao.getText().isEmpty() && !rgFunc.getText().isEmpty() && !telFunc.getText().isEmpty()
                    && !bairroFunc.getText().isEmpty() && !nomeUserFunc.getText().isEmpty()
                    && !senhaFunc.getText().isEmpty()) {

                funcionario.setNomeuser(nomeUserFunc.getText());

                funcionario.setNome(nomeFunc.getText());
                funcionario.setCartsus(cartSus.getText());
                funcionario.setCidade(cidadeFunc.getText());
                funcionario.setCpf(cpfFunc.getText());
                funcionario.setDatanasc(dataFunc.getDate());
                funcionario.setEmail(emailFunc.getText());
                funcionario.setEndereco(endFunc.getText());
                funcionario.setEstcivil(estCivil.getItemAt(estCivil.getSelectedIndex()));
                funcionario.setNomemae(nomeMae.getText());
                funcionario.setNomepai(nomePai.getText());
                funcionario.setProfissao(profissao.getText());
                funcionario.setRg(rgFunc.getText());
                funcionario.setSexo(sexFunc.getItemAt(sexFunc.getSelectedIndex()));
                funcionario.setTelefone(telFunc.getText());
                funcionario.setUf(ufFunc.getItemAt(ufFunc.getSelectedIndex()));
                funcionario.setBairro(bairroFunc.getText());
                funcionario.setTiposang((String) tiposang.getSelectedItem());

                funcionario.setNomeuser(nomeUserFunc.getText());
                funcionario.setSenha(senhaFunc.getText());
                funcionario.setSetor(setorFunc.getItemAt(setorFunc.getSelectedIndex()));
                if (!nomeUserFunc.getText().equals(funcionario.getNomeuser()) || !controle.pesquisaUsuario(nomeUserFunc.getText())) {
                    funcionario.setNomeuser(nomeUserFunc.getText());

                    controle.alterar(funcionario);
                    this.dispose();
                } else if (nomeUserFunc.getText().equals(funcionario.getNomeuser())) {
                    controle.alterar(funcionario);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Já existe um usuário com esse nome!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Há campos não preenchidos!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Confirmação de senha incorreta!");
        }

    }//GEN-LAST:event_botFuncionarioConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEditarPerfilFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarPerfilFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarPerfilFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarPerfilFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEditarPerfilFuncionario dialog = new TelaEditarPerfilFuncionario(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroFunc;
    private javax.swing.JButton botFuncionarioConfirmar;
    private javax.swing.JTextField cartSus;
    private javax.swing.JTextField cidadeFunc;
    private javax.swing.JPasswordField confirm;
    private javax.swing.JFormattedTextField cpfFunc;
    private com.toedter.calendar.JDateChooser dataFunc;
    private javax.swing.JTextField emailFunc;
    private javax.swing.JTextField endFunc;
    private javax.swing.JComboBox<String> estCivil;
    private javax.swing.JButton fecharFuncCad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nomeFunc;
    private javax.swing.JTextField nomeMae;
    private javax.swing.JTextField nomePai;
    private javax.swing.JTextField nomeUserFunc;
    private javax.swing.JTextField profissao;
    private javax.swing.JTextField rgFunc;
    private javax.swing.JPasswordField senhaFunc;
    private javax.swing.JComboBox<Setor> setorFunc;
    private javax.swing.JComboBox<String> sexFunc;
    private javax.swing.JFormattedTextField telFunc;
    private javax.swing.JComboBox<String> tiposang;
    private javax.swing.JComboBox<String> ufFunc;
    // End of variables declaration//GEN-END:variables
}
