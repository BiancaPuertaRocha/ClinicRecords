/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.crud;

import controle.ControleConsulta;
import controle.ControleFichaAtendimento;
import controle.ControleFuncionario;
import controle.ControleMedico;
import controle.ControlePaciente;
import controle.ControlePreConsulta;
import java.text.ParseException;
import modelo.Medico;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class ManterMedico extends javax.swing.JInternalFrame {

    private boolean novo = false;
    private ControleMedico controle;
    private int codigoEditar;
    private ControleConsulta controleConsulta;
    private ControleFichaAtendimento controleFicha;
    private ControlePreConsulta controlePre;
    private ControlePaciente controlePaciente;

    public ManterMedico() {
        initComponents();
        controle = new ControleMedico();
        controlePaciente = new ControlePaciente();
        controlePre = new ControlePreConsulta();
        controleFicha = new ControleFichaAtendimento();
        painel.setEnabledAt(1, false);
        controleConsulta = new ControleConsulta();
        if (ControleFuncionario.getLogado() != null && !ControleFuncionario.getLogado().getTipo()) {
            botNovoMedico.setEnabled(false);
            botExcluirMedico.setEnabled(false);
            botAlterarMedico.setEnabled(false);
        }

        if (!ControleFuncionario.getLogado().getTipo()) {

            botAlterarMedico.setEnabled(false);
            botExcluirMedico.setEnabled(false);
            botNovoMedico.setEnabled(false);
            maskLetterNumber(maxatendi);
        }
    }

    public void maskLetter(JFormattedTextField jtf) {
        MaskFormatter formatoDois;
        try {
            formatoDois = new MaskFormatter("");
            formatoDois.setValidCharacters("0123456789()-.");
            formatoDois.install(jtf);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(
                    null,
                    this,
                    "Não foi possivel inserir mask nos campos letras: "
                    + e.getMessage(), 0);
        }
    }
    public void maskLetterNumber(JFormattedTextField jtf) {
        MaskFormatter formatoDois;
        try {
            formatoDois = new MaskFormatter("");
            formatoDois.setValidCharacters("0123456789");
            formatoDois.install(jtf);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(
                    null,
                    this,
                    "Não foi possivel inserir mask nos campos letras: "
                    + e.getMessage(), 0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        gerenteEntMedico = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ClinicRecordsPU").createEntityManager();
        consultaMedico = java.beans.Beans.isDesignTime() ? null : gerenteEntMedico.createQuery("select medico from Medico medico");
        listaMedico = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(consultaMedico.getResultList());
        painel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMedicos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        botPesquisaMedico = new javax.swing.JButton();
        botAlterarMedico = new javax.swing.JButton();
        botExcluirMedico = new javax.swing.JButton();
        botNovoMedico = new javax.swing.JButton();
        botFecharPesquisaMedico = new javax.swing.JButton();
        txtmedico = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeMed = new javax.swing.JTextField();
        cidadeMed = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        endMed = new javax.swing.JTextField();
        ufMed = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        nomeUserMed = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        senhaMed = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        crmMed = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        especialidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        emailMed = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        maxatendi = new javax.swing.JFormattedTextField();
        telMed = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        bairroMed = new javax.swing.JTextField();
        dataMed = new com.toedter.calendar.JDateChooser();
        confirmaSenha = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nomePai = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nomeMae = new javax.swing.JTextField();
        profissao = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cartSus = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        estCiv = new javax.swing.JComboBox<>();
        sexMed = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
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
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        tiposang = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cpfMed = new javax.swing.JFormattedTextField();
        rgMed = new javax.swing.JFormattedTextField();
        botCancelarMedico = new javax.swing.JButton();
        botConfirmarMedico = new javax.swing.JButton();

        setClosable(true);
        setTitle("Manter Médico");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        tabelaMedicos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabelaMedicos.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaMedico, tabelaMedicos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${especialidade}"));
        columnBinding.setColumnName("Especialidade");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${crm}"));
        columnBinding.setColumnName("Crm");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabelaMedicos);
        if (tabelaMedicos.getColumnModel().getColumnCount() > 0) {
            tabelaMedicos.getColumnModel().getColumn(0).setResizable(false);
            tabelaMedicos.getColumnModel().getColumn(1).setResizable(false);
            tabelaMedicos.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Pesquisar por nome ");

        txtPesquisa.setBackground(new java.awt.Color(240, 240, 240));
        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPesquisa.setBorder(null);
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        botPesquisaMedico.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botPesquisaMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search-2-xxl.png"))); // NOI18N
        botPesquisaMedico.setText("Pesquisar");
        botPesquisaMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botPesquisaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisaMedicoActionPerformed(evt);
            }
        });
        jPanel6.add(botPesquisaMedico);

        botAlterarMedico.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botAlterarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alter.png"))); // NOI18N
        botAlterarMedico.setText("Alterar");
        botAlterarMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botAlterarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAlterarMedicoActionPerformed(evt);
            }
        });
        jPanel6.add(botAlterarMedico);

        botExcluirMedico.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        botExcluirMedico.setText("Excluir");
        botExcluirMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirMedicoActionPerformed(evt);
            }
        });
        jPanel6.add(botExcluirMedico);

        botNovoMedico.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botNovoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        botNovoMedico.setText("Novo");
        botNovoMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botNovoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoMedicoActionPerformed(evt);
            }
        });
        jPanel6.add(botNovoMedico);

        botFecharPesquisaMedico.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botFecharPesquisaMedico.setText("Fechar");
        botFecharPesquisaMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botFecharPesquisaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFecharPesquisaMedicoActionPerformed(evt);
            }
        });

        txtmedico.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtmedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/doct.png"))); // NOI18N
        txtmedico.setText("Manter Médico");

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botFecharPesquisaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addComponent(txtmedico)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtmedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botFecharPesquisaMedico)
                .addGap(24, 24, 24))
        );

        painel.addTab("Pesquisa", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ficha de Cadastro de Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Nome");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Cidade");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 179, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("UF");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("RG");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("CPF");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        nomeMed.setBackground(new java.awt.Color(240, 240, 240));
        nomeMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeMed.setBorder(null);
        jPanel3.add(nomeMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 62, 352, -1));

        cidadeMed.setBackground(new java.awt.Color(240, 240, 240));
        cidadeMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cidadeMed.setBorder(null);
        cidadeMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeMedActionPerformed(evt);
            }
        });
        jPanel3.add(cidadeMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 206, 174, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Endereço");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 179, -1, -1));

        endMed.setBackground(new java.awt.Color(240, 240, 240));
        endMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        endMed.setBorder(null);
        jPanel3.add(endMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 206, 352, -1));

        ufMed.setBackground(new java.awt.Color(240, 240, 240));
        ufMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ufMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        ufMed.setBorder(null);
        jPanel3.add(ufMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 287, 98, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Nome de Usuário");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 260, -1, -1));

        nomeUserMed.setBackground(new java.awt.Color(240, 240, 240));
        nomeUserMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeUserMed.setBorder(null);
        nomeUserMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUserMedActionPerformed(evt);
            }
        });
        jPanel3.add(nomeUserMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 352, 29));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Senha");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 334, -1, -1));

        senhaMed.setBackground(new java.awt.Color(240, 240, 240));
        senhaMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        senhaMed.setBorder(null);
        jPanel3.add(senhaMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 361, 160, 31));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("CRM");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 423, -1, -1));

        crmMed.setBackground(new java.awt.Color(240, 240, 240));
        crmMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        crmMed.setBorder(null);
        crmMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crmMedActionPerformed(evt);
            }
        });
        jPanel3.add(crmMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 450, 146, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Data de Nascimento");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 256, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Telefone");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 336, -1, 19));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Especialidade");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 423, -1, -1));

        especialidade.setBackground(new java.awt.Color(240, 240, 240));
        especialidade.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        especialidade.setBorder(null);
        especialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadeActionPerformed(evt);
            }
        });
        jPanel3.add(especialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 450, 174, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("E-mail");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 521, -1, -1));

        emailMed.setBackground(new java.awt.Color(240, 240, 240));
        emailMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailMed.setBorder(null);
        jPanel3.add(emailMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 546, 352, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero Atendimentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        maxatendi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(maxatendi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(maxatendi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 427, -1, 71));

        telMed.setBackground(new java.awt.Color(240, 240, 240));
        telMed.setBorder(null);
        try {
            telMed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(telMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 362, 169, 32));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Bairro");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 179, -1, -1));

        bairroMed.setBackground(new java.awt.Color(240, 240, 240));
        bairroMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bairroMed.setBorder(null);
        jPanel3.add(bairroMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 206, 181, -1));

        dataMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(dataMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 283, 158, 33));

        confirmaSenha.setBackground(new java.awt.Color(240, 240, 240));
        confirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        confirmaSenha.setBorder(null);
        jPanel3.add(confirmaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 361, 174, 31));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Confirma Senha");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 334, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("Nome do Pai");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        nomePai.setBackground(new java.awt.Color(240, 240, 240));
        nomePai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomePai.setBorder(null);
        jPanel3.add(nomePai, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 390, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("Nome da Mãe");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 106, -1, -1));

        nomeMae.setBackground(new java.awt.Color(240, 240, 240));
        nomeMae.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeMae.setBorder(null);
        jPanel3.add(nomeMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 123, 390, 30));

        profissao.setBackground(new java.awt.Color(240, 240, 240));
        profissao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        profissao.setBorder(null);
        jPanel3.add(profissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 450, 169, 25));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("Profissão");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 423, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setText("Cartão SUS");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 335, -1, -1));

        cartSus.setBackground(new java.awt.Color(240, 240, 240));
        cartSus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cartSus.setBorder(null);
        jPanel3.add(cartSus, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 362, 178, 32));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setText("Estado Civil");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 260, -1, -1));

        estCiv.setBackground(new java.awt.Color(240, 240, 240));
        estCiv.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        estCiv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Divorciado(a)" }));
        estCiv.setBorder(null);
        estCiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estCivActionPerformed(evt);
            }
        });
        jPanel3.add(estCiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 287, 126, -1));

        sexMed.setBackground(new java.awt.Color(240, 240, 240));
        sexMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sexMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));
        sexMed.setBorder(null);
        jPanel3.add(sexMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 551, 169, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setText("Sexo");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 524, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 89, 352, 10));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 89, 396, 10));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 160, -1, 10));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 160, 396, 10));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 160, 10));

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator7.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 233, 352, 10));

        jSeparator8.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 234, -1, 10));

        jSeparator9.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator9.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 234, 174, 10));

        jSeparator10.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator10.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 322, 352, 10));

        jSeparator11.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator11.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 399, 160, 10));

        jSeparator12.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator12.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 399, 174, 17));

        jSeparator13.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator13.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 401, 169, 10));

        jSeparator14.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator14.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 401, 192, 13));

        jSeparator15.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator15.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 504, -1, 10));

        jSeparator16.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator16.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 483, 174, 9));

        jSeparator17.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator17.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 482, 169, 10));

        jSeparator19.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator19.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 573, 352, -1));

        jSeparator20.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator20.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 160, 146, 10));

        jSeparator21.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator21.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 482, 146, 10));

        jSeparator22.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator22.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 233, 181, 10));

        tiposang.setBackground(new java.awt.Color(240, 240, 240));
        tiposang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tiposang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        tiposang.setBorder(null);
        jPanel3.add(tiposang, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 546, 172, 29));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setText("Tipo Sanguíneo");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 516, -1, -1));

        cpfMed.setBackground(new java.awt.Color(240, 240, 240));
        cpfMed.setBorder(null);
        try {
            cpfMed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfMed.setToolTipText("");
        cpfMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(cpfMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 123, 146, 30));

        rgMed.setBackground(new java.awt.Color(240, 240, 240));
        rgMed.setBorder(null);
        try {
            rgMed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rgMed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(rgMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 160, 40));

        botCancelarMedico.setBackground(new java.awt.Color(255, 204, 204));
        botCancelarMedico.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botCancelarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        botCancelarMedico.setText("Cancelar");
        botCancelarMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botCancelarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarMedicoActionPerformed(evt);
            }
        });

        botConfirmarMedico.setBackground(new java.awt.Color(204, 255, 204));
        botConfirmarMedico.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botConfirmarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/confirm.png"))); // NOI18N
        botConfirmarMedico.setText("Confirmar");
        botConfirmarMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botConfirmarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfirmarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(botConfirmarMedico)
                .addGap(18, 18, 18)
                .addComponent(botCancelarMedico)
                .addGap(290, 290, 290))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancelarMedico)
                    .addComponent(botConfirmarMedico))
                .addGap(17, 17, 17))
        );

        painel.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void botPesquisaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPesquisaMedicoActionPerformed
        String pesquisa;
        listaMedico.clear();
        pesquisa = txtPesquisa.getText();
        listaMedico.addAll(controle.pesquisaMedico(pesquisa));
    }//GEN-LAST:event_botPesquisaMedicoActionPerformed

    private void botAlterarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAlterarMedicoActionPerformed
        this.novo = false;

        Medico medicoSelected;
        int posicao;
        posicao = tabelaMedicos.getSelectedRow();

        if (posicao != -1) {
            medicoSelected = listaMedico.get(posicao);
            this.codigoEditar = medicoSelected.getCodigo();
            nomeMed.setText(medicoSelected.getNome());
            nomeUserMed.setText(medicoSelected.getNomeuser());
            cpfMed.setText(medicoSelected.getCpf());
            cidadeMed.setText(medicoSelected.getCidade());
            int x = 0;
            for (int y = 0; y < ufMed.getItemCount(); y++) {
                if (ufMed.getItemAt(y).equals(medicoSelected.getUf())) {
                    x = y;
                }
            }
            ufMed.setSelectedIndex(x);
            endMed.setText(medicoSelected.getEndereco());
            emailMed.setText(medicoSelected.getEmail());
            crmMed.setText(medicoSelected.getCrm());
            dataMed.setDate(medicoSelected.getDatanasc());
            especialidade.setText(medicoSelected.getEspecialidade());
            rgMed.setText(medicoSelected.getRg());
            telMed.setText(medicoSelected.getTelefone());
            bairroMed.setText(medicoSelected.getBairro());
            maxatendi.setText(Integer.toString(medicoSelected.getMaxatendi()));
            profissao.setText(medicoSelected.getProfissao());
            cartSus.setText(medicoSelected.getCartsus());
            nomeMae.setText(medicoSelected.getNomemae());
            nomePai.setText(medicoSelected.getNomepai());
            senhaMed.setText(medicoSelected.getSenha());
            tiposang.setSelectedItem(medicoSelected.getTiposang());
            int s = 0;
            for (int y = 0; y < sexMed.getItemCount(); y++) {
                if (sexMed.getItemAt(y).equals(medicoSelected.getSexo())) {
                    s = y;
                }
            }
            sexMed.setSelectedIndex(s);
            int est = 0;
            for (int y = 0; y < estCiv.getItemCount(); y++) {
                if (estCiv.getItemAt(y).equals(medicoSelected.getEstcivil())) {
                    est = y;
                }
            }
            estCiv.setSelectedIndex(est);
            painel.setEnabledAt(1, true);
            painel.setSelectedIndex(1);
            painel.setEnabledAt(0, false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um médico");
        }

    }//GEN-LAST:event_botAlterarMedicoActionPerformed

    private void botNovoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNovoMedicoActionPerformed

        nomeMed.setText("");
        nomeUserMed.setText("");
        cidadeMed.setText("");
        cpfMed.setText("");
        rgMed.setText("");
        endMed.setText("");
        crmMed.setText("");
        senhaMed.setText("");
        emailMed.setText("");
        especialidade.setText("");
        bairroMed.setText("");
        maxatendi.setText("");
        telMed.setText("");
        profissao.setText("");
        nomeMae.setText("");
        nomePai.setText("");
        painel.setEnabledAt(1, true);
        painel.setSelectedIndex(1);
        painel.setEnabledAt(0, false);
        this.novo = true;
    }//GEN-LAST:event_botNovoMedicoActionPerformed

    private void botFecharPesquisaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFecharPesquisaMedicoActionPerformed

        this.dispose();
    }//GEN-LAST:event_botFecharPesquisaMedicoActionPerformed

    private void cidadeMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeMedActionPerformed

    }//GEN-LAST:event_cidadeMedActionPerformed

    private void nomeUserMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUserMedActionPerformed

    }//GEN-LAST:event_nomeUserMedActionPerformed

    private void crmMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crmMedActionPerformed

    }//GEN-LAST:event_crmMedActionPerformed

    private void botCancelarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarMedicoActionPerformed
        painel.setEnabledAt(0, true);
        painel.setSelectedIndex(0);
        painel.setEnabledAt(1, false);
    }//GEN-LAST:event_botCancelarMedicoActionPerformed

    private void botConfirmarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfirmarMedicoActionPerformed
        if (!nomeUserMed.getText().isEmpty() && !crmMed.getText().isEmpty() && !especialidade.getText().isEmpty() && !maxatendi.getText().isEmpty()
                && !nomeUserMed.getText().isEmpty() && !nomeMed.getText().isEmpty() && !cartSus.getText().isEmpty() && !cidadeMed.getText().isEmpty()
                && !cpfMed.getText().isEmpty() && !dataMed.getDate().toString().isEmpty() && !emailMed.getText().isEmpty() && !endMed.getText().isEmpty()
                && !nomeMae.getText().isEmpty()
                && !nomePai.getText().isEmpty() && !profissao.getText().isEmpty() && !rgMed.getText().isEmpty() && !telMed.getText().isEmpty() && !bairroMed.getText().isEmpty()) {
            if (senhaMed.getText().equals(confirmaSenha.getText()) && !senhaMed.getText().equals("") && !confirmaSenha.getText().equals("")) {

                Medico medico;
                medico = new Medico();
                medico.setNomeuser(nomeUserMed.getText());
                medico.setCrm(crmMed.getText());
                medico.setEspecialidade(especialidade.getText());
                medico.setSenha(senhaMed.getText());
                medico.setMaxatendi(Integer.parseInt(maxatendi.getText()));
                Date data = new Date(System.currentTimeMillis());

                medico.setNomeuser(nomeUserMed.getText());
                medico.setDatacad(data);
                medico.setNome(nomeMed.getText());
                medico.setCartsus(cartSus.getText());
                medico.setCidade(cidadeMed.getText());
                medico.setCpf(cpfMed.getText());
                medico.setDatanasc(dataMed.getDate());
                medico.setEmail(emailMed.getText());
                medico.setEndereco(endMed.getText());
                medico.setEstcivil(estCiv.getItemAt(estCiv.getSelectedIndex()));
                medico.setNomemae(nomeMae.getText());
                medico.setNomepai(nomePai.getText());
                medico.setProfissao(profissao.getText());
                medico.setRg(rgMed.getText());
                medico.setSexo(sexMed.getItemAt(sexMed.getSelectedIndex()));
                medico.setTelefone(telMed.getText());
                medico.setUf(ufMed.getItemAt(ufMed.getSelectedIndex()));
                medico.setBairro(bairroMed.getText());
                medico.setTiposang((String) tiposang.getSelectedItem());
                if (this.novo) {
                    if (controlePaciente.pesquisaPacienteCPF(cpfMed.getText()).isEmpty()) {
                        if (!controle.pesquisaNomeUsuario(nomeUserMed.getText())) {
                            controle.adicionar(medico);
                        } else {
                            JOptionPane.showMessageDialog(this, "Já existe um usuário com esse nome!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Pessoa já cadastrada no sistema!");
                    }

                } else {
                    medico.setCodigo(codigoEditar);
                    controle.alterar(medico);
                }
                painel.setEnabledAt(0, true);
                painel.setSelectedIndex(0);
                painel.setEnabledAt(1, false);
                listaMedico.clear();
                listaMedico.addAll(controle.listaMedico());

            } else {
                JOptionPane.showMessageDialog(this, "Confirmação de senha incorreta!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Há um campo vazio!");
        }
    }//GEN-LAST:event_botConfirmarMedicoActionPerformed

    private void botExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirMedicoActionPerformed
        Medico medicoSelected;
        int posicao = tabelaMedicos.getSelectedRow();
        if (posicao != -1) {
            medicoSelected = listaMedico.get(posicao);
            if (controleConsulta.listaConsultasPciente(medicoSelected).isEmpty()
                    && controleFicha.listaAtendFuncionarioPessoa(medicoSelected.getCodigo()).isEmpty()
                    && controleFicha.pesquisaFichaAtendimentoPaciente(medicoSelected).isEmpty()
                    && controlePre.listaPreFuncionarioPessoa(medicoSelected.getCodigo()).isEmpty()) {
                int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n" + medicoSelected.getNome(), "Exclusão", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    controle.excluir(medicoSelected);
                    listaMedico.clear();
                    listaMedico.addAll(controle.listaMedico());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Este medico já está vinculado a um outro registro");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }
    }//GEN-LAST:event_botExcluirMedicoActionPerformed

    private void especialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadeActionPerformed

    private void estCivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estCivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estCivActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroMed;
    private javax.swing.JButton botAlterarMedico;
    private javax.swing.JButton botCancelarMedico;
    private javax.swing.JButton botConfirmarMedico;
    private javax.swing.JButton botExcluirMedico;
    private javax.swing.JButton botFecharPesquisaMedico;
    private javax.swing.JButton botNovoMedico;
    private javax.swing.JButton botPesquisaMedico;
    private javax.swing.JTextField cartSus;
    private javax.swing.JTextField cidadeMed;
    private javax.swing.JPasswordField confirmaSenha;
    private javax.persistence.Query consultaMedico;
    private javax.swing.JFormattedTextField cpfMed;
    private javax.swing.JTextField crmMed;
    private com.toedter.calendar.JDateChooser dataMed;
    private javax.swing.JTextField emailMed;
    private javax.swing.JTextField endMed;
    private javax.swing.JTextField especialidade;
    private javax.swing.JComboBox<String> estCiv;
    private javax.persistence.EntityManager gerenteEntMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private java.util.List<Medico> listaMedico;
    private javax.swing.JFormattedTextField maxatendi;
    private javax.swing.JTextField nomeMae;
    private javax.swing.JTextField nomeMed;
    private javax.swing.JTextField nomePai;
    private javax.swing.JTextField nomeUserMed;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JTextField profissao;
    private javax.swing.JFormattedTextField rgMed;
    private javax.swing.JPasswordField senhaMed;
    private javax.swing.JComboBox<String> sexMed;
    private javax.swing.JTable tabelaMedicos;
    private javax.swing.JFormattedTextField telMed;
    private javax.swing.JComboBox<String> tiposang;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JLabel txtmedico;
    private javax.swing.JComboBox<String> ufMed;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
