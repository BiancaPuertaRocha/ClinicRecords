package visao.crud;

import Utilidades.LimitedTextField;
import controle.ControleFichaAtendimento;
import controle.ControleFuncionario;
import controle.ControleTipoAtendi;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
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
    private ControleFichaAtendimento controleFicha;

    public ManterTipoAtendi() {
        initComponents();
        controle = new ControleTipoAtendi();
        controleFicha = new ControleFichaAtendimento();
        painel.setEnabledAt(1, false);
         if(ControleFuncionario.getLogado()!= null && !ControleFuncionario.getLogado().getTipo()){
           botNovoTipo.setEnabled(false);
           botExcluirtipo.setEnabled(false);
           botAlterarTipo.setEnabled(false);
        }
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
        botPesquisarTipo = new javax.swing.JButton();
        botAlterarTipo = new javax.swing.JButton();
        botExcluirtipo = new javax.swing.JButton();
        botNovoTipo = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTipo = new javax.swing.JTable();
        botFecharPesquisaTipo = new javax.swing.JButton();
        txttipo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        botCancelaTipo = new javax.swing.JButton();
        botConfirmaTipo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Manter Tipo de Antedimento");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        botPesquisarTipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botPesquisarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search-2-xxl.png"))); // NOI18N
        botPesquisarTipo.setText("Pesquisar");
        botPesquisarTipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botPesquisarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisarTipoActionPerformed(evt);
            }
        });
        jPanel3.add(botPesquisarTipo);

        botAlterarTipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botAlterarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alter.png"))); // NOI18N
        botAlterarTipo.setText("Alterar");
        botAlterarTipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botAlterarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAlterarTipoActionPerformed(evt);
            }
        });
        jPanel3.add(botAlterarTipo);

        botExcluirtipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botExcluirtipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        botExcluirtipo.setText("Excluir");
        botExcluirtipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botExcluirtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirtipoActionPerformed(evt);
            }
        });
        jPanel3.add(botExcluirtipo);

        botNovoTipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botNovoTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        botNovoTipo.setText("Novo");
        botNovoTipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botNovoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoTipoActionPerformed(evt);
            }
        });
        jPanel3.add(botNovoTipo);

        txtPesquisa.setBackground(new java.awt.Color(240, 240, 240));
        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPesquisa.setBorder(null);
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Pesquisa Por Descrição");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        tabelaTipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabelaTipo.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaTipo, tabelaTipo);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${observacao}"));
        columnBinding.setColumnName("Observacao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabelaTipo);
        if (tabelaTipo.getColumnModel().getColumnCount() > 0) {
            tabelaTipo.getColumnModel().getColumn(0).setResizable(false);
            tabelaTipo.getColumnModel().getColumn(1).setResizable(false);
            tabelaTipo.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );

        botFecharPesquisaTipo.setText("Fechar");
        botFecharPesquisaTipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botFecharPesquisaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFecharPesquisaTipoActionPerformed(evt);
            }
        });

        txttipo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txttipo.setText("Manter Tipo de Atendimento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botFecharPesquisaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttipo)
                            .addComponent(jLabel1)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botFecharPesquisaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painel.addTab("Pesquisa", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ficha de Cadastro de Tipos de Atendimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Descrição");

        descricao.setDocument(new LimitedTextField(50));
        descricao.setBackground(new java.awt.Color(240, 240, 240));
        descricao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        descricao.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Observações");

        observacao.setDocument(new LimitedTextField(100));
        observacao.setBackground(new java.awt.Color(240, 240, 240));
        observacao.setColumns(20);
        observacao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        observacao.setRows(5);
        jScrollPane2.setViewportView(observacao);

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        botCancelaTipo.setBackground(new java.awt.Color(255, 204, 204));
        botCancelaTipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botCancelaTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        botCancelaTipo.setText("Cancelar");
        botCancelaTipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botCancelaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelaTipoActionPerformed(evt);
            }
        });

        botConfirmaTipo.setBackground(new java.awt.Color(204, 255, 204));
        botConfirmaTipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botConfirmaTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/confirm.png"))); // NOI18N
        botConfirmaTipo.setText("Confirmar");
        botConfirmaTipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botConfirmaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfirmaTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botConfirmaTipo)
                        .addGap(18, 18, 18)
                        .addComponent(botCancelaTipo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancelaTipo)
                    .addComponent(botConfirmaTipo))
                .addContainerGap(77, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(this, "Selecione um setor!");
        }

    }//GEN-LAST:event_botAlterarTipoActionPerformed

    private void botExcluirtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirtipoActionPerformed
        TipoAtendi tipoSelected;
        int posicao = tabelaTipo.getSelectedRow();
        if (posicao != -1) {
            tipoSelected = listaTipo.get(posicao);
            if(controleFicha.pesquisaFichaAtendimentoTipoAtend(tipoSelected).isEmpty()){
            int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n"+tipoSelected.getDescricao(), "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                controle.excluir(tipoSelected);
                listaTipo.clear();
                listaTipo.addAll(controle.listaTipo());
            }
            }else {
                  JOptionPane.showMessageDialog(this, "Este tipo de atendimento está associado a um outro registro!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor!");
        }
    }//GEN-LAST:event_botExcluirtipoActionPerformed

    private void botPesquisarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPesquisarTipoActionPerformed
       String pesquisa;
        listaTipo.clear();
        pesquisa = txtPesquisa.getText();
        listaTipo.addAll(controle.pesquisaTipo(pesquisa));
    }//GEN-LAST:event_botPesquisarTipoActionPerformed

    private void botConfirmaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfirmaTipoActionPerformed
        if(!descricao.getText().isEmpty() && !observacao.getText().isEmpty()){
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
        }else {
          JOptionPane.showMessageDialog(this, "Há um campro vazio!");
        }
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.util.List<TipoAtendi> listaTipo;
    private javax.swing.JTextArea observacao;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JTable tabelaTipo;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JLabel txttipo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
