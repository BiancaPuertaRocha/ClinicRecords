package visao;

import controle.ControleTipoAtendi;
import modelo.TipoAtendi;
import javax.swing.JOptionPane;

/**
 *
 * @author Bianca
 */
public class ManterTipoAtendi extends javax.swing.JInternalFrame {

    private boolean novo = false;
    private int codigoEditar;
    private ControleTipoAtendi controle;

    public ManterTipoAtendi() {
        initComponents();
        controle = new ControleTipoAtendi();
        painel.setEnabledAt(1, false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        gerEnt = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ClinicRecordsPU").createEntityManager();
        consultaTipo = java.beans.Beans.isDesignTime() ? null : gerEnt.createQuery("select tipo from TipoAtendi tipo");
        listaTipo = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(consultaTipo.getResultList());
        painel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botAlterarTipo = new javax.swing.JButton();
        botExcluirtipo = new javax.swing.JButton();
        botPesquisarTipo = new javax.swing.JButton();
        botNovoTipo = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTipo = new javax.swing.JTable();
        botFecharPesquisaTipo = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        botCancelaTipo = new javax.swing.JButton();
        botConfirmaTipo = new javax.swing.JButton();

        setClosable(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        botAlterarTipo.setText("Alterar");
        botAlterarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAlterarTipoActionPerformed(evt);
            }
        });
        jPanel3.add(botAlterarTipo);

        botExcluirtipo.setText("Excluir");
        botExcluirtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirtipoActionPerformed(evt);
            }
        });
        jPanel3.add(botExcluirtipo);

        botPesquisarTipo.setText("Pesquisar");
        botPesquisarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisarTipoActionPerformed(evt);
            }
        });
        jPanel3.add(botPesquisarTipo);

        botNovoTipo.setText("Novo");
        botNovoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoTipoActionPerformed(evt);
            }
        });
        jPanel3.add(botNovoTipo);

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisa Por Descrição");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaTipo, tabelaTipo);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${observacao}"));
        columnBinding.setColumnName("Observacao");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabelaTipo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        botFecharPesquisaTipo.setText("Fechar");
        botFecharPesquisaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFecharPesquisaTipoActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Manter Tipo de Atendimento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 619, Short.MAX_VALUE)
                                .addComponent(botFecharPesquisaTipo))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botFecharPesquisaTipo)
                .addContainerGap())
        );

        painel.addTab("Pesquisa", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficha de Cadastro de Tipos de Atendimento"));

        jLabel2.setText("Descrição");

        jLabel3.setText("Observações");

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
                    .addComponent(descricao)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        botCancelaTipo.setText("Cancelar");
        botCancelaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelaTipoActionPerformed(evt);
            }
        });

        botConfirmaTipo.setText("Confirmar");
        botConfirmaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfirmaTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(518, Short.MAX_VALUE)
                .addComponent(botConfirmaTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botCancelaTipo)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botConfirmaTipo)
                    .addComponent(botCancelaTipo))
                .addGap(24, 24, 24))
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

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void botFecharPesquisaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFecharPesquisaTipoActionPerformed
        this.dispose();
    }//GEN-LAST:event_botFecharPesquisaTipoActionPerformed

    private void botCancelaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelaTipoActionPerformed
        painel.setEnabledAt(0, true);
        painel.setSelectedIndex(0);
        painel.setEnabledAt(1, false);
    }//GEN-LAST:event_botCancelaTipoActionPerformed

    private void botNovoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNovoTipoActionPerformed
        this.novo = true;
         descricao.setText("");
        observacao.setText("");
        painel.setEnabledAt(1, true);
        painel.setSelectedIndex(1);
        painel.setEnabledAt(0, false);
        
    }//GEN-LAST:event_botNovoTipoActionPerformed

    private void botAlterarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAlterarTipoActionPerformed
       this.novo = false;
        TipoAtendi tipoSelected;
        int posicao;
        posicao = tabelaTipo.getSelectedRow();
        if (posicao != -1) {
            tipoSelected = listaTipo.get(posicao);
            descricao.setText(tipoSelected.getDescricao());
            observacao.setText(tipoSelected.getObservacao());
            this.codigoEditar=tipoSelected.getCodigo();
            painel.setEnabledAt(1, true);
            painel.setSelectedIndex(1);
            painel.setEnabledAt(0, false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }

    }//GEN-LAST:event_botAlterarTipoActionPerformed

    private void botExcluirtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirtipoActionPerformed
        TipoAtendi tipoSelected;
        int posicao = tabelaTipo.getSelectedRow();
        if (posicao != -1) {
            tipoSelected = listaTipo.get(posicao);
            int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n"+tipoSelected.getDescricao(), "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                controle.excluir(tipoSelected);
                listaTipo.clear();
                listaTipo.addAll(controle.listaTipo());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }
    }//GEN-LAST:event_botExcluirtipoActionPerformed

    private void botPesquisarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPesquisarTipoActionPerformed
       String pesquisa;
        listaTipo.clear();
        pesquisa = txtPesquisa.getText();
        listaTipo.addAll(controle.pesquisaTipo(pesquisa));
    }//GEN-LAST:event_botPesquisarTipoActionPerformed

    private void botConfirmaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfirmaTipoActionPerformed
        TipoAtendi tipo;
        tipo = new TipoAtendi();
        tipo.setDescricao(descricao.getText());
        tipo.setObservacao(observacao.getText());   
        if (this.novo) {
            controle.adicionar(tipo);
        } else {
            tipo.setCodigo(codigoEditar);
            controle.alterar(tipo);
        }
        painel.setEnabledAt(0, true);
        painel.setSelectedIndex(0);
        painel.setEnabledAt(1, false);
        listaTipo.clear();
        listaTipo.addAll(controle.listaTipo());        
    }//GEN-LAST:event_botConfirmaTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAlterarTipo;
    private javax.swing.JButton botCancelaTipo;
    private javax.swing.JButton botConfirmaTipo;
    private javax.swing.JButton botExcluirtipo;
    private javax.swing.JButton botFecharPesquisaTipo;
    private javax.swing.JButton botNovoTipo;
    private javax.swing.JButton botPesquisarTipo;
    private javax.persistence.Query consultaTipo;
    private javax.swing.JTextField descricao;
    private javax.persistence.EntityManager gerEnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.util.List<TipoAtendi> listaTipo;
    private javax.swing.JTextArea observacao;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JTable tabelaTipo;
    private javax.swing.JTextField txtPesquisa;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
