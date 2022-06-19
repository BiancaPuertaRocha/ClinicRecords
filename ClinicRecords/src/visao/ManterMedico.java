/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleMedico;
import modelo.Medico;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ManterMedico extends javax.swing.JInternalFrame {

    private boolean novo =false ;
    private ControleMedico controle;
    private int codigoEditar;

    public ManterMedico() {
        initComponents();
        controle = new ControleMedico();
        painel.setEnabledAt(1, false);
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
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeMed = new javax.swing.JTextField();
        cidadeMed = new javax.swing.JTextField();
        cpfMed = new javax.swing.JTextField();
        rgMed = new javax.swing.JTextField();
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
        botCancelarMedico = new javax.swing.JButton();
        botConfirmarMedico = new javax.swing.JButton();

        setClosable(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        jLabel14.setText("Pesquisar por nome ou CRM");

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        botPesquisaMedico.setText("Pesquisar");
        botPesquisaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisaMedicoActionPerformed(evt);
            }
        });
        jPanel6.add(botPesquisaMedico);

        botAlterarMedico.setText("Alterar");
        botAlterarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAlterarMedicoActionPerformed(evt);
            }
        });
        jPanel6.add(botAlterarMedico);

        botExcluirMedico.setText("Excluir");
        botExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirMedicoActionPerformed(evt);
            }
        });
        jPanel6.add(botExcluirMedico);

        botNovoMedico.setText("Novo");
        botNovoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoMedicoActionPerformed(evt);
            }
        });
        jPanel6.add(botNovoMedico);

        botFecharPesquisaMedico.setText("Fechar");
        botFecharPesquisaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFecharPesquisaMedicoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Manter Médico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel15)
                .addContainerGap(360, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botFecharPesquisaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botFecharPesquisaMedico)
                .addGap(21, 21, 21))
        );

        painel.addTab("Pesquisa", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficha de Cadastro de Médicos"));

        jLabel1.setText("Nome");

        jLabel2.setText("Cidade");

        jLabel3.setText("UF");

        jLabel4.setText("RG");

        jLabel5.setText("CPF");

        cidadeMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeMedActionPerformed(evt);
            }
        });

        rgMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgMedActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço");

        ufMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        jLabel7.setText("Nome de Usuário");

        nomeUserMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUserMedActionPerformed(evt);
            }
        });

        jLabel8.setText("Senha");

        jLabel9.setText("CRM");

        crmMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crmMedActionPerformed(evt);
            }
        });

        jLabel10.setText("Data de Nascimento");

        jLabel11.setText("Telefone");

        jLabel12.setText("Especialidade");

        especialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadeActionPerformed(evt);
            }
        });

        jLabel13.setText("E-mail");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero Atendimentos"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(maxatendi, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maxatendi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel16.setText("Bairro");

        jLabel17.setText("Confirma Senha");

        jLabel18.setText("Nome do Pai");

        jLabel19.setText("Nome da Mãe");

        jLabel20.setText("Profissão");

        jLabel21.setText("Cartão SUS");

        jLabel22.setText("Estado Civil");

        estCiv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Divorciado(a)" }));

        sexMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));

        jLabel23.setText("Sexo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(emailMed, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(144, 144, 144)
                            .addComponent(jLabel4))
                        .addComponent(endMed, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomeUserMed, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(crmMed, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(senhaMed, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(confirmaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                        .addComponent(nomeMed, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(cpfMed, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rgMed)))
                    .addComponent(jLabel13))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profissao)
                                    .addComponent(sexMed, 0, 215, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel23))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nomeMae, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(especialidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bairroMed, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cidadeMed)))
                            .addComponent(nomePai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(telMed, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cartSus))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ufMed, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel21)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(estCiv, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(dataMed, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(37, 37, 37))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpfMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rgMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nomeMae, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(7, 7, 7)
                        .addComponent(endMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bairroMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nomeUserMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ufMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dataMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(senhaMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(confirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cartSus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crmMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estCiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        botCancelarMedico.setText("Cancelar");
        botCancelarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarMedicoActionPerformed(evt);
            }
        });

        botConfirmarMedico.setText("Confirmar");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botConfirmarMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botCancelarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancelarMedico)
                    .addComponent(botConfirmarMedico))
                .addGap(24, 24, 24))
        );

        painel.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
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
            this.codigoEditar=medicoSelected.getCodigo();
            nomeMed.setText(medicoSelected.getNome());
            nomeUserMed.setText(medicoSelected.getNomeuser());
            cpfMed.setText(medicoSelected.getCpf());
            cidadeMed.setText(medicoSelected.getCidade());
            int x=0;
            for (int y =0; y < ufMed.getItemCount();y++){
                if (ufMed.getItemAt(y).equals(medicoSelected.getUf())){
                    x=y;
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
            int s=0;
            for (int y = 0; y < sexMed.getItemCount(); y++) {
                if (sexMed.getItemAt(y).equals(medicoSelected.getSexo())) {
                    s = y;
                }
            }
            sexMed.setSelectedIndex(s);
            int est =0;
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
        try {
            telMed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));

        } catch (ParseException ex) {
            Logger.getLogger(ManterMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void rgMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgMedActionPerformed
       
    }//GEN-LAST:event_rgMedActionPerformed

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
        if(senhaMed.getText().equals(confirmaSenha.getText())){
        Medico medico;
        medico = new Medico();
        medico.setNomeuser(nomeUserMed.getText());
        medico.setCrm(crmMed.getText());
        medico.setEspecialidade(especialidade.getText());
        medico.setSenha(senhaMed.getUIClassID());
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
        if (this.novo) {
            controle.adicionar(medico);
        } else {
            medico.setCodigo(codigoEditar);
            controle.alterar(medico);
        }
        painel.setEnabledAt(0, true);
        painel.setSelectedIndex(0);
        painel.setEnabledAt(1, false);
        listaMedico.clear();
        listaMedico.addAll(controle.listaMedico());
        }else {
            JOptionPane.showMessageDialog(this, "Confirmação de senha incorreta!");
        }
    }//GEN-LAST:event_botConfirmarMedicoActionPerformed

    private void botExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirMedicoActionPerformed
       Medico medicoSelected;
        int posicao = tabelaMedicos.getSelectedRow();
        if (posicao != -1) {
            medicoSelected = listaMedico.get(posicao);
            int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n"+medicoSelected.getNome(), "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                controle.excluir(medicoSelected);
                listaMedico.clear();
                listaMedico.addAll(controle.listaMedico());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }
    }//GEN-LAST:event_botExcluirMedicoActionPerformed

    private void especialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadeActionPerformed


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
    private javax.swing.JTextField cpfMed;
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
    private java.util.List<Medico> listaMedico;
    private javax.swing.JFormattedTextField maxatendi;
    private javax.swing.JTextField nomeMae;
    private javax.swing.JTextField nomeMed;
    private javax.swing.JTextField nomePai;
    private javax.swing.JTextField nomeUserMed;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JTextField profissao;
    private javax.swing.JTextField rgMed;
    private javax.swing.JPasswordField senhaMed;
    private javax.swing.JComboBox<String> sexMed;
    private javax.swing.JTable tabelaMedicos;
    private javax.swing.JFormattedTextField telMed;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JComboBox<String> ufMed;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
