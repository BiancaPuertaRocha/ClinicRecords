/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.crud;

import Utilidades.LimitedTextField;
import controle.ControleFichaAtendimento;
import controle.ControleFuncionario;
import controle.ControlePaciente;
import controle.ControlePreConsulta;
import modelo.Funcionario;
import controle.ControleSetor;
import java.text.ParseException;
import java.util.ArrayList;
import modelo.Setor;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import modelo.FichaAtendimento;
import modelo.PreConsulta;
import visao.dialogs.DialogBuscaFuncionario;

public class ManterFuncionario extends javax.swing.JInternalFrame {

    private ControleFuncionario controle;
    private ControleSetor controleSetor;
    private boolean novo;
    private int codigoEditar;
    private ControlePreConsulta controlePre;
    private ControleFichaAtendimento controleAtend;
    private ControlePaciente controlePaciente;

    public ManterFuncionario() {
        controleSetor = new ControleSetor();
        controle = new ControleFuncionario();
        controlePre = new ControlePreConsulta();
        controleAtend = new ControleFichaAtendimento();
        controlePaciente = new ControlePaciente();
        initComponents();

        painel.setEnabledAt(1, false);

        for (Setor f : controleSetor.listaSetor()) {
            setorFunc.addItem(f);
        }
        if (ControleFuncionario.getLogado() != null && !ControleFuncionario.getLogado().getTipo()) {
            painel.setEnabledAt(2, false);
            painel.setEnabledAt(3, false);

            botFuncionarioNovo.setEnabled(false);
            botFuncionarioAlterar.setEnabled(false);
            borFuncionarioExcluir.setEnabled(false);

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        tipoUser = new javax.swing.ButtonGroup();
        gerEnt = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ClinicRecordsPU").createEntityManager();
        consultaFuncionario = java.beans.Beans.isDesignTime() ? null : gerEnt.createQuery("select f from Funcionario f");
        listaFunc = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(consultaFuncionario.getResultList());
        listaPre =  org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<PreConsulta>());
        listaAtend = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<FichaAtendimento>());
        painel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        botFuncionarioFechar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        botFuncionarioPesquisar = new javax.swing.JButton();
        botFuncionarioAlterar = new javax.swing.JButton();
        borFuncionarioExcluir = new javax.swing.JButton();
        botFuncionarioNovo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        txtmanter = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
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
        jPanel5 = new javax.swing.JPanel();
        adm = new javax.swing.JRadioButton();
        comum = new javax.swing.JRadioButton();
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
        rgFunc = new javax.swing.JFormattedTextField();
        fecharFuncCad = new javax.swing.JButton();
        botFuncionarioConfirmar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtFuncionario1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txtFuncionario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Manter Funcionário");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Pesquisa por nome");

        txtPesquisa.setBackground(new java.awt.Color(240, 240, 240));
        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPesquisa.setBorder(null);
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        botFuncionarioFechar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botFuncionarioFechar.setText("Fechar");
        botFuncionarioFechar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botFuncionarioFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFuncionarioFecharActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        botFuncionarioPesquisar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botFuncionarioPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search-2-xxl.png"))); // NOI18N
        botFuncionarioPesquisar.setText("Pesquisar");
        botFuncionarioPesquisar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botFuncionarioPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFuncionarioPesquisarActionPerformed(evt);
            }
        });
        jPanel7.add(botFuncionarioPesquisar);

        botFuncionarioAlterar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botFuncionarioAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alter.png"))); // NOI18N
        botFuncionarioAlterar.setText("Alterar");
        botFuncionarioAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botFuncionarioAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFuncionarioAlterarActionPerformed(evt);
            }
        });
        jPanel7.add(botFuncionarioAlterar);

        borFuncionarioExcluir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        borFuncionarioExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        borFuncionarioExcluir.setText("Excluir");
        borFuncionarioExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borFuncionarioExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borFuncionarioExcluirActionPerformed(evt);
            }
        });
        jPanel7.add(borFuncionarioExcluir);

        botFuncionarioNovo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botFuncionarioNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        botFuncionarioNovo.setText("Novo");
        botFuncionarioNovo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botFuncionarioNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFuncionarioNovoActionPerformed(evt);
            }
        });
        jPanel7.add(botFuncionarioNovo);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        tabelaUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabelaUsuario.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaFunc, tabelaUsuario);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${setor}"));
        columnBinding.setColumnName("Setor");
        columnBinding.setColumnClass(modelo.Setor.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabelaUsuario);
        if (tabelaUsuario.getColumnModel().getColumnCount() > 0) {
            tabelaUsuario.getColumnModel().getColumn(0).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(1).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        txtmanter.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtmanter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtmanter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/commumuser.png"))); // NOI18N
        txtmanter.setText("Manter Funcionário");

        jSeparator16.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator16.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator16)
                    .addComponent(jLabel13)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(txtmanter))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botFuncionarioFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtmanter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botFuncionarioFechar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painel.addTab("Pesquisa", jPanel2);

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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        tipoUser.add(adm);
        adm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        adm.setText("Administrador");
        adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admActionPerformed(evt);
            }
        });

        tipoUser.add(comum);
        comum.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        comum.setText("Usuário Comum");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adm)
                    .addComponent(comum))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

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
        estCivil.setBorder(null);
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
        nomePai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomePai.setBorder(null);
        jPanel3.add(nomePai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 494, 331, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("Nome da Mãe");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 463, -1, -1));

        nomeMae.setDocument(new LimitedTextField(50));
        nomeMae.setBackground(new java.awt.Color(240, 240, 240));
        nomeMae.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
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
        sexFunc.setBorder(null);
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

        rgFunc.setBackground(new java.awt.Color(240, 240, 240));
        rgFunc.setBorder(null);
        try {
            rgFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rgFunc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(rgFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 276, 170, 40));

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
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(botFuncionarioConfirmar)
                .addGap(18, 18, 18)
                .addComponent(fecharFuncCad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(50, Short.MAX_VALUE))
        );

        painel.addTab("Cadastro", jPanel1);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setText("Pré-Consultas realizadas pelo funcionário");

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquise o funcionário"));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/searchmenor.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFuncionario1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaPre, jTable3);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataPrec}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fichaatend.paciente.nome}"));
        columnBinding.setColumnName("Paciente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${medico.nome}"));
        columnBinding.setColumnName("Medico");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroordem}"));
        columnBinding.setColumnName("N Ordem");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${situacao}"));
        columnBinding.setColumnName("Situação");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane4.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painel.addTab("Pré-Consultas", jPanel8);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquise o funcionário"));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/searchmenor.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFuncionario)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setText("Atendimentos realizados pelo funcionário");

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaAtend, jTable4);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${paciente.nome}"));
        columnBinding.setColumnName("Paciente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataatend}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataregistro}"));
        columnBinding.setColumnName("Data Registro");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroordem}"));
        columnBinding.setColumnName("N Ordem");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${situacao}"));
        columnBinding.setColumnName("Situação");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoatend.descricao}"));
        columnBinding.setColumnName("Atendimento");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane5.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
            jTable4.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painel.addTab("Atendimentos", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING)
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

    private void botFuncionarioFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioFecharActionPerformed

        this.dispose();
    }//GEN-LAST:event_botFuncionarioFecharActionPerformed

    private void nomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncActionPerformed

    private void ufFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufFuncActionPerformed

    private void setorFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setorFuncActionPerformed

    private void emailFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFuncActionPerformed

    private void admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admActionPerformed

    private void fecharFuncCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharFuncCadActionPerformed
        // TODO add your handling code here:
        painel.setEnabledAt(0, true);
        painel.setSelectedIndex(0);
        painel.setEnabledAt(1, false);
    }//GEN-LAST:event_fecharFuncCadActionPerformed

    private void botFuncionarioConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioConfirmarActionPerformed
        
        if (senhaFunc.getText().equals(confirm.getText()) && !senhaFunc.getText().equals("") && !confirm.getText().equals("")) {
            if (!nomeUserFunc.getText().isEmpty() && !nomeFunc.getText().isEmpty() && !cartSus.getText().isEmpty() && !cidadeFunc.getText().isEmpty() && !cpfFunc.getText().isEmpty()
                    && !emailFunc.getText().isEmpty()
                    && !endFunc.getText().isEmpty() && !nomeMae.getText().isEmpty() && !nomePai.getText().isEmpty()
                    && !profissao.getText().isEmpty() && !rgFunc.getText().isEmpty() && !telFunc.getText().isEmpty()
                    && !bairroFunc.getText().isEmpty() && !nomeUserFunc.getText().isEmpty()
                    && !senhaFunc.getText().isEmpty()) {
                
                Funcionario funcio;
                Date data = new Date(System.currentTimeMillis());
                funcio = new Funcionario();
                funcio.setNomeuser(nomeUserFunc.getText());
                funcio.setDatacad(data);
                funcio.setNome(nomeFunc.getText());
                funcio.setCartsus(cartSus.getText());
                funcio.setCidade(cidadeFunc.getText());
                funcio.setCpf(cpfFunc.getText());
                funcio.setDatanasc(dataFunc.getDate());
                funcio.setEmail(emailFunc.getText());
                funcio.setEndereco(endFunc.getText());
                funcio.setEstcivil(estCivil.getItemAt(estCivil.getSelectedIndex()));
                funcio.setNomemae(nomeMae.getText());
                funcio.setNomepai(nomePai.getText());
                funcio.setProfissao(profissao.getText());
                funcio.setRg(rgFunc.getText());
                funcio.setSexo(sexFunc.getItemAt(sexFunc.getSelectedIndex()));
                funcio.setTelefone(telFunc.getText());
                funcio.setUf(ufFunc.getItemAt(ufFunc.getSelectedIndex()));
                funcio.setBairro(bairroFunc.getText());
                funcio.setTiposang((String) tiposang.getSelectedItem());
                if (adm.isSelected()) {
                    funcio.setTipo(true);
                } else {
                    funcio.setTipo(false);
                }
                funcio.setNomeuser(nomeUserFunc.getText());
                funcio.setSenha(senhaFunc.getText());
                funcio.setSetor(setorFunc.getItemAt(setorFunc.getSelectedIndex()));
                if (this.novo) {
                    if(controlePaciente.pesquisaPacienteCPF(cpfFunc.getText()).isEmpty()){
                    if (!controle.pesquisaUsuario(nomeUserFunc.getText())) {
                        controle.adicionar(funcio);
                    } else {
                        JOptionPane.showMessageDialog(this, "Já existe um usuário com esse nome!");
                    }
                    }else {
                    JOptionPane.showMessageDialog(this, "Pessoa já cadastrada no sistema!");
                }
                } else {
                    funcio.setCodigo(codigoEditar);
                    controle.alterar(funcio);
                }
                painel.setEnabledAt(0, true);
                painel.setSelectedIndex(0);
                painel.setEnabledAt(1, false);
                listaFunc.clear();
                listaFunc.addAll(controle.listaFuncionario());
                
            } else {
                JOptionPane.showMessageDialog(this, "Há campos não preenchidos!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Confirmação de senha incorreta!");
        }


    }//GEN-LAST:event_botFuncionarioConfirmarActionPerformed

    private void botFuncionarioNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioNovoActionPerformed

        if (!controleSetor.listaSetor().isEmpty()) {

            cpfFunc.setText("");
            rgFunc.setText("");
            nomeFunc.setText("");
            cidadeFunc.setText("");
            endFunc.setText("");
            emailFunc.setText("");
            telFunc.setText("");
            nomeUserFunc.setText("");
            senhaFunc.setText("");
            confirm.setText("");
            tipoUser.clearSelection();
            profissao.setText("");
            cartSus.setText("");
            nomeMae.setText("");
            nomePai.setText("");
            bairroFunc.setText("");
            painel.setEnabledAt(1, true);
            painel.setSelectedIndex(1);
            painel.setEnabledAt(0, false);
            this.novo = true;
            painel.setEnabledAt(1, true);
            painel.setSelectedIndex(1);
            painel.setEnabledAt(0, false);
        } else {
            JOptionPane.showMessageDialog(this, "Cadastre um setor!");
        }

    }//GEN-LAST:event_botFuncionarioNovoActionPerformed

    private void botFuncionarioPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioPesquisarActionPerformed
        String pesquisa;
        listaFunc.clear();
        pesquisa = txtPesquisa.getText();
        listaFunc.addAll(controle.pesquisaFuncionario(pesquisa));
    }//GEN-LAST:event_botFuncionarioPesquisarActionPerformed

    private void botFuncionarioAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioAlterarActionPerformed
        this.novo = false;
        Funcionario funcionarioSelected;
        int posicao;
        posicao = tabelaUsuario.getSelectedRow();
        if (posicao != -1) {

            funcionarioSelected = listaFunc.get(posicao);
            this.codigoEditar = funcionarioSelected.getCodigo();
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
            if (funcionarioSelected.isTipo()) {
                adm.setSelected(true);
            } else {
                comum.setSelected(true);
            }

            painel.setEnabledAt(1, true);
            painel.setSelectedIndex(1);
            painel.setEnabledAt(0, false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um funcionário!");
        }
    }//GEN-LAST:event_botFuncionarioAlterarActionPerformed

    private void borFuncionarioExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borFuncionarioExcluirActionPerformed
        Funcionario funcionarioSelected;
        int posicao = tabelaUsuario.getSelectedRow();
        if (posicao != -1) {
            funcionarioSelected = listaFunc.get(posicao);
              if ( controleAtend.listaAtendFuncionarioPessoa(funcionarioSelected.getCodigo()).isEmpty()
                    && controleAtend.pesquisaFichaAtendimentoPaciente(funcionarioSelected).isEmpty()
                    && controlePre.listaPreFuncionarioPessoa(funcionarioSelected.getCodigo()).isEmpty()) {
            int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n" + funcionarioSelected.getNome(), "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                controle.excluir(funcionarioSelected);
                listaFunc.clear();
                listaFunc.addAll(controle.listaFuncionario());
            }
        }else{
         JOptionPane.showMessageDialog(this, "Este funcionário já está vinculado a um outro registro");
        }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }
    }//GEN-LAST:event_borFuncionarioExcluirActionPerformed

    private void nomeUserFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUserFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUserFuncActionPerformed

    private void sexFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexFuncActionPerformed

    private void nomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeMaeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DialogBuscaFuncionario tela;
        tela = new DialogBuscaFuncionario(null, true);
        tela.setVisible(true);
        if (tela.getFuncionarioSelecionado() != null) {
            listaPre.clear();
            txtFuncionario1.setText(tela.getFuncionarioSelecionado().getNome());
            listaPre.addAll(controlePre.listaPreFuncionario(tela.getFuncionarioSelecionado()));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DialogBuscaFuncionario tela;
        tela = new DialogBuscaFuncionario(null, true);
        tela.setVisible(true);
        if (tela.getFuncionarioSelecionado() != null) {
            listaAtend.clear();
            txtFuncionario.setText(tela.getFuncionarioSelecionado().getNome());
            listaAtend.addAll(controleAtend.listaAtendFuncionario(tela.getFuncionarioSelecionado()));
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adm;
    private javax.swing.JTextField bairroFunc;
    private javax.swing.JButton borFuncionarioExcluir;
    private javax.swing.JButton botFuncionarioAlterar;
    private javax.swing.JButton botFuncionarioConfirmar;
    private javax.swing.JButton botFuncionarioFechar;
    private javax.swing.JButton botFuncionarioNovo;
    private javax.swing.JButton botFuncionarioPesquisar;
    private javax.swing.JTextField cartSus;
    private javax.swing.JTextField cidadeFunc;
    private javax.swing.JRadioButton comum;
    private javax.swing.JPasswordField confirm;
    private javax.persistence.Query consultaFuncionario;
    private javax.swing.JFormattedTextField cpfFunc;
    private com.toedter.calendar.JDateChooser dataFunc;
    private javax.swing.JTextField emailFunc;
    private javax.swing.JTextField endFunc;
    private javax.swing.JComboBox<String> estCivil;
    private javax.swing.JButton fecharFuncCad;
    private javax.persistence.EntityManager gerEnt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private java.util.List<FichaAtendimento> listaAtend;
    private java.util.List<Funcionario> listaFunc;
    private java.util.List<PreConsulta> listaPre;
    private javax.swing.JTextField nomeFunc;
    private javax.swing.JTextField nomeMae;
    private javax.swing.JTextField nomePai;
    private javax.swing.JTextField nomeUserFunc;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JTextField profissao;
    private javax.swing.JFormattedTextField rgFunc;
    private javax.swing.JPasswordField senhaFunc;
    private javax.swing.JComboBox<Setor> setorFunc;
    private javax.swing.JComboBox<String> sexFunc;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JFormattedTextField telFunc;
    private javax.swing.ButtonGroup tipoUser;
    private javax.swing.JComboBox<String> tiposang;
    private javax.swing.JTextField txtFuncionario;
    private javax.swing.JTextField txtFuncionario1;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JLabel txtmanter;
    private javax.swing.JComboBox<String> ufFunc;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
