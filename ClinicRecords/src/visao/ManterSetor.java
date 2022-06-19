/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleSetor;
import modelo.Setor;
import javax.swing.JOptionPane;

/**
 *
 * @author Bianca
 */
public class ManterSetor extends javax.swing.JInternalFrame {

    private boolean novo= false;
    private ControleSetor controle;
    private int codigoEditar;

    public ManterSetor() {
        initComponents();
        controle = new ControleSetor();
        painel.setEnabledAt(1, false);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        GerEntSetor = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ClinicRecordsPU").createEntityManager();
        consultaSetor = java.beans.Beans.isDesignTime() ? null : GerEntSetor.createQuery("select setor from Setor setor");
        listaSetor = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(consultaSetor.getResultList());
        painel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botPesquisarSetor = new javax.swing.JButton();
        botAlterarSetor = new javax.swing.JButton();
        botExcluirSetor = new javax.swing.JButton();
        botNovoSetor = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSetores = new javax.swing.JTable();
        botFecharPesquisaSetor = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        botCancelaSetor = new javax.swing.JButton();
        botConfirmarSetor = new javax.swing.JButton();

        setClosable(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        botPesquisarSetor.setText("Pesquisar");
        botPesquisarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisarSetorActionPerformed(evt);
            }
        });
        jPanel3.add(botPesquisarSetor);

        botAlterarSetor.setText("Alterar");
        botAlterarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAlterarSetorActionPerformed(evt);
            }
        });
        jPanel3.add(botAlterarSetor);

        botExcluirSetor.setText("Excluir");
        botExcluirSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirSetorActionPerformed(evt);
            }
        });
        jPanel3.add(botExcluirSetor);

        botNovoSetor.setText("Novo");
        botNovoSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoSetorActionPerformed(evt);
            }
        });
        jPanel3.add(botNovoSetor);

        jLabel1.setText("Pesquisa Por Descrição");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaSetor, tabelaSetores);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descrição");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${observacao}"));
        columnBinding.setColumnName("Observação");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabelaSetores);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        botFecharPesquisaSetor.setText("Fechar");
        botFecharPesquisaSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFecharPesquisaSetorActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Manter Setor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 538, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botFecharPesquisaSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botFecharPesquisaSetor)
                .addContainerGap())
        );

        painel.addTab("Pesquisa", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficha de Cadastro de Setores"));

        jLabel2.setText("Descrição");

        jLabel4.setText("Observação");

        observacao.setColumns(20);
        observacao.setRows(5);
        jScrollPane2.setViewportView(observacao);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 423, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        botCancelaSetor.setText("Cancelar");
        botCancelaSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelaSetorActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botCancelaSetor)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancelaSetor)
                    .addComponent(botConfirmarSetor))
                .addGap(39, 39, 39))
        );

        painel.addTab("Cadastro", jPanel2);

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
            this.codigoEditar=setorSelected.getCodigo();
            
            painel.setEnabledAt(1, true);

            painel.setSelectedIndex(1);

            painel.setEnabledAt(0, false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }

       
    }//GEN-LAST:event_botAlterarSetorActionPerformed

    private void botExcluirSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirSetorActionPerformed
        Setor setorSelected;
        int posicao = tabelaSetores.getSelectedRow();
        if (posicao != -1) {
            setorSelected = listaSetor.get(posicao);
            int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n"+setorSelected.getDescricao(), "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                controle.excluir(setorSelected);
                listaSetor.clear();
                listaSetor.addAll(controle.listaSetor());
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
        this.novo = true;
    }//GEN-LAST:event_botNovoSetorActionPerformed

    private void botFecharPesquisaSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFecharPesquisaSetorActionPerformed
        this.dispose();
    }//GEN-LAST:event_botFecharPesquisaSetorActionPerformed

    private void botCancelaSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelaSetorActionPerformed
    painel.setEnabledAt(0, true);
        painel.setSelectedIndex(0);
        painel.setEnabledAt(1, false);
    }//GEN-LAST:event_botCancelaSetorActionPerformed

    private void botConfirmarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfirmarSetorActionPerformed
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

        painel.setSelectedIndex(0);

        painel.setEnabledAt(1, false);
        listaSetor.clear();
        listaSetor.addAll(controle.listaSetor());
    }//GEN-LAST:event_botConfirmarSetorActionPerformed


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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.util.List<Setor> listaSetor;
    private javax.swing.JTextArea observacao;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JTable tabelaSetores;
    private javax.swing.JTextField txtPesquisa;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
