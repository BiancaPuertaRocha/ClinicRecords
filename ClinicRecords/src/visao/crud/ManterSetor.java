/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.crud;

import Utilidades.LimitedTextField;
import controle.ControleFuncionario;
import controle.ControleSetor;
import modelo.Setor;
import javax.swing.JOptionPane;
import modelo.Funcionario;

/**
 *
 * @author Bianca
 */
public class ManterSetor extends javax.swing.JInternalFrame {

    private boolean novo = false;
    private ControleSetor controle;
    private int codigoEditar;
    private ControleFuncionario controleFuncionario;
    private Setor setorPesquisa = null;

    public ManterSetor() {
        initComponents();
        controleFuncionario = new ControleFuncionario();
        controle = new ControleSetor();
        painel.setEnabledAt(1, false);
        painel.setEnabledAt(2, false);
        if (ControleFuncionario.getLogado() != null && !ControleFuncionario.getLogado().getTipo()) {
            botNovoSetor.setEnabled(false);
            botExcluirSetor.setEnabled(false);
            botAlterarSetor.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        GerEntSetor = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ClinicRecordsPU").createEntityManager();
        consultaSetor = java.beans.Beans.isDesignTime() ? null : GerEntSetor.createQuery("select setor from Setor setor");
        listaSetor = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(consultaSetor.getResultList());
        listaFuncionarioSetor = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(consultaSetor.getResultList());
        painel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botPesquisarSetor = new javax.swing.JButton();
        botAlterarSetor = new javax.swing.JButton();
        botExcluirSetor = new javax.swing.JButton();
        botNovoSetor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSetores = new javax.swing.JTable();
        botFecharPesquisaSetor = new javax.swing.JButton();
        txtsetor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        botCancelaSetor = new javax.swing.JButton();
        botConfirmarSetor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtpesquisaFuncSetor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        labelSetor = new javax.swing.JLabel();
        txtnomesetor = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Manter Setor");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        botPesquisarSetor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botPesquisarSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search-2-xxl.png"))); // NOI18N
        botPesquisarSetor.setText("Pesquisar");
        botPesquisarSetor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botPesquisarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisarSetorActionPerformed(evt);
            }
        });
        jPanel3.add(botPesquisarSetor);

        botAlterarSetor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botAlterarSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alter.png"))); // NOI18N
        botAlterarSetor.setText("Alterar");
        botAlterarSetor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botAlterarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAlterarSetorActionPerformed(evt);
            }
        });
        jPanel3.add(botAlterarSetor);

        botExcluirSetor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botExcluirSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        botExcluirSetor.setText("Excluir");
        botExcluirSetor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botExcluirSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirSetorActionPerformed(evt);
            }
        });
        jPanel3.add(botExcluirSetor);

        botNovoSetor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botNovoSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        botNovoSetor.setText("Novo");
        botNovoSetor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botNovoSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoSetorActionPerformed(evt);
            }
        });
        jPanel3.add(botNovoSetor);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/olho.png"))); // NOI18N
        jButton1.setText("Funcionários");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        txtPesquisa.setBackground(new java.awt.Color(240, 240, 240));
        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPesquisa.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Pesquisa Por Descrição");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        tabelaSetores.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabelaSetores.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaSetor, tabelaSetores);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabelaSetores);
        if (tabelaSetores.getColumnModel().getColumnCount() > 0) {
            tabelaSetores.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        botFecharPesquisaSetor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botFecharPesquisaSetor.setText("Fechar");
        botFecharPesquisaSetor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botFecharPesquisaSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFecharPesquisaSetorActionPerformed(evt);
            }
        });

        txtsetor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtsetor.setText("Manter Setor");

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botFecharPesquisaSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtsetor)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtsetor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botFecharPesquisaSetor)
                .addContainerGap())
        );

        painel.addTab("Pesquisa", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ficha de Cadastro de Setores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Descrição");

        descricao.setDocument(new LimitedTextField(50));
        descricao.setBackground(new java.awt.Color(240, 240, 240));
        descricao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        descricao.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Observação");

        observacao.setDocument(new LimitedTextField(50));
        observacao.setBackground(new java.awt.Color(240, 240, 240));
        observacao.setColumns(20);
        observacao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        observacao.setRows(5);
        jScrollPane2.setViewportView(observacao);

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botCancelaSetor.setBackground(new java.awt.Color(255, 204, 204));
        botCancelaSetor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botCancelaSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        botCancelaSetor.setText("Cancelar");
        botCancelaSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelaSetorActionPerformed(evt);
            }
        });

        botConfirmarSetor.setBackground(new java.awt.Color(204, 255, 204));
        botConfirmarSetor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botConfirmarSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/confirm.png"))); // NOI18N
        botConfirmarSetor.setText("Confirmar");
        botConfirmarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfirmarSetorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botConfirmarSetor)
                        .addGap(18, 18, 18)
                        .addComponent(botCancelaSetor)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancelaSetor)
                    .addComponent(botConfirmarSetor))
                .addGap(39, 39, 39))
        );

        painel.addTab("Cadastro", jPanel2);

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaFuncionarioSetor, jTable1);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${profissao}"));
        columnBinding.setColumnName("Profissao");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${setor.descricao}"));
        columnBinding.setColumnName("Setor");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(jTable1);

        txtpesquisaFuncSetor.setBackground(new java.awt.Color(240, 240, 240));
        txtpesquisaFuncSetor.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtpesquisaFuncSetor.setBorder(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/searchmenor.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Nome do Funcionário");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(txtpesquisaFuncSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpesquisaFuncSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        labelSetor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSetor.setText("Setor:");

        txtnomesetor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtnomesetor.setText("jLabel5");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelSetor)
                        .addGap(18, 18, 18)
                        .addComponent(txtnomesetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSetor)
                    .addComponent(txtnomesetor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        painel.addTab("Funcionários no Setor", jPanel6);

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

    private void botPesquisarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPesquisarSetorActionPerformed
        String pesquisa;
        listaSetor.clear();
        pesquisa = txtPesquisa.getText();
        listaSetor.addAll(controle.pesquisaSetor(pesquisa));
    }//GEN-LAST:event_botPesquisarSetorActionPerformed

    private void botAlterarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAlterarSetorActionPerformed
        this.novo = false;
        Setor setorSelected;
        int posicao;
        posicao = tabelaSetores.getSelectedRow();

        if (posicao != -1) {

            setorSelected = listaSetor.get(posicao);
            descricao.setText(setorSelected.getDescricao());
            observacao.setText(setorSelected.getObservacao());
            this.codigoEditar = setorSelected.getCodigo();

            painel.setEnabledAt(1, true);

            painel.setSelectedIndex(1);

            painel.setEnabledAt(0, false);
            painel.setEnabledAt(2, false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }


    }//GEN-LAST:event_botAlterarSetorActionPerformed

    private void botExcluirSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirSetorActionPerformed
        Setor setorSelected;
        int posicao = tabelaSetores.getSelectedRow();
        if (posicao != -1) {
            setorSelected = listaSetor.get(posicao);
            if (controleFuncionario.listaFuncionarioSetor("", setorSelected).isEmpty()) {
                int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n" + setorSelected.getDescricao(), "Exclusão", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    controle.excluir(setorSelected);
                    listaSetor.clear();
                    listaSetor.addAll(controle.listaSetor());
                }
            } else {
                JOptionPane.showMessageDialog(this, "este setor está vinculado a um outro registro!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }
    }//GEN-LAST:event_botExcluirSetorActionPerformed

    private void botNovoSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNovoSetorActionPerformed

        descricao.setText("");
        observacao.setText("");

        painel.setEnabledAt(1, true);
        painel.setSelectedIndex(1);
        painel.setEnabledAt(0, false);
        painel.setEnabledAt(2, false);
        this.novo = true;
    }//GEN-LAST:event_botNovoSetorActionPerformed

    private void botFecharPesquisaSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFecharPesquisaSetorActionPerformed
        this.dispose();
    }//GEN-LAST:event_botFecharPesquisaSetorActionPerformed

    private void botCancelaSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelaSetorActionPerformed
        painel.setEnabledAt(0, true);
        painel.setSelectedIndex(0);
        painel.setEnabledAt(1, false);
        painel.setEnabledAt(2, false);
    }//GEN-LAST:event_botCancelaSetorActionPerformed

    private void botConfirmarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfirmarSetorActionPerformed
        if (!descricao.getText().isEmpty() && !observacao.getText().isEmpty()) {
            Setor setor;
            setor = new Setor();

            setor.setDescricao(descricao.getText());
            setor.setObservacao(observacao.getText());

            if (this.novo) {
                controle.adicionar(setor);
            } else {
                setor.setCodigo(codigoEditar);
                controle.alterar(setor);
            }
            painel.setEnabledAt(0, true);
            painel.setEnabledAt(2, false);
            painel.setSelectedIndex(0);

            painel.setEnabledAt(1, false);
            listaSetor.clear();
            listaSetor.addAll(controle.listaSetor());
        } else {
            JOptionPane.showMessageDialog(this, "Há um campo vazio!");
        }
    }//GEN-LAST:event_botConfirmarSetorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Setor setorSelected;
        int posicao = tabelaSetores.getSelectedRow();
        if (posicao != -1) {
            setorSelected = listaSetor.get(posicao);
            listaFuncionarioSetor.clear();
            listaFuncionarioSetor.addAll(controleFuncionario.listaFuncionarioSetor("", setorSelected));
            setorPesquisa = setorSelected;
            txtnomesetor.setText(setorPesquisa.getDescricao());
            painel.setEnabledAt(2, true);
            painel.setSelectedIndex(2);

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listaFuncionarioSetor.clear();
        listaFuncionarioSetor.addAll(controleFuncionario.listaFuncionarioSetor(txtpesquisaFuncSetor.getText(), setorPesquisa));
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager GerEntSetor;
    private javax.swing.JButton botAlterarSetor;
    private javax.swing.JButton botCancelaSetor;
    private javax.swing.JButton botConfirmarSetor;
    private javax.swing.JButton botExcluirSetor;
    private javax.swing.JButton botFecharPesquisaSetor;
    private javax.swing.JButton botNovoSetor;
    private javax.swing.JButton botPesquisarSetor;
    private javax.persistence.Query consultaSetor;
    private javax.swing.JTextField descricao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelSetor;
    private java.util.List<Funcionario> listaFuncionarioSetor;
    private java.util.List<Setor> listaSetor;
    private javax.swing.JTextArea observacao;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JTable tabelaSetores;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JLabel txtnomesetor;
    private javax.swing.JTextField txtpesquisaFuncSetor;
    private javax.swing.JLabel txtsetor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
